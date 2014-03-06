using System;
using System.IO;
using System.Xml.Serialization;

namespace NGForms.FormGenerator.Infrastructure.Document
{
    [Serializable]
    public class FormDocument
    {
        public static FormDocument Deserialize(string filename)
        {
            XmlSerializer x = new XmlSerializer(typeof(FormDocument));
            using (FileStream fs = new FileStream(filename, FileMode.Open))
            {
                return x.Deserialize(fs) as FormDocument;
            }
        }

        public string Title { get; set; }
    }
}
