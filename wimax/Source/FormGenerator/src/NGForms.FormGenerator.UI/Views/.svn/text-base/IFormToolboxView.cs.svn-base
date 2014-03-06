using System;
using System.Collections.Generic;
using System.Text;
using NGForms.Core;

namespace NGForms.FormGenerator.UI.Views
{
    public interface IFormToolboxView
    {
        IFormCanvasView CanvasInstance { get; set; }
    }

    internal sealed class FileEventArgs : EventArgs
    {
        public string Filename { get; set; }
    }

    public sealed class InputEventArgs : EventArgs
    {
        public NgFieldType FieldType { get; set; }
    }
}
