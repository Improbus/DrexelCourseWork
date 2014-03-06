package ngforms.core;

import java.util.List;
import java.util.Vector;

import ngforms.core.fields.INgField;

public class NgFormSection {
	private final static String DEFAULT_NAME = "UNTITLED_SECTION";

	private String title;
	private Vector<INgField> fields;

	public NgFormSection() {
		this(DEFAULT_NAME);
	}

	public NgFormSection(String title) {
		this.title = title;
		fields = new Vector<INgField>();
	}

	public String getTitle() {
		return title;
	}

	public List<INgField> getFields() {
		return fields;
	}
}
