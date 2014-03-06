package ngforms.browser.widget;

import ngforms.core.fields.INgField;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

public abstract class FieldWidgetBase<T extends INgField> {
	protected T field;
	protected Context context;
	protected TextView fieldLabel;
	
	protected FieldWidgetBase(Context context, T field) {
		this.context = context;
		this.field = field;
		
		this.fieldLabel = new TextView(context);
		this.fieldLabel.setText(field.getLabel());
		this.fieldLabel.setTextSize(20.0f);
		this.fieldLabel.setTextColor(Color.BLACK);
	}
	
	abstract View getView();
}
