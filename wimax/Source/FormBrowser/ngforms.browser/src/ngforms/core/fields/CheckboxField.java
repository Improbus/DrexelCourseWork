package ngforms.core.fields;

import java.util.Vector;

public class CheckboxField extends NgFieldBase {
	private Vector<String> choices;

	public CheckboxField() {
	}
	
	public CheckboxField(String label) {
		super(label);
	}
	
	public Vector<String> getChoices() {
		return this.choices;
	}
	
	public NgFieldType getFieldType() {
		return NgFieldType.Checkbox;
	}

}
