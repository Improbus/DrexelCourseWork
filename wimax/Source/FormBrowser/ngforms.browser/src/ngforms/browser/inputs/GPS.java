package ngforms.browser.inputs;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

import ngforms.browser.FormScreen;
import ngforms.core.fields.MultipleChoiceField;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public class GPS extends Service {
	private static final int MAX_RESULTS = 5;

	private static Vector<String> gpsLocation;
	private static boolean gpsError = false;
	
	// TODO: Make subscriber interface instead of a direct MultipleChoiceField reference
	private static List<MultipleChoiceField> subscribers;

	static {
		subscribers = new Vector<MultipleChoiceField>();
	}
	
	private Geocoder gc;
	
	private final LocationListener locationListener = new LocationListener() {
		@Override
		public void onLocationChanged(Location location) {
			String lat = String.valueOf(location.getLatitude());
			String lon = String.valueOf(location.getLongitude());
			Log.e("GPS", "location changed: lat=" + lat + ", lon=" + lon);

			try {
				List<Address> addresses = gc.getFromLocation(location.getLatitude(), location.getLongitude(), MAX_RESULTS);
				gpsLocation = new Vector<String>();
				
				// TODO: Just hard-code it to the first line,
				// Ideally, we want this to be settable
				for (Address a : addresses) {
					gpsLocation.add(a.getAddressLine(0));
				}
				
				for (MultipleChoiceField field : subscribers) {
					field.onChoiceUpdated(gpsLocation);
				}

			} catch (IOException e) {
				e.printStackTrace();
				gpsError = true;
			}
		}

		public void onProviderDisabled(String arg0) {
			Log.e("GPS", "provider disabled " + arg0);
		}

		public void onProviderEnabled(String arg0) {
			Log.e("GPS", "provider enabled " + arg0);
		}

		public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
			Log.e("GPS", "status changed to " + arg0 + " [" + arg1 + "]");
		}
	};
	
	public GPS() {
	}

	public static void subscribeLocationSuggestions(MultipleChoiceField field) {
		Context context = FormScreen.getContext();
		if (context == null) return;

		if (gpsLocation == null && !gpsError) {
			subscribers.add(field);
		}
		

		if (gpsError) {
			// Do nothing
		}
		else if (gpsLocation == null) {
			// GPS Location was never retrieved, Start the service
			Intent intent = new Intent(context, GPS.class);
			((Activity) context).startService(intent);
		} else {
			// We already retrieved GPS information
			field.onChoiceUpdated(gpsLocation);
		}
	}
	
	@Override
	public void onStart(Intent intent, int code) {
		Log.e("NgForms Borwser", "Started Service");
		
		// Start the asynchronous GPS request
		gc = new Geocoder(this, Locale.getDefault());
		LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 20000, 1, locationListener);
	}

	@Override
	public IBinder onBind(Intent intent) {
		// We don't need to bind to this service
		return null;
	}
}