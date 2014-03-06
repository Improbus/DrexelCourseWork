package ngforms.browser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Application extends Activity {
	
	private Button loadNewCaseFile;
	private Button loadoldCaseFile;
	private Button exit;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		this.loadNewCaseFile = (Button) this.findViewById(R.id.Button01);
		this.loadoldCaseFile = (Button) this.findViewById(R.id.Button02);
		this.exit = (Button) this.findViewById(R.id.Button03);

		this.loadNewCaseFile.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				launchNewCaseScreen();
			}
		});

		this.loadoldCaseFile.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				launchOldCaseScreen();
			}
		});

		this.exit.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
		
		Preferences.initialize(this.getSharedPreferences(Preferences.NETWORK_SETTINGS, 0));
	}

	protected void launchNewCaseScreen() {
		Intent intent = new Intent(this, TemplateSelectionScreen.class);
		startActivity(intent);
	}

	protected void launchOldCaseScreen() {
		Intent intent = new Intent(this, SavedSelectionScreen.class);
		startActivity(intent);
	}
}
