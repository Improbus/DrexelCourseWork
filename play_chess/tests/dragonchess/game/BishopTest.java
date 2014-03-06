package dragonchess.game;

import junit.framework.TestCase;
import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BishopTest</code> contains tests for the class <code>{@link Bishop}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:06 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class BishopTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Bishop
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	private Bishop fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Bishop
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	public Bishop getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new Bishop();
		}
		return fixture;
	}

	/**
	 * Run the Bishop() constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testBishop_1()
		throws Exception {

		Bishop result = new Bishop();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSAN());
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture_1()
		throws Exception {
		Bishop fixture2 = getFixture();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture2.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.Bishop.getPotentialMoves(Bishop.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture_2()
		throws Exception {
		Bishop fixture2 = getFixture();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new King()), null});

		Collection<Square> result = fixture2.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.Bishop.getPotentialMoves(Bishop.java:64)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BishopTest.class);
	}
}
