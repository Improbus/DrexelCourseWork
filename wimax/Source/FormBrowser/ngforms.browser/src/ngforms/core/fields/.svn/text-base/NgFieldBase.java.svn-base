package ngforms.core.fields;

import ngforms.core.validators.ValidatorStore;

public abstract class NgFieldBase implements INgField {
	private ValidatorStore validator = new ValidatorStore(this);
	protected String value;
	protected String label;

	public NgFieldBase() {
		this.label = "Untitled Field";
	}
	
	public NgFieldBase(String label) {
		this.label = label;
	}

	public ValidatorStore getValidator() {
		return validator;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public void setValue(String value) {
		this.value = value;
		
		// TODO: This needs to be commented out for junit tests
		// I think there is a solution for this.
		//Log.i("NgFormBrowser",
		//		String.format("Setting Field (%s) to %s", this.label, this.value));
	}
}
