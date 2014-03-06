package dragonchess.network;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * NetworkTestSuite
 *
 * @author Group 4
 */
public class NetworkTestSuite {

	/**
	 * Create the NetworkTestSuite.
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite("Test the dragonchess.network package.");

		// add all the Tests to this TestSuite
		suite.addTestSuite(CommandRecipientTest.class);
		suite.addTestSuite(DataRecipientTest.class);
		suite.addTestSuite(DragonChessClientTest.class);
		suite.addTestSuite(DragonChessServerTest.class);
		suite.addTestSuite(NetworkConnectionTest.class);

		return suite;
	}

	/**
	 * Runs the test suite using the textual runner.
	 */
	public static void main(String[] args) {
		junit.textui.TestRunner.run(NetworkTestSuite.suite());

		return;
	}

}
