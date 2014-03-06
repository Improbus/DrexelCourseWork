package ngforms.browser;

import java.io.File;

import ngforms.browser.util.Utilities;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class TemplateSelectionScreen extends Activity {

	private ListView formListView;
	private Button homeButton;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.template_selection);

		this.homeButton = (Button) this.findViewById(R.id.HomeButton);
		this.homeButton.setOnClickListener(new android.view.View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

		this.formListView = (ListView) findViewById(R.id.contactList);
		populateFormListView(Utilities.getFormTemplatePath());
	}

	private void populateFormListView(File directory) {
		if (!directory.isDirectory()) {
			Log.e("NgFormBrowser", directory.getPath() + " is not a directory");
			return;
		}

		ArrayAdapter<String> directoryList = new ArrayAdapter<String>(this,
				R.layout.list_ltem, Utilities.getListOfFormsInDirectory(directory));

		this.formListView.setAdapter(directoryList);
		this.formListView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				startForm(new File(Utilities.getFormTemplatePath(), ((TextView) view)
						.getText().toString()).getPath());
			}
		});
	}

	private void startForm(String formPath) {
		Intent intent = new Intent(this, FormScreen.class);
		Bundle b = new Bundle();
		b.putString(getString(R.string.form_path), formPath);
		intent.putExtras(b);
		startActivity(intent);
	}

	protected void launchMainMenu() {
		Intent i = new Intent(this, Application.class);
		startActivity(i);
	}
}
