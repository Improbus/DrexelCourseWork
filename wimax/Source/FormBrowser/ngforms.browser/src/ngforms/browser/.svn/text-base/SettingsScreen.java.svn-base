package ngforms.browser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SettingsScreen extends Activity {
	
	private EditText hostNameEditText = null;
	private EditText portEditText = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings_screen);

		this.hostNameEditText = (EditText) this.findViewById(R.id.HostNameEditText);
		this.portEditText = (EditText) this.findViewById(R.id.PortEditText);
		Button applyButton = (Button)this.findViewById(R.id.ApplyButton);
		applyButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				savePreferences();
			}
		});

		this.hostNameEditText.setText(Preferences.getServerHostname());
		this.portEditText.setText(new Integer(Preferences.getServerPort()).toString());
	}

	private void savePreferences() {
		Preferences.setServerHostname(this.hostNameEditText.getText().toString());
		Preferences.setServerPort(Integer.parseInt(this.portEditText.getText().toString()));
		
		Toast.makeText(this, (CharSequence)"Prefernces Saved", Toast.LENGTH_SHORT).show();
	}
}
