using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Text;
using System.Windows.Forms;
using NGForms.Core.Fields;
using NGForms.FormGenerator.Infrastructure.Core;

namespace NGForms.FormGenerator.WinForms.Widgets
{
    public partial class MultipleChoiceFieldWidget : FieldUserControlBase
    {
        private MultipleChoiceField _mcf;

        public MultipleChoiceFieldWidget()
            : base(NGForms.Core.NgFieldType.MultipleChoice)
        {
            InitializeComponent();

            _mcf = _fieldObject as MultipleChoiceField;
            if (_mcf != null)
            {
                _mcf.ChoicesChanged += (s,e) => UpdateChoices();
            }
            UpdateChoices();
        }

        public MultipleChoiceFieldWidget(INgField field)
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

        // TODO: Prefilled data is unsupported in Multiple Choice
        public override string Value
        {
            get
            {
                return "";// textBox1.Text;
            }
            set
            {
                //textBox1.Text = value;
                //base.Value = value;
            }
        }

        private void UpdateChoices()
        {
            this.tableLayoutPanel1.Controls.Clear();
            this.tableLayoutPanel1.RowCount = 0;
            this.tableLayoutPanel1.Height = 32;

            foreach (string choice in _mcf.Choices)
            {
                // 
                // radioButton1
                // 
                RadioButton rb = new System.Windows.Forms.RadioButton();
                rb.AutoSize = true;
                rb.Location = new System.Drawing.Point(3, 3);
                rb.Size = new System.Drawing.Size(67, 17);
                rb.TabIndex = 0;
                rb.TabStop = true;
                rb.Text = choice;
                rb.UseVisualStyleBackColor = true;

                this.tableLayoutPanel1.Controls.Add(rb, 0, this.tableLayoutPanel1.RowCount);
                this.tableLayoutPanel1.Height += 24;
                this.tableLayoutPanel1.RowCount++;
            }

            this.Height = this.tableLayoutPanel1.Height + 2;
        }
    }
}
