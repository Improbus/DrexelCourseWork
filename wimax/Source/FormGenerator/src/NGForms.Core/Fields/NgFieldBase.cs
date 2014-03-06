using System;
using System.Collections.Generic;
using System.Xml.Serialization;
using NGForms.Core.Validators;
using NGForms.Core.Validators.Util;

namespace NGForms.Core.Fields
{
    [Serializable]
    public class NgFieldBase : INgField, IXmlSerializable
    {
        private string _label;
        private string _value;
        private NgFieldType _fieldType = NgFieldType.Unknown;
        private List<ValidatorTypes> _validators = new List<ValidatorTypes>();

        public string Value
        {
            get { return _value; }
            set { _value = value; }
        }

        public string Label
        {
            get { return _label; }
            set { _label = value; }
        }

        public virtual NgFieldType FieldType
        {
            get { return _fieldType; }
            set { _fieldType = value; }
        }

        [XmlArray("validators")]
        [XmlArrayItem("validator")]
        public List<ValidatorTypes> Validator
        {
            get { return _validators; }
        }

        public void WriteXml(System.Xml.XmlWriter writer)
        {
            writer.WriteElementString("label", Label);
            writer.WriteElementString("value", Value);

            writer.WriteStartElement("validator");
            string inner = XmlHelper.GetInnerXmlElement(Validator, typeof(List<ValidatorTypes>), new Type[] { });
            writer.WriteRaw(inner);
            writer.WriteEndElement();
        }

        public System.Xml.Schema.XmlSchema GetSchema()
        {
            throw new NotImplementedException();
        }

        public void ReadXml(System.Xml.XmlReader reader)
        {
            reader.Read(); // Type attribute

            Label = reader.ReadElementString("label");
            Value = reader.ReadElementString("value");
        }
    }
}
