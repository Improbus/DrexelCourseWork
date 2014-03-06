package ngforms.core.test;

import junit.framework.TestCase;
import ngforms.core.NgFormSection;
import ngforms.core.fields.INgField;
import ngforms.core.fields.NgTextField;

public class NgFormSectionTests extends TestCase {

	public void testConstructorWithName() {
		String name = "SectionName";
		NgFormSection section = new NgFormSection(name);
		assertEquals(name, section.getTitle());
	}

	public void testConstructorNoParametersReturnsUntitledName() {
		NgFormSection section = new NgFormSection();
		assertEquals("UNTITLED_SECTION", section.getTitle());
	}

	public void testAddField() {
		INgField field = getMockFormField();
		NgFormSection section = new NgFormSection();
		section.getFields().add(field);
		assertTrue(section.getFields().size() > 0);
	}
	
	// TODO: Replace this with android.test.mock
	private INgField getMockFormField() {
		return new NgTextField();
	}
}
