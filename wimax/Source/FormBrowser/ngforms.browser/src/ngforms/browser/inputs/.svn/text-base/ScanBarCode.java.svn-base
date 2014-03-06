package ngforms.browser.inputs;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ScanBarCode extends Activity{
	
	String Result = null;

	private Activity temp;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		temp = this;
		IntentIntegrator.initiateScan(
				temp,
				"Barcode Scan",
				"You must download the barcode scanner utility to access this function",
				"Go to Marketplace", "Cancel");
	}

	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		IntentResult scanResult = IntentIntegrator.parseActivityResult(
				requestCode, resultCode, intent);
		if (scanResult.getContents() != null) {
			Result = scanResult.getContents();
		}
	}

}
