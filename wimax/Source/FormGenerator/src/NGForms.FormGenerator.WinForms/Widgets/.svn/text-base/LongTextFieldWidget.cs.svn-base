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
    public partial class LongTextFieldWidget : FieldUserControlBase
    {
        public LongTextFieldWidget()
            : base(NGForms.Core.NgFieldType.LongText)
        {
            InitializeComponent();
        }

        public LongTextFieldWidget(INgField field)
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
                return richTextBox1.Text;
            }
            set
            {
                richTextBox1.Text = value;
                base.Value = value;
            }
        }
    }
}
