package dragonchess.game;

import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GamePieceColorTest</code> contains tests for the class <code>{@link GamePieceColor}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:06 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class GamePieceColorTest extends TestCase {
	/**
	 * Run the GamePieceColor fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testFromOrdinal_1()
		throws Exception {
		int ordinal = 0;

		GamePieceColor result = GamePieceColor.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals("White", result.name());
		assertEquals("White", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the GamePieceColor fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testFromOrdinal_2()
		throws Exception {
		int ordinal = 1;

		GamePieceColor result = GamePieceColor.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Black", result.name());
		assertEquals("Black", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GamePieceColor fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testFromOrdinal_3()
		throws Exception {
		int ordinal = 7;

		GamePieceColor result = GamePieceColor.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals("NULL", result.name());
		assertEquals("NULL", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the GamePieceColor fromString(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testFromString_1()
		throws Exception {
		String name = "";

		GamePieceColor result = GamePieceColor.fromString(name);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.IllegalArgumentException: No enum const class dragonchess.game.GamePieceColor.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at dragonchess.game.GamePieceColor.valueOf(GamePieceColor.java:1)
		//       at dragonchess.game.GamePieceColor.fromString(GamePieceColor.java:45)
		assertNotNull(result);
	}

	/**
	 * Run the GamePieceColor fromString(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testFromString_2()
		throws Exception {
		String name = "0123456789";

		GamePieceColor result = GamePieceColor.fromString(name);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.IllegalArgumentException: No enum const class dragonchess.game.GamePieceColor.0123456789
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at dragonchess.game.GamePieceColor.valueOf(GamePieceColor.java:1)
		//       at dragonchess.game.GamePieceColor.fromString(GamePieceColor.java:45)
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
		new org.junit.runner.JUnitCore().run(GamePieceColorTest.class);
	}
}
