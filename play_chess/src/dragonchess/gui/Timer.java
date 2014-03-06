package dragonchess.gui;

import java.util.TimerTask;

import org.apache.log4j.Logger;

import dragonchess.Main;
import dragonchess.MatchState;

/**
 * 
 * @author Group 4
 */
public class Timer extends TimerTask {

	private static final Logger log = Logger.getLogger(Timer.class);

	private int whiteTime;
	private int blackTime;
	private Main parent;
	private TimerPanel timerGUI;

	/**
	 * Create a new Timer
	 * 
	 * @param maxTime
	 */
	public Timer(int maxTime, Main parent) {
		int maxTime_in_seconds = maxTime * 60;
		this.whiteTime = maxTime_in_seconds;
		this.blackTime = maxTime_in_seconds;
		this.parent = parent;

		return;
	}

	/**
	 * Return the time remaining for the black player.
	 */
	public long getBlackTime() {
		return this.blackTime;
	}

	/**
	 * Set the time remaining for the black player.
	 * 
	 * @param newTime
	 */
	public void setBlackTime(int newTime) {
		this.blackTime = newTime;

		return;
	}

	/**
	 * Return the time remaining for the white player.
	 */
	public int getWhiteTime() {
		return this.whiteTime;
	}

	/**
	 * Set the time remaining for the white player.
	 * 
	 * @param newTime
	 */
	public void setWhiteTime(int newTime) {
		this.whiteTime = newTime;

		return;
	}

	//
	// implement Runnable
	//

	/**
	 * {@inheritDoc}
	 */
	public void run() {
		if (parent.getTurn() == MatchState.WhiteTurn) {
			this.whiteTime--;
			if(timerGUI != null)
				this.timerGUI.setWhiteTime(this.whiteTime);
		} else if (parent.getTurn() == MatchState.BlackTurn) {
			this.blackTime--;
			if(timerGUI != null)
				this.timerGUI.setBlackTime(this.blackTime);
		}
		return;
	}

	public void setTimerPanel(TimerPanel p) {
		this.timerGUI = p;
		this.timerGUI.setWhiteTime(this.whiteTime);
		this.timerGUI.setBlackTime(this.blackTime);

	}

}
