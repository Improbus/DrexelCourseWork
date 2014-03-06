using System;
using System.Collections.Generic;
using System.Text;
using NGForms.Core.Fields;
using NGForms.Core;

namespace NGForms.FormGenerator.UI.Views
{
    public interface IFormSectionView
    {
        event EventHandler<NgInputTypeEventArgs> FieldTypeDragged;
        event EventHandler<NgInputObjectEventArgs> FieldAdded;
        event EventHandler<NgInputObjectEventArgs> FieldRemoved;
        event EventHandler<FieldViewEventArgs> FieldSelected;
        event EventHandler<FieldPositionChangedEventArgs> FieldPositionChanged;

        /// <summary>
        /// Called by the client code after the Section object is completely constructed
        /// </summary>
        /// <remarks>
        /// Kind of hacky that the client is forced to call this. TODO: Need to fix this.
        /// </remarks>
        void FinalInitialize();

        /// <summary>
        /// Creates a new INgField from type
        /// </summary>
        /// <param name="fieldType"></param>
        /// <returns></returns>
        IFieldView AddField(NgFieldType fieldType);

        /// <summary>
        /// Use the field as the input
        /// </summary>
        /// <param name="field"></param>
        /// <returns></returns>
        IFieldView AddField(INgField field);
    }

    public class NgInputTypeEventArgs : EventArgs
    {
        public NgFieldType Field { get; set; }
        public IFieldView CreatedFieldView { get; set; } // Optional
    }

    public class NgInputObjectEventArgs : EventArgs
    {
        public INgField FieldObject { get; set; }
    }

    public class FieldViewEventArgs : EventArgs
    {
        public IFieldView Filed { get; set; }
    }

    public class FieldPositionChangedEventArgs : EventArgs
    {
        public INgField FieldObject1 { get; set; }
        public INgField FieldObject2 { get; set; }
    }
}
