package dragonchess.pgn;

import junit.framework.TestCase;
import org.junit.*;

/**
 * The class <code>FlagTest</code> contains tests for the class <code>{@link Flag}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:29 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class FlagTest extends TestCase
{
	/**
	 * An instance of the class being tested.
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	private Flag fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	private Flag fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	private Flag fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	private Flag fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	private Flag fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	private Flag fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	private Flag fixture7;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	public Flag getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = Flag.AMBIGUOUS;
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	public Flag getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = Flag.CAPTURE;
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	public Flag getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = Flag.CHECK;
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	public Flag getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = Flag.CHECKMATE;
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	public Flag getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = Flag.KCASTLE;
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	public Flag getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = Flag.PROMOTE;
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Flag
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	public Flag getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = Flag.QCASTLE;
		}
		return fixture7;
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		Flag fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("AMB", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		Flag fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("x", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	@Test
	public void testToString_fixture3_1()
		throws Exception {
		Flag fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("+", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	@Test
	public void testToString_fixture4_1()
		throws Exception {
		Flag fixture = getFixture4();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("#", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	@Test
	public void testToString_fixture5_1()
		throws Exception {
		Flag fixture = getFixture5();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("O-O", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	@Test
	public void testToString_fixture6_1()
		throws Exception {
		Flag fixture = getFixture6();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("=", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	@Test
	public void testToString_fixture7_1()
		throws Exception {
		Flag fixture = getFixture7();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("O-O-O", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
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
	 * @generatedBy CodePro at 3/19/09 10:29 PM
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
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FlagTest.class);
	}
}