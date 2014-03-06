package ngforms.browser.widget;

import ngforms.core.NgFormSection;
import ngforms.core.fields.CheckboxField;
import ngforms.core.fields.INgField;
import ngforms.core.fields.LongTextField;
import ngforms.core.fields.MultipleChoiceField;
import ngforms.core.fields.NgDateField;
import ngforms.core.fields.NgFieldType;
import ngforms.core.fields.NgTextField;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

public class FormSectionWidget {
	private NgFormSection section;
	private Context context;
	private LinearLayout layout;

	public FormSectionWidget(Context context, NgFormSection section) {
		this.context = context;
		this.section = section;

		initialize();
	}

	private void initialize() {
		this.layout = new LinearLayout(context);
		this.layout.setOrientation(LinearLayout.VERTICAL);
		
		for (final INgField field : section.getFields()) {
			if (field.getFieldType().equals(NgFieldType.Text)) {
				layout.addView(new TextWidget(context, ((NgTextField) field)).getView());
			} else if (field.getFieldType().equals(NgFieldType.LongText)) {
				layout.addView(new LongTextWidget(context, (LongTextField) field).getView());
			} else if (field.getFieldType().equals(NgFieldType.Date)) {
				layout.addView(new DateFieldWidget(context, (NgDateField) field).getView());
			} else if (field.getFieldType().equals(NgFieldType.MultipleChoice)) {
				layout.addView(new MultipleChoiceWidget(context, (MultipleChoiceField) field).getView());
			} else if (field.getFieldType().equals(NgFieldType.Checkbox)) {
				layout.addView(new CheckboxWidget(context, (CheckboxField) field).getView());
			}
		}
	}

	public View getView() {
		return this.layout;
	}
}
