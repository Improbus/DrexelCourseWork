package ngforms.core.fields;

public class LongTextField extends NgFieldBase {
	
	public LongTextField() {
	}
	
	public LongTextField(String label) {
		super(label);
	}

	public NgFieldType getFieldType() {
		return NgFieldType.LongText;
	}
}
