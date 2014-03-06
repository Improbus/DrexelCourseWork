package ngforms.core.validators;

import ngforms.core.fields.INgField;

public class Validator {
	public class NullValidator implements IValidator {

		@Override
		public boolean validate(INgField field) {
			return true;
		}
	}
}
