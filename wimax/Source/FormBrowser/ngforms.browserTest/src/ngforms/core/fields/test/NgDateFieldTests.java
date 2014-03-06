package ngforms.core.fields.test;

import java.text.ParseException;

import ngforms.core.fields.INgField;
import ngforms.core.fields.NgDateField;
import ngforms.core.fields.NgFieldType;
import junit.framework.TestCase;

public class NgDateFieldTests extends TestCase {
	public void testSetDateString() throws ParseException {
		NgDateField field = new NgDateField();
		field.setValue("04/06/70 03:23 AM");
		assertEquals("04/06/70 03:23 AM", field.getValue());
	}

	public void testTextFieldGetTypeReturnsDate() {
		INgField field = new NgDateField();
		NgFieldType fieldType = field.getFieldType();
		assertEquals(NgFieldType.Date, fieldType);
	}
}
