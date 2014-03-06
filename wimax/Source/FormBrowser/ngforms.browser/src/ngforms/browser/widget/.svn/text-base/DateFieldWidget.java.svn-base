package ngforms.browser.widget;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import ngforms.core.fields.NgDateField;
import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;

public class DateFieldWidget extends FieldWidgetBase<NgDateField> {

	private LinearLayout layout;

	public DateFieldWidget(Context context, NgDateField field) {
		super(context, field);
		initializeWidget();
	}

	private void initializeWidget() {
		final Button button = new Button(context);

		if (!"".equals(field.getValue()) && field.getPrefillCurrentDate()) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			button.setText(sdf.format(Calendar.getInstance().getTime()));
		}
		else {
			button.setText(field.getValue());
		}

		button.setOnClickListener(new android.view.View.OnClickListener() {
			public void onClick(View v) {
				DatePickerDialog datePickerDialog = new DatePickerDialog(
						context,
						new DatePickerDialog.OnDateSetListener() {
							public void onDateSet(DatePicker view, int year,
									int month, int day) {
								button.setText(String.format("%02d/%02d/%02d",
										month+1, day, year));
								field.setValue(button.getText().toString());
							}
						},
						Calendar.getInstance().get(Calendar.YEAR),
						Calendar.getInstance().get(Calendar.MONTH),
						Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
				datePickerDialog.show();
			}
		});

		layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.addView(fieldLabel);
		layout.addView(button);
	}

	public View getView() {
		return layout;
	}
}
