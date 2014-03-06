using System;
using System.Collections.Generic;
using System.Reflection;
using System.Windows.Forms;
using NGForms.Core;
using NGForms.Core.Fields.Attributes;
using NGForms.FormGenerator.UI.Views;
using WeifenLuo.WinFormsUI.Docking;
using NGForms.FormGenerator.WinForms.Widgets;

namespace NGForms.FormGenerator.WinForms
{
    public partial class Toolbox : DockContent, IFormToolboxView
    {
        private IFormCanvasView _canvasInstance;

        public Toolbox()
        {
            InitializeComponent();

            textFieldButton.Tag = NgFieldType.Text;
            longTextFieldButton.Tag = NgFieldType.LongText;
            numberFieldButton.Tag = NgFieldType.Number;
            multipleChoiceFieldButton.Tag = NgFieldType.MultipleChoice;
            dateFieldButton.Tag = NgFieldType.Date;
            checkboxesButton.Tag = NgFieldType.Checkbox;
        }

        public IFormCanvasView CanvasInstance
        {
            get
            {
                return _canvasInstance;
            }
            set
            {
                _canvasInstance = value;
                _canvasInstance.SelectedChanged += (s, e) => UpdateSelected();
            }
        }

        public void UpdateSelected()
        {
            FillFieldPropertyLayoutWithStandard();

            if (_canvasInstance.Selected != null)
            {
                fieldLabelTextBox.DataBindings.Clear();
                fieldLabelTextBox.DataBindings.Add("Text", _canvasInstance.Selected, "FieldLabel");

                prefilledValueTextBox.DataBindings.Clear();
                prefilledValueTextBox.DataBindings.Add("Text", _canvasInstance.Selected, "Value");
            }

            FillLayoutWithFieldAttributes();
        }

        internal void FinalInitialize()
        {
            formTextbox.DataBindings.Add("Text", FormGeneratorApplication.View.Canvas.Form, "Name");
            UpdateSection();
            _canvasInstance.SectionChanged += (s, e) => UpdateSection();
        }

        private void UpdateSection()
        {
            sectionTextBox.DataBindings.Clear();
            sectionTextBox.DataBindings.Add("Text", FormGeneratorApplication.View.Canvas.CurrentSection, "Title");
            FillFieldPropertyLayoutWithEmpty();
        }

        private void FieldButton_MouseDown(object sender, MouseEventArgs e)
        {
            Button button = sender as Button;
            if (button == null) return;

            button.DoDragDrop(button.Tag, DragDropEffects.All);
        }

        private void FillFieldPropertyLayoutWithEmpty()
        {
            this.flowLayoutPanel2.Controls.Clear();
            this.flowLayoutPanel2.Controls.Add(this.label5);
        }

