package ngforms.core.validators;

import ngforms.core.fields.NgTextField;
import junit.framework.TestCase;

public class ValidatorStoreTests extends TestCase {
	public void testAddValidatorClass() {
		ValidatorStore store = new ValidatorStore();
		store.addValidator(NotEmptyValidator.class);
		assertTrue(store.hasValidator(NotEmptyValidator.class));
	}
	
	public void testAddValidatorObject() {
		ValidatorStore store = new ValidatorStore();
		store.addValidator(new NotEmptyValidator());
		assertTrue(store.hasValidator(new NotEmptyValidator()));
	}
	
	public void testValidateFromConstructorIsTure() {
		// We haven't added validators yet.
		// By default is should be true.
		ValidatorStore store = new ValidatorStore();
		assertTrue(store.validate(new NgTextField()));
	}
}
