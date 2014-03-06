package ngforms.browser;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import ngforms.browser.util.Utilities;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class SavedSelectionScreen extends Activity {
	
	private Button bsearch;
	private Button bhome;
	private Collection<File> _foundFiles;
	private Collection<String> _foundFilesNames;
	
	private ListView formListView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.saved_selection);
		this.bsearch = (Button) this.findViewById(R.id.search);
		this.bhome = (Button) this.findViewById(R.id.cancel);

		setDefaultKeyMode(DEFAULT_KEYS_SEARCH_LOCAL);

		final Intent queryIntent = getIntent();
		final String queryAction = queryIntent.getAction();
		if (Intent.ACTION_SEARCH.equals(queryAction)) {
			doSearchWithIntent(queryIntent);
		}

		this.bsearch.setOnClickListener(new OnClickListener() {
			// @Override
			public void onClick(View v) {
				onSearchRequested();
			}
		});

		this.bhome.setOnClickListener(new OnClickListener() {
			// @Override
			public void onClick(View v) {
				finish();
			}
		});
		
		this.formListView = (ListView) findViewById(R.id.savedFormsLayout);
		populateFormListView(Utilities.getFormSavedPath());
	}
	
	private void startForm(String formPath) {
		Intent intent = new Intent(this, FormScreen.class);
		Bundle b = new Bundle();
		b.putString(getString(R.string.form_path), formPath);
		intent.putExtras(b);
		startActivity(intent);
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
				startForm(new File(Utilities.getFormSavedPath(), ((TextView) view)
						.getText().toString()).getPath());
			}
		});
	}

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);

		final String queryAction = intent.getAction();
		if (Intent.ACTION_SEARCH.equals(queryAction)) {
			doSearchWithIntent(intent);
		}
	}

	private void doSearchWithIntent(final Intent queryIntent) {
		final String queryString = queryIntent
				.getStringExtra(SearchManager.QUERY);
		searchForFile(queryString);
	}

	@SuppressWarnings("unchecked")
	private void searchForFile(final String fileName) {

		_foundFiles = FileUtils.listFiles(Utilities.getFormSavedPath(), FileFilterUtils
				.nameFileFilter(fileName), TrueFileFilter.INSTANCE);

		_foundFilesNames = new ArrayList<String>();
		for (File result : _foundFiles) {
			_foundFilesNames.add(result.getName());
		}

		ListView listView;
		listView = (ListView) findViewById(R.id.fileList);
		ArrayAdapter<String> myAdaptor = new ArrayAdapter<String>(this,
				R.layout.files_list_item, _foundFilesNames
						.toArray(new String[_foundFilesNames.size()]));
		listView.setAdapter(myAdaptor);
	}
}
