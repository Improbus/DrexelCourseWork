using System;

namespace NGForms.FormGenerator.UI.Views
{
    public delegate IFormSectionView CanvasCreateFactoryDelegate();

    public interface IFormCanvasView
    {
        event EventHandler SelectedChanged;
        event EventHandler SectionChanged;
        event EventHandler NewSectionClick;
        event EventHandler PreviousSectionClick;
        event EventHandler NextSectionClick;
        CanvasCreateFactoryDelegate CanvasCreationMethod { get; }
        IFormSectionView CurrentSection { get; set; }
        string SectionPageText { get; set; }
        IFieldView Selected { get; }
    }
}
