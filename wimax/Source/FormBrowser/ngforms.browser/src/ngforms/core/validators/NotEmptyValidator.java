package ngforms.core.validators;

import ngforms.core.fields.INgField;

public class NotEmptyValidator implements IValidator {
	@Override
	public boolean validate(INgField field) {
		return (field.getValue().length() > 0);
	}
}
