package ngforms.core.validators;

import junit.framework.TestCase;
import ngforms.core.fields.NgTextField;


public class NonEmptyValidatorTests extends TestCase {
	public void testEmptyFieldValueReturnsFalse() {
		IValidator validator = new NotEmptyValidator();
		NgTextField field = new NgTextField();
		field.setValue("");
		assertFalse(validator.validate(field));
	}
	
	public void testNonEmptyFieldValueReturnsTrue() {
		IValidator validator = new NotEmptyValidator();
		NgTextField field = new NgTextField();
		field.setValue("MY VALUE");
		assertTrue(validator.validate(field));
	}
}
