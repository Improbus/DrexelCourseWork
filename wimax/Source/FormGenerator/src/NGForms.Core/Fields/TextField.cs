using System;
using System.Collections.Generic;
using System.Text;
using NGForms.Core.Fields.Attributes;
using System.Xml.Serialization;

namespace NGForms.Core.Fields
{
    [Serializable]
    public class TextField : NgFieldBase, IXmlSerializable
    {
        [FieldProperty]
        public bool IsBardcodeScanable { get; set; }

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
            writer.WriteElementString("isBardcodeScanable", IsBardcodeScanable.ToString().ToLower());
        }

        #endregion
    }
}
