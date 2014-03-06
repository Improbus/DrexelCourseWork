package ngforms.core.test;

import java.io.File;
import java.util.Vector;

import ngforms.core.NgForm;
import ngforms.core.NgFormHelper;
import ngforms.core.NgFormSection;
import ngforms.core.fields.INgField;
import ngforms.core.fields.LongTextField;
import ngforms.core.fields.MultipleChoiceField;
import ngforms.core.fields.NgDateField;
import ngforms.core.fields.NgTextField;
import ngforms.core.fields.NumberField;
import ngforms.core.validators.DateValidator;
import ngforms.core.validators.NotEmptyValidator;
import junit.framework.TestCase;

public class NgFormHelperTests extends TestCase {
	
	public void testWriteSimpleNgFormObjectFile() {
		NgForm form = new NgForm("FormTitle");
		form.getSections().add(new NgFormSection("Section1"));

		File f = new File(System.getProperty("java.io.tmpdir"), "testWriteSimpleNgFormObjectFile.form");
		f.delete();

		NgFormHelper.save(form, f.getPath());
		assertTrue(f.exists());
	}

	public void testReadWriteNgFormFile() {
		NgForm original = new NgForm("FormTitle");
		NgFormSection section = new NgFormSection("Section1");
		section.getFields().add(new NgTextField());
		original.getSections().add(section);

		File f = new File(System.getProperty("java.io.tmpdir"), "testReadWriteNgFormFile.form"); 
		f.delete();

		NgFormHelper.save(original, f.getPath());
		NgForm fromFile = NgFormHelper.load(f.getPath());

		assertFormsAreEqual(original, fromFile);
	}
	
	public void testSpecialForm() {

		//////////////////////////////
		// Date Field 1
		NgDateField datefield1 = new NgDateField();
		datefield1.getValidator().addValidator(new DateValidator());
		datefield1.getValidator().addValidator(new NotEmptyValidator());
		
		//////////////////////////////
		// Text Field 1
		NgTextField textfield1 = new NgTextField("Name");
		textfield1.getValidator().addValidator(new NotEmptyValidator());
		
		//////////////////////////////
		// Text Field 2		
		NgTextField textfield2 = new NgTextField("City");
		textfield2.setValue("Philadelphia");
		
		//////////////////////////////
		// Date Field 2
		NgDateField datefield2 = new NgDateField("Current Date");
		datefield2.setPrefillCurrentDate(true);
		datefield2.getValidator().addValidator(new DateValidator());
		
		//////////////////////////////
		// Multiple Choice Field 1
		MultipleChoiceField multipleChoice1 = new MultipleChoiceField("Sex");
		Vector<String> choices1 = new Vector<String>();
		choices1.add("Male");
		choices1.add("Female");
		multipleChoice1.setChoices(choices1);
		
		//////////////////////////////
		// Long Text Field 1
		LongTextField longTextField1 = new LongTextField("Description");
		
		//////////////////////////////
		// Number Field 1
		NumberField numberField1 = new NumberField("Aget");
		
		//////////////////////////////
		// Multiple Choice Field 2
		MultipleChoiceField multipleChoice2 = new MultipleChoiceField("City");
		multipleChoice2.setIsGps(true);
		
		//////////////////////////////
		// Text Field 3
		NgTextField textField3 = new NgTextField("City");
		textField3.setIsBardcodeScanable(true);

		//////////////////////////////
		// Form Section 1
		NgFormSection section1 = new NgFormSection("Section1");
		section1.getFields().add(datefield1);
		section1.getFields().add(textfield1);
		section1.getFields().add(textfield2);
		section1.getFields().add(multipleChoice1);
		section1.getFields().add(longTextField1);
		section1.getFields().add(numberField1);
		
		//////////////////////////////
		// Form Section 2
		NgFormSection section2 = new NgFormSection("Section2");
		section2.getFields().add(datefield2);
		section2.getFields().add(multipleChoice2);

		//////////////////////////////
		// Special Form
		NgForm specialform = new NgForm("Test Form");
		specialform.getSections().add(section1);
		specialform.getSections().add(section2);
		
		//////////////////////////////
		// Create Form
		File f = new File(System.getProperty("java.io.tmpdir"), "special.form");
		f.delete();
		NgFormHelper.save(specialform, f.getPath());
		assertTrue(f.exists());
		NgForm fromFile = NgFormHelper.load(f.getPath());
		
		assertFormsAreEqual(specialform, fromFile);
	}

	private void assertFormsAreEqual(NgForm original, NgForm other) {
		assertEquals(original.getName(), other.getName());
		assertEquals(original.getSections().size(), other.getSections().size());
		for (int i=0; i<original.getSections().size(); i++) {
			NgFormSection originalSection = original.getSections().get(i);
			NgFormSection otherSection = other.getSections().get(i);

			assertSectionAreEqual(originalSection, otherSection);
		}
	}

	private void assertSectionAreEqual(NgFormSection originalSection, NgFormSection otherSection) {
		assertEquals(originalSection.getTitle(), otherSection.getTitle());
		for (int j=0; j < originalSection.getFields().size(); j++) { 
			INgField originalField = originalSection.getFields().get(j);
			INgField otherField = otherSection.getFields().get(j);
			
			assertFieldsAreEqual(originalField, otherField);
		}
	}

	private void assertFieldsAreEqual(INgField originalField, INgField otherField) {
		assertEquals(originalField.getLabel(), otherField.getLabel());
		assertEquals(originalField.getValue(), otherField.getValue());
	}
}
