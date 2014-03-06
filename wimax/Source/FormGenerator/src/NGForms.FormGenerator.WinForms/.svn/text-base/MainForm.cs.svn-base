using System;
using System.IO;
using System.Windows.Forms;
using NGForms.Core;
using NGForms.Core.Validators.Util;
using NGForms.FormGenerator.UI.Presenters;
using NGForms.FormGenerator.UI.Views;
using WeifenLuo.WinFormsUI.Docking;

namespace NGForms.FormGenerator.WinForms
{
    public partial class MainForm : Form, IMainView
    {
        private FieldCanvasPresenter _canvas;
        private Toolbox _toolboxView;

        public MainForm()
        {
            InitializeComponent();

            FormBuilderCanvas canvasView;
            canvasView = new FormBuilderCanvas();
            canvasView.Show(dockPanel1, DockState.Document);
            canvasView.AllowEndUserDocking = false;
            canvasView.CloseButtonVisible = false;

            _canvas = new FieldCanvasPresenter(canvasView);

            _toolboxView = new Toolbox();
            _toolboxView.CanvasInstance = canvasView;
            _toolboxView.Show(dockPanel1, DockState.DockLeft);

            //FormToolboxPresenter toolboxPresenter = new FormToolboxPresenter(null, toolboxView);
            //toolbox.Show(canvas, DockState.DockLeft);
        }

        public FieldCanvasPresenter Canvas
        {
            get { return _canvas; }
        }

        internal void FinalInitialize()
        {
            _toolboxView.FinalInitialize();
            _canvas.FinalInitialize();
        }

        private void ExportToolStripMenuItem_Click(object sender, System.EventArgs e)
        {
            NgForm form = _canvas.Form;

            string str = XmlHelper.Serialize(form);

            SaveFileDialog saveFileDialog1 = new SaveFileDialog();
            saveFileDialog1.Filter = "FORM file|*.form";
            saveFileDialog1.Title = "Save a NgForm File";
            saveFileDialog1.ShowDialog();

            // If the file name is not an empty string open it for saving.
            if (saveFileDialog1.FileName != "")
            {
                File.WriteAllText(saveFileDialog1.FileName, str);
            }

#if DEBUG
            MessageBox.Show(str);
#endif
        }

        private void OpenToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("This feature is not fully implemented." + Environment.NewLine + "Workaround: Edit the form xml manually. Or leave this programming running.");
            OpenFileDialog openFileDialog1 = new OpenFileDialog();
            openFileDialog1.Filter = "FORM file|*.form";
            openFileDialog1.Title = "Open a NgForm File";
            openFileDialog1.ShowDialog();

            if (File.Exists(openFileDialog1.FileName))
            {
                NgForm form = XmlHelper.Deserialize(File.ReadAllText(openFileDialog1.FileName));
                _canvas.Form = form;
            }
        }

        private void quitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void newToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("This feature is not fully implemented." + Environment.NewLine + "Workaround: Close this application and restart.");
        }
    }
}
