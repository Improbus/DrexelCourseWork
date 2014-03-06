package ngforms.core;

import java.util.List;
import java.util.Vector;

public class NgForm {
	private final static String DEFAULT_NAME = "UNTITLED";

	private String name;
	private Vector<NgFormSection> sections;

	public NgForm() {
		this(DEFAULT_NAME);
	}

	public NgForm(String name) {
		sections = new Vector<NgFormSection>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String expected) {
		name = expected;
	}

	public List<NgFormSection> getSections() {
		return sections;
	}
}
