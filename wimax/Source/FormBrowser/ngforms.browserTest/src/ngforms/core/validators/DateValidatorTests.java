package ngforms.core.validators;

import ngforms.core.fields.NgTextField;
import junit.framework.TestCase;

public class DateValidatorTests extends TestCase {
	public void test_GoodForamt_IsTrue() {
		IValidator validator = new DateValidator();
		NgTextField field = new NgTextField();
		field.setValue("04/06/70 03:23 AM");
		assertTrue(validator.validate(field));
	}
	
	public void test_BadFormat_IsFalse() {
		IValidator validator = new DateValidator();
		NgTextField field = new NgTextField();
		field.setValue("343/1133345 1234 AM");
		assertFalse(validator.validate(field));
	}
}
