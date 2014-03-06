package ngforms.core.validators;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import ngforms.core.fields.INgField;

public class DateValidator implements IValidator {
	public boolean validate(INgField field) {
		try {
			SimpleDateFormat.getInstance().parse(field.getValue());
			return true;
		} catch (ParseException e) {
			return false;
		}
	}
}
