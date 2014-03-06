package ngforms.browser;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import ngforms.browser.util.Utilities;
import ngforms.browser.widget.FormSectionWidget;
import ngforms.core.NgForm;
import ngforms.core.NgFormHelper;
import ngforms.core.NgFormSection;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FormScreen extends Activity {
	
	private static final int MENU_SAVE = 0;
	private static final int MENU_SUBMIT = 1;
	private static final int MENU_SETTINGS = 2;
	
	private static FormScreen context;
	
	private NgForm form;
	private String formPath;
	private Button btnBack;
	private Button btnNext;
	private LinearLayout contentView;
	private TextView pageDisplayText;
	private NgFormSection currentSection;
	
	public static Context getContext() {
		return context;
	}

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form);
		
		context = this;
		this.pageDisplayText = (TextView) findViewById(R.id.pageDisplayText);
		this.contentView = (LinearLayout) findViewById(R.id.linearMain);

		this.btnBack = (Button) this.findViewById(R.id.btn1Back);
		this.btnBack.setOnClickListener(new android.view.View.OnClickListener() {
			public void onClick(View v) {
				onBackClick();
			}
		});

		this.btnNext = (Button) this.findViewById(R.id.btnNext);
		this.btnNext.setOnClickListener(new android.view.View.OnClickListener() {
			public void onClick(View v) {
				onNextClick();
			}
		});

		formPath = getIntent().getExtras().getString(getString(R.string.form_path));
		Log.i("NgFormBrowser", "Loading .form file.... " + formPath);
		this.form = NgFormHelper.load(formPath);
		
		if (this.form.getSections().size() == 0) {
			Log.e("NgFormBrowser", "No sections found! Exiting...");
		}
		
		// Start at first screen
		currentSection = this.form.getSections().get(0);
		updateSectionDisplay();
	}

	/* Creates the menu items */
	public boolean onCreateOptionsMenu(Menu menu) {
	    menu.add(0, MENU_SAVE, 0, "Save").setIcon(R.drawable.save);
	    menu.add(0, MENU_SUBMIT, 0, "Submit").setIcon(R.drawable.submit);
	    menu.add(0, MENU_SETTINGS, 0, "Settings").setIcon(R.drawable.settings);
	    return true;
	}

	/* Handles item selections */
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
		    case MENU_SAVE:
		    	saveForm();
		        return true;
		    case MENU_SUBMIT:
		    	submitForm();
		        return true;
		    case MENU_SETTINGS:
		    	showSettings();
	    }
	    return false;
	}
	
	private void onBackClick() {
		int last = this.form.getSections().indexOf(currentSection) - 1;
		if (last < 0) return;
		currentSection = this.form.getSections().get(last);		
		updateSectionDisplay();
	}

	private void onNextClick() {
		int next = this.form.getSections().indexOf(currentSection) + 1;
		if (next >= this.form.getSections().size()) return;
		currentSection = this.form.getSections().get(next);
		updateSectionDisplay();
	}
	
	private void updateSectionDisplay() {
		contentView.removeAllViews();

		TextView formNameLabel = new TextView(this);
		formNameLabel.setTextSize(26.0f);
		formNameLabel.setTextColor(Color.BLACK);
		formNameLabel.setText(this.currentSection.getTitle());
		contentView.addView(formNameLabel);
		
		View ruler = new View(this);
		ruler.setBackgroundColor(0xFF00FF00);
		LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams( ViewGroup.LayoutParams.FILL_PARENT, 2);
		layout.setMargins(0, 0, 0, 16);
		contentView.addView(ruler, layout);

		contentView.addView(new FormSectionWidget(this, currentSection).getView());
		pageDisplayText.setText(String.format("%d / %d",
			this.form.getSections().indexOf(currentSection) + 1,
			this.form.getSections().size()));
	}

	private void saveForm() {
		if (form != null) {
			Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("Save Form Name?");
	        builder.setIcon(R.drawable.save);
	        final EditText et = new EditText(this);
	        SimpleDateFormat sdf = new SimpleDateFormat("MM_dd");
	        et.setText(this.form.getName().replace(' ', '_') + "_" + sdf.format(Calendar.getInstance().getTime()));
	        builder.setView(et);
	        builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
	        	public void onClick(DialogInterface dialog, int which) {
	        		File savedPath = new File(Utilities.getFormSavedPath(), et.getText().toString());
	        		if (!savedPath.getPath().endsWith(".form")) {
	        			savedPath = new File(savedPath.getPath() + ".form");
	        		}
	        		Log.i("NgFormBrowser", "Saving form to " + savedPath.getPath());
	        		NgFormHelper.save(form, savedPath.getPath());
	    			Toast.makeText(context, (CharSequence)"Form is saved", Toast.LENGTH_SHORT).show();
	        	}
	        });
	        builder.setNegativeButton("Cancel", null);
	        builder.show(); 
		}
	}
	
	private void submitForm() {
		try {
			NgFormHelper.submit(form, Preferences.getServerHostname(), Preferences.getServerPort());
			Toast.makeText(context, (CharSequence)"Form is submitted", Toast.LENGTH_SHORT).show();
			return;
		} catch (UnknownHostException e) {
			Log.e("NgFormBrowser", "UnknownHostException", e);
		} catch (IOException e) {
			Log.e("NgFormBrowser", "IOException", e);
		}
		
		Toast.makeText(context, (CharSequence)"Error in form submission", Toast.LENGTH_SHORT).show();
	}
	
	private void showSettings() {
		Intent intent = new Intent(this, SettingsScreen.class);
		startActivity(intent);
	}
}
