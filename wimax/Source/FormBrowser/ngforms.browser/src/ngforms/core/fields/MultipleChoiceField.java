package ngforms.core.fields;

import java.util.Vector;

import ngforms.browser.inputs.ChoiceChangeListener;
import ngforms.browser.inputs.GPS;

public class MultipleChoiceField extends NgFieldBase {
	private Vector<String> choices;
	private boolean isGps;

	public MultipleChoiceField() {
		super();
	}

	public MultipleChoiceField(String label) {
		super(label);
	}

	public Vector<String> getChoices() {
		if (isGps) {
			// Subscribe to when GPS becomes ready, send nothing immediately
			GPS.subscribeLocationSuggestions(this);
			this.choices.clear();
			this.choices.add("Retreiving GPS information...");
		}
		
		return this.choices;
	}
	
	public void setChoices(Vector<String> choices) {
		this.choices = choices;
	}

	public NgFieldType getFieldType() {
		return NgFieldType.MultipleChoice;
	}
	
	// Exposed for junit tests
	public void setIsGps(boolean value) {
		isGps = value;
	}
	
	public boolean getIsGps() {
		return isGps;
	}
	
	public void subscribeChoiceChanged(ChoiceChangeListener callback) {
		this.callback = callback;
	}
	
	public void onChoiceUpdated(Vector<String> choices) {
		if (callback != null) {
			callback.onChoiceChanged(choices);
		}
	}
	
	private ChoiceChangeListener callback;
}
