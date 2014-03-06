using System.Windows.Forms;
using NGForms.Core;

namespace NGForms.FormGenerator.WinForms
{
    public partial class FormPageControl : UserControl
    {
        public FormPageControl()
        {
            InitializeComponent();
        }

        private void FormPageControl_DragDrop(object sender, DragEventArgs e)
        {
            if (e.Data.GetDataPresent(typeof(NgFieldType)))
            {
                string data = e.Data.GetData(typeof(NgFieldType)).ToString();

                MessageBox.Show(data);
            }
        }

        private void FormPageControl_DragOver(object sender, DragEventArgs e)
        {
            if (e.Data.GetDataPresent(typeof(NgFieldType)))
            {
                e.Effect = DragDropEffects.All;
            }
        }
    }
}
