using System;
using System.Windows.Forms;
using NGForms.Core;
using NGForms.Core.Fields;
using NGForms.FormGenerator.UI.Views;

namespace NGForms.FormGenerator.WinForms.Widgets
{
    public partial class FormSectionWidget : UserControl, IFormSectionView
    {
        public event EventHandler<NgInputTypeEventArgs> FieldTypeDragged;
        public event EventHandler<NgInputObjectEventArgs> FieldAdded;
        public event EventHandler<NgInputObjectEventArgs> FieldRemoved;
        public event EventHandler<FieldViewEventArgs> FieldSelected;
        public event EventHandler<FieldPositionChangedEventArgs> FieldPositionChanged;

        public FormSectionWidget()
        {
            InitializeComponent();
        }

        public IFieldView AddField(NgFieldType fieldType)
        {
            FieldUserControlBase field = null;

            switch (fieldType)
            {
                case NgFieldType.Date:
                    field = new DateFieldWidget();
                    break;
                case NgFieldType.LongText:
                    field = new LongTextFieldWidget();
                    break;
                case NgFieldType.MultipleChoice:
                    field = new MultipleChoiceFieldWidget();
                    break;
                case NgFieldType.Number:
                    field = new NumberFieldWidget();
                    break;
                case NgFieldType.Text:
                    field = new TextFieldWidget();
                    break;
                case NgFieldType.Checkbox:
                    field = new CheckboxWidget();
                    break;
                default:
                    return null ;
            }

            AttachEvents(field);
            if (FieldAdded != null)
            {
                FieldAdded(this, new NgInputObjectEventArgs { FieldObject = field.FieldObject });
            }
            return field;
        }

        public IFieldView AddField(INgField fieldObject)
        {
            FieldUserControlBase field = null;

            switch (fieldObject.FieldType)
            {
                case NgFieldType.Date:
                    field = new DateFieldWidget(fieldObject);
                    break;
                case NgFieldType.LongText:
                    field = new LongTextFieldWidget(fieldObject);
                    break;
                case NgFieldType.MultipleChoice:
                    field = new MultipleChoiceFieldWidget(fieldObject);
                    break;
                case NgFieldType.Number:
                    field = new NumberFieldWidget(fieldObject);
                    break;
                case NgFieldType.Text:
                    field = new TextFieldWidget(fieldObject);
                    break;
                case NgFieldType.Checkbox:
                    field = new CheckboxWidget(fieldObject);
                    break;
                default:
                    return null;
            }

            AttachEvents(field);
            return field;
        }

        private void AttachEvents(FieldUserControlBase field)
        {
            field.MouseClick +=
                (s, e) =>
                {
                    if (FieldSelected != null)
                    {
                        FieldSelected(this, new FieldViewEventArgs { Filed = field });
                    }
                };
            field.Disposed +=
                (s, e) =>
                {
                    flowLayoutPanel1.Controls.Remove(field);
                    if (FieldRemoved != null)
                    {
                        FieldRemoved(this, new NgInputObjectEventArgs { FieldObject = field.FieldObject });
                    }
                };
            field.SwapRequested += new EventHandler<FieldControlSwapEventArgs>(OnSwapRequested);
            field.CreateFieldRequested += new EventHandler<FieldControlSwapEventArgs>(OnCreateFieldRequested);

            flowLayoutPanel1.Controls.Add((Control)field);
            ResizeAll();
        }

        public void FinalInitialize()
        {
            if (FormGeneratorApplication.View == null) return;

            this.label1.DataBindings.Clear();
            this.label1.DataBindings.Add("Text", FormGeneratorApplication.View.Canvas.CurrentSection, "Title");
        }

        internal void ResizeAll()
        {
            // Resize Layout
            int calculatedHeight = GetHeightOfAllControls(this.flowLayoutPanel1);
            calculatedHeight += 60; // Add 40 to make region to drag and drop
            this.flowLayoutPanel1.Height = calculatedHeight;

            // Resize Control
            calculatedHeight += label1.Height + label1.Margin.Vertical + label1.Padding.Vertical;
            this.Height = calculatedHeight + 40; // TODO: Magic Number

            // Resize this control's width and all children controls widths
            int partentWidth = this.Parent == null ? 0 : this.Parent.Width;
            this.Width = partentWidth - this.Margin.Horizontal - this.Padding.Horizontal;

            foreach (Control widget in this.flowLayoutPanel1.Controls)
            {
                widget.Width = widget.Parent.Width - widget.Parent.Margin.Horizontal - widget.Padding.Horizontal - this.Margin.Horizontal - this.Padding.Horizontal;
            }
        }

        private void CanvasPanel_DragOver(object sender, DragEventArgs e)
        {
            if (e.Data.GetDataPresent(typeof(NgFieldType)))
            {
                e.Effect = DragDropEffects.All;
            }
        }

        private void CanvasPanel_DragDrop(object sender, DragEventArgs e)
        {
            if (e.Data.GetDataPresent(typeof(NgFieldType)))
            {
                NgFieldType field = (NgFieldType)e.Data.GetData(typeof(NgFieldType));
                if (FieldTypeDragged != null)
                {
                    FieldTypeDragged(this, new NgInputTypeEventArgs { Field = field });
                }
            }
        }

        private void OnSwapRequested(object sender, FieldControlSwapEventArgs e)
        {
            if (!flowLayoutPanel1.Contains(e.Field1) || !flowLayoutPanel1.Contains(e.Field2))
            {
                return;
            }

            int newPosition = flowLayoutPanel1.Controls.GetChildIndex(e.Field1, true);
            flowLayoutPanel1.Controls.SetChildIndex(e.Field2, newPosition);

            if (FieldPositionChanged != null)
            {
                FieldPositionChanged(this, new FieldPositionChangedEventArgs
                {
                    FieldObject1 = e.Field1.FieldObject,
                    FieldObject2 = e.Field2.FieldObject
                });
            }
        }

        private void OnCreateFieldRequested(object sender, FieldControlSwapEventArgs e)
        {
            // HACK! Invoke the FieldTypeDragged event
            NgInputTypeEventArgs args = new NgInputTypeEventArgs { Field = e.FieldType2 };
            FieldTypeDragged(this, args);
            e.Field2 = args.CreatedFieldView as FieldUserControlBase;
        }

        private int GetHeightOfAllControls(Control control)
        {
            int height = 0;
            foreach (Control c in control.Controls)
            {
                height += c.Height + c.Margin.Vertical + c.Padding.Vertical;
            }
            return height;
        }
    }
}
