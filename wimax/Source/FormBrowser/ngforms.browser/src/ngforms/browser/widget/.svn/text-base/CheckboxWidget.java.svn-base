package ngforms.browser.widget;

import java.util.Vector;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.CompoundButton.OnCheckedChangeListener;
import ngforms.core.fields.CheckboxField;

public class CheckboxWidget extends FieldWidgetBase<CheckboxField> {

	private LinearLayout layout;
	
	protected CheckboxWidget(Context context, CheckboxField field) {
		super(context, field);
		initializeWidget();
	}

	private void initializeWidget() {
		layout = new LinearLayout(context);
		
		Vector<String> vc = field.getChoices();
		if (vc == null) return;
			
		final CharSequence[] items = new CharSequence[vc.size()];
		for (int i = 0; i < vc.size(); i++) {
			items[i] = (CharSequence) vc.get(i);
		}
		
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.addView(fieldLabel);
		
		// TODO: Update the form object
		for (CharSequence item : items) {
			CheckBox cb = new CheckBox(context);
			cb.setTextColor(Color.BLACK);
			cb.setText(item);
			cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					field.setValue(buttonView.getText().toString());
				}
				
			});
			layout.addView(cb);
		}
	}

	public View getView() {
		return layout;
	}

}
