package ngforms.core.test;

import junit.framework.TestCase;
import ngforms.core.NgForm;
import ngforms.core.NgFormSection;

public class NgFormTests extends TestCase {
	
	public void testNameConstructor() {
		String name = "MyForm"; 
		NgForm form = new NgForm(name);
		assertEquals(name, form.getName());
	}
	
	public void testEmptyConstructorNameIsUnknown() {
		NgForm form = new NgForm();
		assertEquals("UNTITLED", form.getName());
	}

	public void testSetAndGetName() {
		NgForm form = new NgForm();
		String expected = "MyForm";
		form.setName(expected);
		assertEquals(expected, form.getName());
	}

	public void testAddSectionToForm() {
		NgForm form = new NgForm();
		NgFormSection section = new NgFormSection();
		form.getSections().add(section);
		assertTrue(form.getSections().size() > 0);
	}
}
