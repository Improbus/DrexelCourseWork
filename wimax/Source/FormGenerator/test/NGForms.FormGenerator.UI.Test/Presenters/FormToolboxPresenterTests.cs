using NUnit.Framework;
using NGForms.FormGenerator.UI.Presenter;
using NGForms.FormGenerator.UI.Views;
using Moq;
using NGForms.FormGenerator.Infrastructure.Core;

namespace NGForms.FormGenerator.UI.Test.Presenters
{
    [TestFixture]
    public class FormToolboxPresenterTests
    {
        [Test]
        public void OpenFileEventBinding()
        {
            bool fileOpened =false;

            var mockView = new Mock<IFormToolboxView>();
            //mockView.Raise(m => m.OpenFile += null, string.Empty);
            //FormToolboxPresenter presenter = new FormToolboxPresenter(mockView.Object);

            Assert.IsTrue(fileOpened);
        }
    }
}
