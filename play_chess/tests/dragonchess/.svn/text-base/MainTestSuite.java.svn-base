package dragonchess;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * MainTestSuite
 *
 * @author Group 4
 */
public class MainTestSuite {

	/**
	 * Create the MainTestSuite.
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite("Test of the Main module.");

		// add all test cases (for this package) to this test suite
		suite.addTestSuite(ChessExceptionTest.class);
		suite.addTestSuite(MatchStateTest.class);
		suite.addTestSuite(UtilsTest.class);

		return suite;
	}

	/**
	 * Runs the test suite using the textual runner.
	 */
	public static void main(String[] args) {
		junit.textui.TestRunner.run(MainTestSuite.suite());

		return;
	}

}
