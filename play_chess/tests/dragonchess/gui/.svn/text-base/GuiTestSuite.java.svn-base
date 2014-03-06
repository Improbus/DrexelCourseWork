package dragonchess.gui;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * GuiTestSuite
 *
 * @author Group 4
 */
public class GuiTestSuite {

	/**
	 * Create the GuiTestSuite.
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite("Test the dragonchess.gui package.");

		// add all the Tests to this TestSuite
		suite.addTestSuite(DragonChessMWTest.class);
		suite.addTestSuite(SplashScreenTest.class);
		suite.addTestSuite(TimerTest.class);

		return suite;
	}

	/**
	 * Runs the test suite using the textual runner.
	 */
	public static void main(String[] args) {
		junit.textui.TestRunner.run(GuiTestSuite.suite());

		return;
	}

}
