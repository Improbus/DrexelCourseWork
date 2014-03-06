using System;
using System.Collections.Generic;
using NGForms.Core.Validators;

namespace NGForms.Core.Fields
{
    public interface INgField
    {
        String Value { get; }
        String Label { get; }
        NgFieldType FieldType { get; }
        List<ValidatorTypes> Validator { get; }
    }
}
