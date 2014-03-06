using System;
using System.Collections.Generic;
using System.Xml;
using System.Xml.Serialization;
using NGForms.Core.Fields;
using NGForms.Core.Validators.Util;
using System.IO;
using System.Text.RegularExpressions;

namespace NGForms.Core
{
    [Serializable]
    [XmlRootAttribute("section")]
    public sealed class NgFormSection : IXmlSerializable
    {
        private const String DefaultName = "New Section";

        private String _title;
        private List<INgField> _fields;

        public NgFormSection()
            : this(DefaultName)
        {
        }

        public NgFormSection(String title)
        {
            this._title = title;
            _fields = new List<INgField>();
        }

        public String Title
        {
            get { return _title; }
            set { _title = value; }
        }

        public List<INgField> Fields
        {
            get { return _fields; }
        }

        public System.Xml.Schema.XmlSchema GetSchema()
        {
            throw new NotImplementedException();
        }

        public void ReadXml(System.Xml.XmlReader reader)
        {
            while (reader.Read())
            {
                if (reader.Name == "section" && reader.NodeType == XmlNodeType.EndElement)
                {
                    reader.Read();
                    break;
                }

                if (reader.NodeType == XmlNodeType.Element)
                {
                    if (reader.Name == "title")
                    {
                        Title = reader.ReadElementString("title");
                    }
                    else if (reader.Name == "fields")
                    {
                        string xml = reader.ReadOuterXml().Trim();
                        ReadFieldsXml(xml);
                    }
                }
            }
        }

        public void WriteXml(System.Xml.XmlWriter writer)
        {
            writer.WriteElementString("title", Title);

            writer.WriteStartElement("fields");

            foreach (NgFieldBase field in Fields)
            {
                writer.WriteStartElement(field.FieldType.ToString() + "Field");
                string inner = XmlHelper.GetInnerXmlElement(field, field.GetType(), new Type[] { });
                writer.WriteRaw(inner);
                writer.WriteEndElement();
            }

            writer.WriteEndElement();
        }

        private void ReadFieldsXml(string xml)
        {
            XmlTextReader xtr = new XmlTextReader(new StringReader(xml));

            while (xtr.Read())
            {
                if (xtr.NodeType == XmlNodeType.Element)
                {
                    // Remove the Field that we added to it from WriteXml
                    string fieldName = xtr.Name.Substring(0, xtr.Name.Length - 5);

                    try
                    {
                        NgFieldType ft = (NgFieldType)Enum.Parse(typeof(NgFieldType), fieldName);
                        Type t = FieldClassFactory.CreateField(ft).GetType();
                        NgFieldBase field = XmlHelper.ParseInnerXmlElement(xtr.ReadInnerXml(), t) as NgFieldBase;
                        field.FieldType = ft;

                        if (field != null)
                        {
                            Fields.Add(field);
                        }
                    }
                    catch
                    {
                    }
                }
            }
        }
    }
}
