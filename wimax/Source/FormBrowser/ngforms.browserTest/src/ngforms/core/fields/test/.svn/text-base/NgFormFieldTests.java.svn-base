package ngforms.core.fields.test;

import junit.framework.TestCase;
import ngforms.core.fields.INgField;
import ngforms.core.fields.NgFieldType;
import ngforms.core.fields.NgTextField;

public class NgFormFieldTests extends TestCase {
	
	public void testTextFieldGetTypeReturnsText() {
		INgField field = new NgTextField();
		NgFieldType fieldType = field.getFieldType();
		assertEquals(NgFieldType.Text, fieldType);
	}
	
	public void testGetValidatorValidatesEmpty() {
		INgField field = new NgTextField();
		assertTrue(field.getValidator().validate());
	}
}
