using System;
using System.Collections.Generic;
using System.Xml.Serialization;
using NGForms.Core.Fields.Attributes;
using NGForms.Core.Validators.Util;

namespace NGForms.Core.Fields
{
    [Serializable]
    public class MultipleChoiceField : NgFieldBase, IXmlSerializable
    {
        private List<String> _choices;

        public MultipleChoiceField()
            : base()
        {
            _choices = new List<string>();
            _choices.Add("Choice A");
            _choices.Add("Choice B");
        }

        public event EventHandler ChoicesChanged;

        [FieldProperty]
        public List<String> Choices
        {
            get
            {
                return _choices;
            }
            set
            {
                _choices = value;
                if (ChoicesChanged != null)
                {
                    ChoicesChanged(this, EventArgs.Empty);
                }
            }
        }

        [FieldProperty]
        public bool IsGPS { get; set; }

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

            writer.WriteStartElement("choices");
            string inner = XmlHelper.GetInnerXmlElement(Choices, typeof(List<String>), new Type[] { });
            writer.WriteRaw(inner);
            writer.WriteEndElement();

            writer.WriteElementString("isGps", IsGPS.ToString().ToLower());
        }

        #endregion
    }
}
