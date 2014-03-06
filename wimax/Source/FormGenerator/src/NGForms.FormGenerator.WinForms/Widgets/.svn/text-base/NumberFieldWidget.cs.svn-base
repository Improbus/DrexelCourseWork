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
    public partial class NumberFieldWidget : FieldUserControlBase
    {
        public NumberFieldWidget()
            : base(NGForms.Core.NgFieldType.Number)
        {
            InitializeComponent();
        }

        public NumberFieldWidget(INgField field)
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
                return textBox1.Text;
            }
            set
            {
                textBox1.Text = value;
                base.Value = value;
            }
        }
    }
}
