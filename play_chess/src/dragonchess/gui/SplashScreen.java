package dragonchess.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.lang.reflect.InvocationTargetException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

import org.apache.log4j.Logger;

import dragonchess.MatchState;
import dragonchess.Utils;

/**
 * DragonChess SplashScreen.
 *
 * @author Group 4
 */
public class SplashScreen {

	private static final Logger log = Logger.getLogger(SplashScreen.class);

	/** */
	private JWindow splashScreen;
	/** */
	private DragonChessMW parent;

	public SplashScreen(DragonChessMW parent) {
		this.parent = parent;

		this.createSplashScreen();

		return;
	}

	/**
	 *
	 */
	private void createSplashScreen() {
		this.splashScreen = new JWindow(this.parent.getRootFrame());

		JLabel iLabel = new JLabel(new ImageIcon(Utils.SPLASH_IMAGE));
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension sSize = tk.getScreenSize();
		Container cPane = this.splashScreen.getContentPane();
		Dimension lSize = iLabel.getPreferredSize();

		this.splashScreen.setLocation(
			sSize.width / 2 - (lSize.width / 2),
			sSize.height / 2 - (lSize.height / 2));

		final Runnable cRunner = new Runnable() {
			public void run() {
				SplashScreen.this.splashScreen.setVisible(false);
				SplashScreen.this.splashScreen.dispose();
				SplashScreen.this.parent.packMainPanel();
				SplashScreen.this.parent.setVisible(true);

				return;
			}
		};

		Runnable wRunner = new Runnable() {
			public void run() {
				try {
					// wait for client to connect
					while (SplashScreen.this.parent.getTurn() ==
						MatchState.WhiteConnected) {
						Thread.sleep(Utils.SPLASH_PAUSE);
						SplashScreen.log.debug(String.format("Waiting.... %1$s",
							SplashScreen.this.parent.getTurn()));
					}
					SwingUtilities.invokeAndWait(cRunner);
				} catch(InvocationTargetException ite) {
					ite.printStackTrace();
				} catch(InterruptedException ie) {
					ie.printStackTrace();
				}

				return;
			}
		};

		cPane.add(iLabel, BorderLayout.CENTER);

		this.splashScreen.pack();
		this.splashScreen.setVisible(true);

		Thread sThread = new Thread(wRunner, "SplashThread");
		sThread.start();

		return;
	}

}
