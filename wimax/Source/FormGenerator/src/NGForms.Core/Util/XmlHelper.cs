using System;
using System.Collections.Generic;
using System.Text;
using System.IO;
using System.Xml;
using System.Xml.Serialization;
using NGForms.Core.Fields;

namespace NGForms.Core.Validators.Util
{
    public static class XmlHelper
    {
        public static NgForm Deserialize(string xmlStr)
        {
            byte[] byteArray = Encoding.ASCII.GetBytes(xmlStr);
            using (MemoryStream stream = new MemoryStream(byteArray))
            {
                using (var xmlReader = XmlTextReader.Create(stream))
                {
                    NgForm form = (NgForm)new XmlSerializer(
                        typeof(NgForm),
                        new Type[] {
                                typeof(NgFormSection),
                                typeof(NgFieldBase),
                            }).Deserialize(xmlReader);

                    return form;
                }
            }
        }

        public static string Serialize(NgForm form)
        {
            using (MemoryStream stream = new MemoryStream(2048))
            {
                using (var xmlWriter =
                    XmlTextWriter.Create(stream,
                        new XmlWriterSettings()
                        {
                            OmitXmlDeclaration = true,
                            Encoding = new UTF8Encoding(false),
                            Indent = true
                        }))
                {
                    new XmlSerializer(
                                typeof(NgForm),
                                new Type[] {
                                typeof(NgFormSection),
                                typeof(NgFieldBase),
                            }).Serialize(stream, form);

                    return new UTF8Encoding(false).GetString(stream.ToArray());
                }
            }
        }

        public static string GetInnerXmlElement(object element, Type type, Type[] types)
        {
            using (MemoryStream stream = new MemoryStream(2048))
            {
                using (var xmlWriter =
                    XmlTextWriter.Create(stream,
                        new XmlWriterSettings()
                        {
                            OmitXmlDeclaration = true,
                            Encoding = new UTF8Encoding(false),
                            Indent = true
                        }))
                {
                    XmlSerializer xs = new XmlSerializer(
                        type,
                        types);

                    xs.Serialize(stream, element);

                    // Load the inner xml
                    XmlDocument xmlDoc = new XmlDocument();
                    stream.Position = 0;
                    xmlDoc.Load(stream);
                    return xmlDoc.DocumentElement.InnerXml;
                }
            }
        }

        public static object ParseInnerXmlElement(string innerXml, Type type)
        {
            string truexml = string.Format("<{0}>{1}</{0}>", type.Name, innerXml);
            XmlSerializer xs = new XmlSerializer(type);
            return xs.Deserialize(new StringReader(truexml));
        }
    }
}
