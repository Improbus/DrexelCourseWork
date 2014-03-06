using System;
using System.Collections.Generic;
using System.Text;
using NGForms.FormGenerator.UI.Views;

namespace NGForms.FormGenerator.UI.Presenters
{
    public class FieldPresenter
    {
        private IFieldView _view;

        public FieldPresenter(IFieldView view)
        {
            _view = view;
        }
    }
}
