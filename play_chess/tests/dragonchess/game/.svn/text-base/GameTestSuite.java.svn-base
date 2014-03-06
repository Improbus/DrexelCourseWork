package dragonchess.game;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * GameTestSuite
 *
 * @author Group 4
 */
public class GameTestSuite {

	/**
	 * Create the GameTestSuite.
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite("Test the dragonchess.game package.");

		// add all the Tests to this TestSuite
		suite.addTestSuite(BishopTest.class);
		suite.addTestSuite(ChessBoardTest.class);
		suite.addTestSuite(CommandTest.class);
		suite.addTestSuite(DataTest.class);
		suite.addTestSuite(DirectionTest.class);
		suite.addTestSuite(EnPassantTest.class);
		suite.addTestSuite(GamePieceColorTest.class);
		suite.addTestSuite(GamePieceSANTest.class);
		suite.addTestSuite(GamePieceTest.class);
		suite.addTestSuite(GamePieceTypeTest.class);
		suite.addTestSuite(KingTest.class);
		suite.addTestSuite(KnightTest.class);
		suite.addTestSuite(PawnTest.class);
		suite.addTestSuite(PlayerTest.class);
		suite.addTestSuite(PositionTest.class);
		suite.addTestSuite(PromoteableTest.class);
		suite.addTestSuite(QueenTest.class);
		suite.addTestSuite(ResultTest.class);
		suite.addTestSuite(RookTest.class);
		suite.addTestSuite(SquareTest.class);
		suite.addTestSuite(UndoableCommandTest.class);

		return suite;
	}

	/**
	 * Runs the test suite using the textual runner.
	 */
	public static void main(String[] args) {
		junit.textui.TestRunner.run(GameTestSuite.suite());

		return;
	}

}
