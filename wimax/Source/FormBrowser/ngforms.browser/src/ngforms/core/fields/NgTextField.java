package ngforms.core.fields;

public class NgTextField extends NgFieldBase {
	
	private boolean isBardcodeScanable; 
	
	public NgTextField() {
		super();
	}
	
	public NgTextField(String label) {
		super(label);
	}

	public NgFieldType getFieldType() {
		return NgFieldType.Text;
	}
	
	// Exposed for junit tests
	public void setIsBardcodeScanable(boolean value) {
		isBardcodeScanable = value;
	}
	
	public boolean getIsBardcodeScanable() {
		return isBardcodeScanable;
	}
}
