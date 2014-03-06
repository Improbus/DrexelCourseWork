using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;
using NGForms.Core;
using NGForms.Core.Fields;
using NGForms.FormGenerator.UI.Views;
using NGForms.FormGenerator.WinForms.Properties;

namespace NGForms.FormGenerator.WinForms.Widgets
{
    public abstract class FieldUserControlBase : UserControl, IFieldView
    {
        protected NgFieldBase _fieldObject;
        private bool _selected = false;

        public FieldUserControlBase(NgFieldType type)
            : this(FieldClassFactory.CreateField(type))
        {
            InitializeComponent();
        }

        public FieldUserControlBase(INgField field)
        {
            _fieldObject = field as NgFieldBase;

            // By default, set the label to the the FieldType
            _fieldObject.Label = FieldType.ToString();

            MenuItem menuItem1 = new MenuItem("Delete");
            menuItem1.Click += (s, e) =>
            {
                Dispose();
            };
            ContextMenu = new ContextMenu();
            ContextMenu.MenuItems.Add(menuItem1);
        }

        public event EventHandler<FieldControlSwapEventArgs> SwapRequested;

        // This is kind of a hack. In order for fields to be dragged over other fields
        // and still be added, we need to allow the Field to have an event that represents
        // this action. Ideally, the underlying FormSectionWidget would handle this.
        public event EventHandler<FieldControlSwapEventArgs> CreateFieldRequested;

        public virtual NgFieldType FieldType
        {
            get { return _fieldObject.FieldType; }
        }

        public INgField FieldObject
        {
            get { return _fieldObject; }
        }

        public virtual string FieldLabel
        {
            get { return _fieldObject.Label; }
            set { _fieldObject.Label = value; }
        }
        public virtual string Value
        {
            get { return _fieldObject.Value; }
            set { _fieldObject.Value = value; }
        }

        public bool Selected
        {
            get
            {
                return _selected;
            }
            set
            {
                _selected = value;

                if (_selected)
                {
                    this.BackColor = Color.LightBlue;
                }
                else
                {
                    this.BackColor = Color.White;
                    this.BorderStyle = BorderStyle.None;
                }
            }
        }

        protected override CreateParams CreateParams
        {
            get
            {
                CreateParams param = base.CreateParams;
                param.ClassStyle = param.ClassStyle & 0x200;
                return param;
            }
        }

        private void InitializeComponent()
        {
            this.SuspendLayout();
            // 
            // FieldUserControlBase
            // 
            this.AllowDrop = true;
            this.Name = "FieldUserControlBase";
            this.MouseLeave += new System.EventHandler(this.FieldUserControlBase_MouseLeave);
            this.DragOver += new System.Windows.Forms.DragEventHandler(this.FieldUserControlBase_DragOver);
            this.DragDrop += new System.Windows.Forms.DragEventHandler(this.FieldUserControlBase_DragDrop);
            this.MouseMove += new System.Windows.Forms.MouseEventHandler(this.FieldUserControlBase_MouseMove);
            this.MouseEnter += new System.EventHandler(this.FieldUserControlBase_MouseEnter);
            this.ResumeLayout(false);
        }

        private void FieldUserControlBase_MouseClick(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Right)
            {
                ContextMenu.Show(this, Point.Empty);
            }
        }

        private void FieldUserControlBase_MouseEnter(object sender, EventArgs e)
        {
            this.BorderStyle = BorderStyle.FixedSingle;
        }

        private void FieldUserControlBase_MouseLeave(object sender, EventArgs e)
        {
            if (!_selected)
            {
                this.BorderStyle = BorderStyle.None;
            }
        }

        private void FieldUserControlBase_DragDrop(object sender, DragEventArgs e)
        {
            if (e.Data.GetFormats().Length == 0) return;

            // A swap drap drop?
            object dragDropData = e.Data.GetData(e.Data.GetFormats()[0]);
            FieldUserControlBase other = dragDropData as FieldUserControlBase;
            if (other != null && SwapRequested != null)
            {
                SwapRequested(this, new FieldControlSwapEventArgs { Field1 = this, Field2 = other });
                return;
            }

            // A new drap drop over an existing control?
            if (e.Data.GetDataPresent(typeof(NgFieldType)))
            {
                // Create the field and hopefully get the created field instance back.
                NgFieldType field = (NgFieldType)e.Data.GetData(typeof(NgFieldType));
                FieldControlSwapEventArgs args = new FieldControlSwapEventArgs { Field1 = this, FieldType2 = field };
                CreateFieldRequested(this, args);
                if (args.Field2 != null)
                {
                    SwapRequested(this, new FieldControlSwapEventArgs { Field1 = this, Field2 = args.Field2 });
                }
                return;
            }
        }

        private void FieldUserControlBase_DragOver(object sender, DragEventArgs e)
        {
            if (sender is FieldUserControlBase)
            {
                e.Effect = DragDropEffects.All;
            }
        }

        private void FieldUserControlBase_MouseMove(object sender, MouseEventArgs e)
        {
            UserControl control = sender as UserControl;
            if (control == null) return;

            if (!control.DisplayRectangle.Contains(e.Location))
            {
                control.DoDragDrop(this, DragDropEffects.All);
            }
        }
    }

    public class FieldControlSwapEventArgs : EventArgs
    {
        public FieldUserControlBase Field1 { get; set; }
        public FieldUserControlBase Field2 { get; set; }
        public NgFieldType FieldType2 { get; set; }
    }
}
