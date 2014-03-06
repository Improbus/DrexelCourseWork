using NGForms.FormGenerator.UI.Views;
using NGForms.Core;
using System.Collections.Generic;

namespace NGForms.FormGenerator.UI.Presenters
{
    public class FieldCanvasPresenter
    {
        private List<FormSectionPresenter> _sections;
        private IFormCanvasView _view;
        private NgForm _form;

        public FieldCanvasPresenter(IFormCanvasView view)
        {
            _form = new NgForm();
            _view = view;
            _view.NewSectionClick += new System.EventHandler(View_NewSectionClick);
            _view.PreviousSectionClick += new System.EventHandler(View_PreviousSectionClick);
            _view.NextSectionClick += new System.EventHandler(View_NextSectionClick);
            _sections = new List<FormSectionPresenter>();
            AddNewSection();
        }

        public NgForm Form
        {
            get
            {
                return _form;
            }
            set
            {
                _form = value;
                _sections.Clear();

                foreach (NgFormSection sec in _form.Sections)
                {
                    IFormSectionView sectionView = _view.CanvasCreationMethod();

                    FormSectionPresenter section = new FormSectionPresenter(sectionView, sec);
                    _sections.Add(section);

                    if (sec == _form.Sections[0])
                    {
                        _view.CurrentSection = sectionView;
                    }

                    sectionView.FinalInitialize();
                }
                _view.SectionPageText = string.Format("{0} / {1}", 1, _sections.Count);
            }
        }

        public NgFormSection CurrentSection
        {
            get { return _sections.Find((p) => p.View == _view.CurrentSection).SectionObject; }
        }

        public void FinalInitialize()
        {
            _view.CurrentSection.FinalInitialize();
        }

        private void View_NewSectionClick(object sender, System.EventArgs e)
        {
            AddNewSection();
        }

        private void AddNewSection()
        {
            IFormSectionView sectionView = _view.CanvasCreationMethod();
            FormSectionPresenter section = new FormSectionPresenter(sectionView, new NgFormSection());
            _sections.Add(section);
            _view.CurrentSection = sectionView;
            _form.Sections.Add(section.SectionObject);
            _view.SectionPageText = string.Format("{0} / {1}", _sections.Count, _sections.Count);
            sectionView.FinalInitialize();
        }

        private void View_PreviousSectionClick(object sender, System.EventArgs e)
        {
            int index = _sections.FindIndex((p) => p.View == _view.CurrentSection);
            if (index < 1) return;

            _view.CurrentSection = _sections[index - 1].View;
            _view.SectionPageText = string.Format("{0} / {1}", index, _sections.Count);
        }

        private void View_NextSectionClick(object sender, System.EventArgs e)
        {
            int index = _sections.FindIndex((p) => p.View == _view.CurrentSection);
            if (index + 1 >= _sections.Count) return;

            _view.CurrentSection = _sections[index + 1].View;
            _view.SectionPageText = string.Format("{0} / {1}", index + 2, _sections.Count);
        }
    }
}
