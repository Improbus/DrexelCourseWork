using System;
using System.Collections.Generic;
using System.Text;
using System.Xml.Serialization;
using NGForms.Core.Fields.Attributes;

namespace NGForms.Core.Fields
{
    public class DateField : NgFieldBase, IXmlSerializable
    {
        [FieldProperty]
        public bool PrefillCurrentDate { get; set; }

        #region IXmlSerializable Members

        System.Xml.Schema.XmlSchema IXmlSerializable.GetSchema()
        {
            return base.GetSchema();
        }

        void IXmlSerializable.ReadXml(System.Xml.XmlReader reader)
        {
            base.ReadXml(reader);
        }

        void IXmlSerializable.WriteXml(System.Xml.XmlWriter writer)
        {
            base.WriteXml(writer);
            writer.WriteElementString("prefillCurrentDate", PrefillCurrentDate.ToString().ToLower());
        }

        #endregion
    }
}
