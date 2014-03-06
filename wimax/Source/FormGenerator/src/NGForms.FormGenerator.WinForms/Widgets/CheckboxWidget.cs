using NGForms.Core.Fields;

namespace NGForms.FormGenerator.WinForms.Widgets
{
    public partial class CheckboxWidget : FieldUserControlBase
    {
        private CheckboxField _field;

        public CheckboxWidget()
            : base(NGForms.Core.NgFieldType.Checkbox)
        {
            InitializeComponent();

            _field = _fieldObject as CheckboxField;
            if (_field != null)
            {
                _field.ChoicesChanged += (s, e) => UpdateChoices();
            }
            UpdateChoices();
        }

        public CheckboxWidget(INgField field)
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
                string value = "";
                bool first = true;
                foreach (object selected in this.checkedListBox1.SelectedItems)
                {
                    if (!first)
                    {
                        value = "," + selected;
                    }
                    else
                    {
                        value = selected.ToString();
                    }
                }

                return value;
            }
            set
            {
                //value.Split(new char[] { ',' });
                //this.checkedListBox1.Value = DateTime.Parse(value);
            }
        }

        private void UpdateChoices()
        {
            checkedListBox1.Items.Clear();

            checkedListBox1.Items.AddRange(_field.Choices.ToArray());
            checkedListBox1.Height = 30 + checkedListBox1.Items.Count * 14;
            this.Height = 70 + checkedListBox1.Items.Count * 14;
        }
    }
}
