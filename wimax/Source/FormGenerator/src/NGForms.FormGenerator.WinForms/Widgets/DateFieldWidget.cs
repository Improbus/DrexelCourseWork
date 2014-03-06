using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Text;
using System.Windows.Forms;
using NGForms.Core.Fields;

namespace NGForms.FormGenerator.WinForms.Widgets
{
    public partial class DateFieldWidget : FieldUserControlBase
    {
        public DateFieldWidget()
            : base(NGForms.Core.NgFieldType.Date)
        {
            InitializeComponent();
        }

        public DateFieldWidget(INgField field)
            : base(field)
        {
        }

        public override string FieldLabel
        {
            get
            {
                return label1.Text;
            }
            set
            {
                label1.Text = value;
                base.FieldLabel = value;
            }
        }

        public override string Value
        {
            get
            {
                return this.dateTimePicker1.Value.ToString("MM/dd/yyyy");
            }
            set
            {
                this.dateTimePicker1.Value = DateTime.Parse(value);
            }
        }
    }
}
