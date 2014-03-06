using System;
using System.Collections.Generic;
using System.Windows.Forms;
using NGForms.Core;
using NGForms.FormGenerator.UI.Presenters;
using NGForms.FormGenerator.UI.Views;
using NGForms.FormGenerator.WinForms.Widgets;
using WeifenLuo.WinFormsUI.Docking;

namespace NGForms.FormGenerator.WinForms
{
    public partial class FormBuilderCanvas : DockContent, IFormCanvasView
    {
        private IFieldView _selectedField;

        public static FormSectionWidget CreateNewViewSection()
        {
            FormSectionWidget sectionView = new FormSectionWidget();
            sectionView.Padding = new Padding(6);
            sectionView.Dock = DockStyle.Fill;
            return sectionView;
        }

        public FormBuilderCanvas()
        {
            InitializeComponent();
        }

        public event EventHandler SelectedChanged;
        public event EventHandler SectionChanged;
        public event EventHandler NewSectionClick;
        public event EventHandler PreviousSectionClick;
        public event EventHandler NextSectionClick;

        public IFieldView Selected
        {
            get { return _selectedField; }
        }

        public CanvasCreateFactoryDelegate CanvasCreationMethod
        {
            get { return FormBuilderCanvas.CreateNewViewSection; }
        }

        public IFormSectionView CurrentSection
        {
            get
            {
                return flowLayoutPanel1.Controls[0] as FormSectionWidget;
            }
            set
            {
                FormSectionWidget widget = value as FormSectionWidget;
                if (widget == null) return;

                widget.FieldSelected += new EventHandler<FieldViewEventArgs>(OnFieldSelected);
                flowLayoutPanel1.Controls.Clear();
                flowLayoutPanel1.Controls.Add(widget);

                if (SectionChanged != null)
                {
                    SectionChanged(this, EventArgs.Empty);
                }
            }
        }

        public string SectionPageText
        {
            get { return sectionPagelabel.Text; }
            set { sectionPagelabel.Text = value; }
        }

        private void Canvas_SizeChanged(object sender, System.EventArgs e)
        {
            foreach (Control c in flowLayoutPanel1.Controls)
            {
                FormSectionWidget widget = c as FormSectionWidget;
                if (widget != null)
                {
                    widget.ResizeAll();
                }
            }
        }

        private void OnFieldSelected(object sender, FieldViewEventArgs e)
        {
            if (_selectedField != null)
            {
                _selectedField.Selected = false;
            }

            e.Filed.Selected = true;
            _selectedField = e.Filed;

            if (SelectedChanged != null)
            {
                SelectedChanged(this, EventArgs.Empty);
            }
        }

        private void NewSectionButton_Click(object sender, EventArgs e)
        {
            if (NewSectionClick != null)
            {
                NewSectionClick(this, EventArgs.Empty);
            }
        }

        private void PreviousButton_Click(object sender, EventArgs e)
        {
            if (PreviousSectionClick != null)
            {
                PreviousSectionClick(this, EventArgs.Empty);
            }
        }

        private void NextButton_Click(object sender, EventArgs e)
        {
            if (NextSectionClick != null)
            {
                NextSectionClick(this, EventArgs.Empty);
            }
        }
    }
}
