using System;
using NGForms.FormGenerator.UI.Views;

namespace NGForms.FormGenerator.UI.Presenter
{
    public class FormToolboxPresenter
    {
        private IFormToolboxView _view;

        public FormToolboxPresenter(IFormToolboxView view)
        {
            _view = view;
        }
    }
}
