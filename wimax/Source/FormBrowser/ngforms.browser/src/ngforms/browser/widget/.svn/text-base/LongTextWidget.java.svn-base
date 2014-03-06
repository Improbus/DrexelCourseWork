package ngforms.browser.widget;

import ngforms.core.fields.LongTextField;
import android.content.Context;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.LinearLayout;

public class LongTextWidget extends FieldWidgetBase<LongTextField> {

	private LinearLayout layout;

	public LongTextWidget(Context context, LongTextField field) {
		super(context, field);
		initializeWidget();
	}

	private void initializeWidget() {
		final EditText editText = new EditText(context);
		editText.setText(field.getValue());
		editText.setHeight(100);
		editText.setTextColor(Color.BLACK);
		editText.setOnKeyListener(new OnKeyListener(){
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				field.setValue(editText.getText().toString());
				return false;
			}
		});

		layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.addView(fieldLabel);
		layout.addView(editText);
	}

	public View getView() {
		return layout;
	}
}
