namespace NGForms.Core.Fields
{
    /// <summary>
    /// Depending on the type, this class matches it to a specific INgField
    /// class. If no match is found, it will default the NgFeildBase which
    /// has no special knowledge of the field. (Static Factory Pattern)
    /// </summary>
    /// <remarks>You would use this class when you want to decorate your INgField class</remarks>
    public static class FieldClassFactory
    {
        public static NgFieldBase CreateField(NgFieldType type)
        {
            NgFieldBase result;

            switch (type)
            {
                case NgFieldType.MultipleChoice:
                    result = new MultipleChoiceField();
                    break;
                case NgFieldType.Text:
                    result = new TextField();
                    break;
                case NgFieldType.Date:
                    result = new DateField();
                    break;
                case NgFieldType.Checkbox:
                    result = new CheckboxField();
                    break;
                default:
                    result = new NgFieldBase();
                    break;
            }

            result.FieldType = type;
            return result;
        }
    }
}
