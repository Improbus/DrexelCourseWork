package dragonchess.pgn;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * PgnTestSuite
 *
 * @author Group 4
 */
public class PgnTestSuite {

	/**
	 * Create the PgnTestSuite.
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite("Test the dragonchess.pgn package.");

		// add all the Tests to this TestSuite
		suite.addTestSuite(PGNTest.class);
		suite.addTestSuite(FlagTest.class);
		suite.addTestSuite(PgnGameTest.class);
		suite.addTestSuite(PgnMoveTest.class);
		suite.addTestSuite(PgnParserTest.class);
		suite.addTestSuite(HitTest.class);

		return suite;
	}

	/**
	 * Runs the test suite using the textual runner.
	 */
	public static void main(String[] args) {
		junit.textui.TestRunner.run(PgnTestSuite.suite());

		return;
	}

}
