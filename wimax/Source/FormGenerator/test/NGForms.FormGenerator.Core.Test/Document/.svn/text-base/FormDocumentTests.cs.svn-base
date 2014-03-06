using NUnit.Framework;
using NGForms.FormGenerator.Infrastructure.Document;
using System.IO;

namespace NGForms.FormGenerator.Core.Test.Document
{
    [TestFixture]
    public class FormDocumentTests
    {
        [Test]
        public void FormDeserializeFromFileGetTitle()
        {
            FormDocument form = FormDocument.Deserialize(TestHeleper.GetFormPath("form1.FORM"));
            Assert.AreEqual("Form1", form.Title);
        }
    }
}
