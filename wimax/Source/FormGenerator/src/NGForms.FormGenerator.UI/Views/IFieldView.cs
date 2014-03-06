using System;
using System.Collections.Generic;
using System.Text;
using NGForms.Core.Fields;

namespace NGForms.FormGenerator.UI.Views
{
    public interface IFieldView
    {
        INgField FieldObject { get; }
        string FieldLabel { get; set; }
        string Value { get; }
        bool Selected { get; set; }
    }
}
