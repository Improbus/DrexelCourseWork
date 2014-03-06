package ngforms.browser.widget;

import java.util.Vector;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import ngforms.browser.inputs.ChoiceChangeListener;
import ngforms.core.fields.MultipleChoiceField;

public class MultipleChoiceWidget extends FieldWidgetBase<MultipleChoiceField> implements ChoiceChangeListener {

	private LinearLayout layout;
	private AlertDialog.Builder builder;
	private Button textField;
	
	public MultipleChoiceWidget(Context context, MultipleChoiceField field) {
		super(context, field);
		initializeWidget();
	}

	private void initializeWidget() {
		layout = new LinearLayout(context);
		
		Vector<String> vc = field.getChoices();
		if (vc == null) return;

		builder = new AlertDialog.Builder(context);
		builder.setTitle(field.getLabel());

		textField = new Button(context);
		textField.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog alert = builder.create();
				alert.show();
			}
		});

		field.subscribeChoiceChanged(new ChoiceChangeListener() {
			public void onChoiceChanged(Vector<String> choices) {
				setMultipleChoiceFields(choices);
			}
		});

		setMultipleChoiceFields(vc);
		
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.addView(fieldLabel);
		layout.addView(textField);
	}
	
	private void setMultipleChoiceFields(Vector<String> choices) {
		final CharSequence[] items = new CharSequence[choices.size()];
		textField.setText(field.getValue());
		textField.setTextColor(Color.BLACK);
		for (int i = 0; i < choices.size(); i++) {
			items[i] = (CharSequence) choices.get(i);
		}
		
		builder.setItems(items,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int item) {
						textField.setText(items[item]);
						field.setValue(textField.getText().toString());
					}
				});
	}

	public View getView() {
		return layout;
	}

	public void onChoiceChanged(Vector<String> choices) {
		// TODO Auto-generated method stub
		
	}
}
