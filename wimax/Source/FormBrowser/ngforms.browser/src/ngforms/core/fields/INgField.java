package ngforms.core.fields;

import ngforms.core.validators.ValidatorStore;


public interface INgField {
	String getValue();
	String getLabel();
	void setValue(String value);
	void setLabel(String label);
	NgFieldType getFieldType();
	ValidatorStore getValidator();
}
