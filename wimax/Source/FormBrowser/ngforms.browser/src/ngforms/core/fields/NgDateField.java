package ngforms.core.fields;

public class NgDateField extends NgFieldBase {
	private boolean prefillCurrentDate;

	public NgDateField() {
		super();
	}

	public NgDateField(String label) {
		super(label);
	}

	public NgFieldType getFieldType() {
		return NgFieldType.Date;
	}

	@Override
	public void setValue(String value) {
		// SimpleDateFormat dateFormat = new SimpleDateFormat ( "MM/dd/yyyy" );
		// this.value = dateFormat.parse(value).toString();
		this.value = value;
	}

	public boolean getPrefillCurrentDate() {
		return this.prefillCurrentDate;
	}

	public void setPrefillCurrentDate(boolean prefill) {
		this.prefillCurrentDate = prefill;
	}
}
