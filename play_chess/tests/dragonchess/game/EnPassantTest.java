package dragonchess.game;

import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EnPassantTest</code> contains tests for the class <code>{@link EnPassant}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:17 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class EnPassantTest extends TestCase {
	/**
	 * Run the EnPassant fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testFromOrdinal_1()
		throws Exception {
		int ordinal = 0;

		EnPassant result = EnPassant.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Left", result.name());
		assertEquals("Left", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the EnPassant fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testFromOrdinal_2()
		throws Exception {
		int ordinal = 1;

		EnPassant result = EnPassant.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Right", result.name());
		assertEquals("Right", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the EnPassant fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testFromOrdinal_3()
		throws Exception {
		int ordinal = 7;

		EnPassant result = EnPassant.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals("None", result.name());
		assertEquals("None", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the EnPassant fromString(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testFromString_1()
		throws Exception {
		String name = "";

		EnPassant result = EnPassant.fromString(name);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.IllegalArgumentException: No enum const class dragonchess.game.EnPassant.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at dragonchess.game.EnPassant.valueOf(EnPassant.java:1)
		//       at dragonchess.game.EnPassant.fromString(EnPassant.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the EnPassant fromString(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testFromString_2()
		throws Exception {
		String name = "0123456789";

		EnPassant result = EnPassant.fromString(name);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.IllegalArgumentException: No enum const class dragonchess.game.EnPassant.0123456789
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at dragonchess.game.EnPassant.valueOf(EnPassant.java:1)
		//       at dragonchess.game.EnPassant.fromString(EnPassant.java:44)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
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
	 * @generatedBy CodePro at 3/19/09 10:17 PM
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
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EnPassantTest.class);
	}
}
