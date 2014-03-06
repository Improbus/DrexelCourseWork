using System;
using System.Collections.Generic;
using System.Xml.Serialization;

namespace NGForms.Core
{
    [Serializable]
    [XmlRootAttribute("ngform")]
    public sealed class NgForm
    {
        private const String DefaultName = "UNTITLED";

        private String name;
        private List<NgFormSection> sections;

        public NgForm()
            : this(DefaultName)
        {
        }

        public NgForm(String name)
        {
            sections = new List<NgFormSection>();
            this.name = name;
        }

        [XmlElementAttribute("name")]
        public String Name
        {
            get { return name; }
            set { name = value; }
        }

        [XmlArray("sections")]
        [XmlArrayItem("section")]
        public List<NgFormSection> Sections
        {
            get { return sections; }
        }
    }
}
