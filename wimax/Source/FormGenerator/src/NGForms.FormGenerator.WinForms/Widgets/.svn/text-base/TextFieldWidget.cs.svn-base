using NGForms.FormGenerator.Infrastructure.Core;
using NGForms.Core.Fields;

namespace NGForms.FormGenerator.WinForms.Widgets
{
    public partial class TextFieldWidget : FieldUserControlBase
    {
        public TextFieldWidget()
            : base(NGForms.Core.NgFieldType.Text)
        {
            InitializeComponent();
        }

        public TextFieldWidget(INgField field)
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