        private void FillFieldPropertyLayoutWithStandard()
        {
            this.fieldLabelTextBox = new System.Windows.Forms.TextBox();
            this.prefilledValueTextBox = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();

            // 
            // flowLayoutPanel2
            // 
            this.flowLayoutPanel2.Controls.Clear();
            this.flowLayoutPanel2.Controls.Add(this.label1);
            this.flowLayoutPanel2.Controls.Add(this.fieldLabelTextBox);
            this.flowLayoutPanel2.Controls.Add(this.label2);
            this.flowLayoutPanel2.Controls.Add(this.prefilledValueTextBox);
            this.flowLayoutPanel2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.flowLayoutPanel2.Location = new System.Drawing.Point(3, 3);
            this.flowLayoutPanel2.Name = "flowLayoutPanel2";
            this.flowLayoutPanel2.Size = new System.Drawing.Size(268, 364);
            this.flowLayoutPanel2.TabIndex = 4;

            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.flowLayoutPanel2.SetFlowBreak(this.label1, true);
            this.label1.Font = new System.Drawing.Font("Lucida Sans Unicode", 12F);
            this.label1.Location = new System.Drawing.Point(3, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(96, 20);
            this.label1.TabIndex = 1;
            this.label1.Text = "Field Label";

            // 
            // fieldLabelTextBox
            // 
            this.flowLayoutPanel2.SetFlowBreak(this.fieldLabelTextBox, true);
            this.fieldLabelTextBox.Location = new System.Drawing.Point(3, 23);
            this.fieldLabelTextBox.Name = "fieldLabelTextBox";
            this.fieldLabelTextBox.Size = new System.Drawing.Size(258, 20);
            this.fieldLabelTextBox.TabIndex = 0;

            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.flowLayoutPanel2.SetFlowBreak(this.label2, true);
            this.label2.Font = new System.Drawing.Font("Lucida Sans Unicode", 12F);
            this.label2.Location = new System.Drawing.Point(3, 46);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(125, 20);
            this.label2.TabIndex = 3;
            this.label2.Text = "Prefilled Value";

            // 
            // prefilledValueTextBox
            // 
            this.flowLayoutPanel2.SetFlowBreak(this.prefilledValueTextBox, true);
            this.prefilledValueTextBox.Location = new System.Drawing.Point(3, 69);
            this.prefilledValueTextBox.Name = "prefilledValueTextBox";
            this.prefilledValueTextBox.Size = new System.Drawing.Size(258, 20);
            this.prefilledValueTextBox.TabIndex = 2;
        }
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox fieldLabelTextBox;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox prefilledValueTextBox;

        private void FillLayoutWithFieldAttributes()
        {
            PropertyInfo[] properties = Array.FindAll(
                _canvasInstance.Selected.FieldObject.GetType().GetProperties(),
                p =>
                {
                    if (p.CanWrite && Array.Find(p.GetCustomAttributes(true), a => a.GetType() == typeof(FieldPropertyAttribute)) != null)
                        return true;
                    return false;
                });

            foreach (PropertyInfo p in properties)
            {
                PropertyInfo property = p;
                Label label = new Label();
                label.Font = new System.Drawing.Font("Lucida Sans Unicode", 12F);
                label.Text = property.Name;
                label.Size = new System.Drawing.Size(258, 20);
                this.flowLayoutPanel2.SetFlowBreak(label, true);
                this.flowLayoutPanel2.Controls.Add(label);

                // Depending on the datatype, we represent it different ways visually
                if (property.PropertyType == typeof(bool))
                {
                    ComboBox comboBox = new ComboBox();
                    comboBox.SelectedIndexChanged += (s, e) =>
                    {
                        property.SetValue(_canvasInstance.Selected.FieldObject, (bool)comboBox.SelectedItem, null);
                    };
                    comboBox.Items.AddRange(
                        new object[] {
                            true,
                            false
                        });
                    comboBox.Size = new System.Drawing.Size(258, 20);
                    this.flowLayoutPanel2.SetFlowBreak(comboBox, true);
                    this.flowLayoutPanel2.Controls.Add(comboBox);
                }
                else if (property.PropertyType == typeof(string))
                {
                    TextBox textBox = new TextBox();
                    textBox.TextChanged += (s, e) =>
                    {
                        property.SetValue(_canvasInstance.Selected.FieldObject, textBox.Text, null);
                    };
                    this.flowLayoutPanel2.SetFlowBreak(textBox, true);
                    this.flowLayoutPanel2.Controls.Add(textBox);
                }
                else if (property.PropertyType == typeof(List<string>))
                {
                    List<string> choices = property.GetValue(_canvasInstance.Selected.FieldObject, null) as List<string>;
                    ChoicePropertiesWidget dynamicMenuItem = new ChoicePropertiesWidget(choices);
                    dynamicMenuItem.ChoiceChange += (s, e) =>
                        {
                            property.SetValue(_canvasInstance.Selected.FieldObject, dynamicMenuItem.GetChoices(), null);
                        };
                    this.flowLayoutPanel2.SetFlowBreak(dynamicMenuItem, true);
                    this.flowLayoutPanel2.Controls.Add(dynamicMenuItem);
                }
            }
        }

        private void Toolbox_SizeChanged(object sender, EventArgs e)
        {
            // TODO: Magic number. I think you can calculate this from the Borders and the Margin
            ResizeControlsToWidth(this, this.Width - 28);
        }

        private void ResizeControlsToWidth(Control control, int width)
        {
            if (control == null) return;
            if (control is UserControl)
            {
                width -= 10;
            }

            foreach (Control c in control.Controls)
            {
                if (c is TextBox || c is Button || c is ComboBox || c is UserControl)
                {
                    c.Width = width;
                }
                ResizeControlsToWidth(c, width);
            }
        }
    }
}
