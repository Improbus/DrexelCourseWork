package ngforms.browser;

import android.content.SharedPreferences;

public class Preferences {
	public static final String NETWORK_SETTINGS = "network_settings";
	public static final String NETWORK_SETTINGS_HOST = "hostname";
	public static final String NETWORK_SETTINGS_PORT = "port";
	
	private static final String NETWORK_SETTINGS_HOST_DEF = "localhost";
	private static final int NETWORK_SETTINGS_PORT_DEF = 10155;

	private static SharedPreferences instance;

	/*
	 * Pass the getSharedPreferences from the main Application.
	 * The argument will be the single references to prefences that 
	 * everybody can call.
	 */
	public static void initialize(SharedPreferences settings) {
		instance = settings;
	}
	
	public static String getServerHostname() {
		return instance.getString(NETWORK_SETTINGS_HOST, NETWORK_SETTINGS_HOST_DEF);
	}
	
	public static void setServerHostname(String hostname) {
		instance.edit().putString(NETWORK_SETTINGS_HOST, hostname).commit();
	}
	
	public static int getServerPort() {
		return instance.getInt(NETWORK_SETTINGS_PORT, NETWORK_SETTINGS_PORT_DEF);
	}
	
	public static void setServerPort(int port) {
		instance.edit().putInt(NETWORK_SETTINGS_PORT, port).commit();
	}

	// Do not call constructor
	private Preferences() {
	}
}
