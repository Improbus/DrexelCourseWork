using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Text;
using System.Windows.Forms;

namespace NGForms.FormGenerator.WinForms.Widgets
{
    public partial class ChoicePropertiesWidget : UserControl
    {
        public ChoicePropertiesWidget()
        {
            InitializeComponent();
        }

        public event EventHandler ChoiceChange;

        public ChoicePropertiesWidget(List<string> choices)
        {
            InitializeComponent();

            flowLayoutPanel1.ControlAdded += (s, e) => InvokeChoiceChange();
            flowLayoutPanel1.ControlRemoved += (s, e) => InvokeChoiceChange();

            foreach (string choice in choices)
            {
                AddNewChoice(choice);
            }
        }

        public List<String> GetChoices()
        {
            List<string> result = new List<string>();

            foreach (Control control in flowLayoutPanel1.Controls)
            {
                TextBox tb = control as TextBox;
                if (tb != null)
                {
                    result.Add(tb.Text);
                }
            }
            return result;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            AddNewChoice("New Choice");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            RemoveLastChoice();
        }

        private void AddNewChoice(string choice)
        {
            TextBox choiceTb = new TextBox();
            choiceTb.Text = choice;
            choiceTb.TextChanged += (s, e) => InvokeChoiceChange();
            flowLayoutPanel1.SetFlowBreak(choiceTb, true);
            flowLayoutPanel1.Controls.Add(choiceTb);

            // TODO: We should calculate the TextBox size precisely
            this.Height += 26;
        }

        private void RemoveLastChoice()
        {
            flowLayoutPanel1.Controls.RemoveAt(flowLayoutPanel1.Controls.Count - 1);

            // TODO: We should calculate the TextBox size precisely
            this.Height -= 26;
        }

        private void InvokeChoiceChange()
        {
            if (ChoiceChange != null)
            {
                ChoiceChange(this, EventArgs.Empty);
            }
        }
    }
}
