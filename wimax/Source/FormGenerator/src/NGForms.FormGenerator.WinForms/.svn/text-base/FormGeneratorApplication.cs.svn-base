using System;
using System.Windows.Forms;
using NGForms.FormGenerator.UI.Views;

namespace NGForms.FormGenerator.WinForms
{
    internal sealed class FormGeneratorApplication
    {
        private static MainForm _view;

        public static IMainView View
        {
            get { return _view; }
        }

        [STAThread]
        internal static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            _view = new MainForm();
            _view.FinalInitialize();
            Application.Run(_view);
        }
    }
}
