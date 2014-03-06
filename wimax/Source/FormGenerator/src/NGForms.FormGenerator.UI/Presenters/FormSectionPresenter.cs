using System;
using NGForms.Core;
using NGForms.Core.Fields;
using NGForms.FormGenerator.UI.Views;

namespace NGForms.FormGenerator.UI.Presenters
{
    public class FormSectionPresenter
    {
        private IFormSectionView _view;
        private NgFormSection _sectionObject; // This is the model

        public FormSectionPresenter(IFormSectionView view, NgFormSection section)
        {
            _sectionObject = section;
            _view = view;
            _view.FieldTypeDragged += new EventHandler<NgInputTypeEventArgs>(OnFieldTypeDragged);
            _view.FieldAdded += new EventHandler<NgInputObjectEventArgs>(OnFieldObjectAdded);
            _view.FieldRemoved += new EventHandler<NgInputObjectEventArgs>(OnFieldRemoved);
            _view.FieldPositionChanged += new EventHandler<FieldPositionChangedEventArgs>(OnFieldPositionChanged);

            // Add the fields if they exist
            foreach (INgField field in _sectionObject.Fields)
            {
                _view.AddField(field);
            }
        }

        public IFormSectionView View
        {
            get { return _view; }
        }

        public NgFormSection SectionObject
        {
            get { return _sectionObject; }
        }

        private void OnFieldTypeDragged(object sender, NgInputTypeEventArgs e)
        {
            e.CreatedFieldView = _view.AddField(e.Field);
        }

        private void OnFieldObjectAdded(object sender, NgInputObjectEventArgs e)
        {
            // Update the object
            _sectionObject.Fields.Add(e.FieldObject);
        }

        private void OnFieldRemoved(object sender, NgInputObjectEventArgs e)
        {
            _sectionObject.Fields.Remove(e.FieldObject);
        }

        private void OnFieldPositionChanged(object sender, FieldPositionChangedEventArgs e)
        {
            if (!_sectionObject.Fields.Contains(e.FieldObject1) || !_sectionObject.Fields.Contains(e.FieldObject2))
            {
                return;
            }

            int newPosition = _sectionObject.Fields.IndexOf(e.FieldObject1);
            int oldPosition = _sectionObject.Fields.IndexOf(e.FieldObject2);

            if (newPosition < oldPosition)
            {
                for (int i = oldPosition; i > newPosition; i--)
                {
                    _sectionObject.Fields[i] = _sectionObject.Fields[i - 1];
                }
                _sectionObject.Fields[newPosition] = e.FieldObject2;
            }
            else if (newPosition > oldPosition)
            {
                for (int i = oldPosition; i < newPosition; i++)
                {
                    _sectionObject.Fields[i] = _sectionObject.Fields[i + 1];
                }
                _sectionObject.Fields[newPosition] = e.FieldObject2;
            }
        }
    }
}
