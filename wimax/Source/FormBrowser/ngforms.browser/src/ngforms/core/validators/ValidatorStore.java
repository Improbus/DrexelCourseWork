package ngforms.core.validators;

import java.util.Vector;

import ngforms.core.fields.INgField;

public class ValidatorStore {
	
	private Vector<Class<? extends IValidator>> validatorTypes;
	private INgField field;

	public ValidatorStore() {
		this(null);
	}
	
	public ValidatorStore(INgField field) {
		this.field = field;
		validatorTypes = new Vector<Class<? extends IValidator>>();
	}

	public void addValidator(IValidator validator) {
		addValidator(validator.getClass());
	}
	
	public void addValidator(Class<? extends IValidator> validatorClass) {
		if (!validatorTypes.contains(validatorClass)) {
			validatorTypes.add(validatorClass);
		}
	}
	
	public boolean hasValidator(IValidator validator) {
		return hasValidator(validator.getClass());
	}
	
	public boolean hasValidator(Class<? extends IValidator> validatorClass) {
		return validatorTypes.contains(validatorClass);
	}

	public boolean validate(INgField field) {
		boolean result = true;
		
		for (Class<? extends IValidator> validator : validatorTypes) {
			try {
				result = result ? validator.newInstance().validate(field) : false;
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public boolean validate() {
		if (field != null) {
			return validate(field);
		}
		
		// We didn't call the correct constructor....
		// For now just swallow this.
		return false;
	}
}
