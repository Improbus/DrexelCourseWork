package dragonchess.network;

import dragonchess.game.Data;

/**
 * This interface defines a DataRecipient.
 *
 * @author Group 4
 */
public interface DataRecipient {

	/**
	 * Handle any incoming Data.
	 *
	 * @param data
	 */
	public void handleData(Data data);

	/**
	 * Show an information/error prompt to the user.
	 *
	 * @param message
	 */
	public void promptUser(String message);

	/**
	 * Returns true if it's this DataRecipient turn to send Data.
	 */
	public boolean sendOK();

}
