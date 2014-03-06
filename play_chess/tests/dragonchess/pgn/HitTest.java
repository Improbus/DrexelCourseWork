package dragonchess.pgn;

import junit.framework.TestCase;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HitTest</code> contains tests for the class <code>{@link Hit}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:35 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class HitTest extends TestCase
{
	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	private Hit fixture12;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Hit("", "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Hit("0123456789", "0123456789");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new Hit();
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new Hit();
			fixture4.setBlackMove("");
			fixture4.setWhiteMove("");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new Hit();
			fixture5.setBlackMove("");
			fixture5.setWhiteMove("0123456789");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new Hit();
			fixture6.setBlackMove("");
			fixture6.setWhiteMove("An??t-1.0.txt");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new Hit();
			fixture7.setBlackMove("0123456789");
			fixture7.setWhiteMove("");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new Hit();
			fixture8.setBlackMove("0123456789");
			fixture8.setWhiteMove("0123456789");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new Hit();
			fixture9.setBlackMove("0123456789");
			fixture9.setWhiteMove("An??t-1.0.txt");
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new Hit();
			fixture10.setBlackMove("An??t-1.0.txt");
			fixture10.setWhiteMove("");
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new Hit();
			fixture11.setBlackMove("An??t-1.0.txt");
			fixture11.setWhiteMove("0123456789");
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Hit
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public Hit getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new Hit();
			fixture12.setBlackMove("An??t-1.0.txt");
			fixture12.setWhiteMove("An??t-1.0.txt");
		}
		return fixture12;
	}

	/**
	 * Run the Hit() constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testHit_1()
		throws Exception {

		Hit result = new Hit();

		// add additional test code here
		assertNotNull(result);
		assertEquals(" 13.  ", result.toString());
		assertEquals(13, result.getNumber());
		assertEquals("", result.getWhiteMove());
		assertEquals("", result.getBlackMove());
	}

	/**
	 * Run the Hit(String,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testHit_2()
		throws Exception {
		String whiteMove = "";
		String blackMove = "";

		Hit result = new Hit(whiteMove, blackMove);

		// add additional test code here
		assertNotNull(result);
		assertEquals("110.  ", result.toString());
		assertEquals(110, result.getNumber());
		assertEquals("", result.getWhiteMove());
		assertEquals("", result.getBlackMove());
	}

	/**
	 * Run the Hit(String,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testHit_3()
		throws Exception {
		String whiteMove = "0123456789";
		String blackMove = "0123456789";

		Hit result = new Hit(whiteMove, blackMove);

		// add additional test code here
		assertNotNull(result);
		assertEquals("111. 0123456789 0123456789", result.toString());
		assertEquals(111, result.getNumber());
		assertEquals("0123456789", result.getWhiteMove());
		assertEquals("0123456789", result.getBlackMove());
	}

	/**
	 * Run the Hit(String,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testHit_4()
		throws Exception {
		String whiteMove = "0123456789";
		String blackMove = "";

		Hit result = new Hit(whiteMove, blackMove);

		// add additional test code here
		assertNotNull(result);
		assertEquals("112. 0123456789 ", result.toString());
		assertEquals(112, result.getNumber());
		assertEquals("0123456789", result.getWhiteMove());
		assertEquals("", result.getBlackMove());
	}

	/**
	 * Run the Hit(String,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testHit_5()
		throws Exception {
		String whiteMove = "";
		String blackMove = "0123456789";

		Hit result = new Hit(whiteMove, blackMove);

		// add additional test code here
		assertNotNull(result);
		assertEquals("113.  0123456789", result.toString());
		assertEquals(113, result.getNumber());
		assertEquals("", result.getWhiteMove());
		assertEquals("0123456789", result.getBlackMove());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture1_1()
		throws Exception {
		Hit fixture = getFixture1();
		Object other = new Hit("", "");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture2_1()
		throws Exception {
		Hit fixture = getFixture2();
		Object other = new Hit("0123456789", "0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture3_1()
		throws Exception {
		Hit fixture = getFixture3();
		Object other = new Hit();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture4_1()
		throws Exception {
		Hit fixture = getFixture4();
		Object other = new Hit("", "");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture5_1()
		throws Exception {
		Hit fixture = getFixture5();
		Object other = new Hit("0123456789", "0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture6_1()
		throws Exception {
		Hit fixture = getFixture6();
		Object other = new Hit();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture7_1()
		throws Exception {
		Hit fixture = getFixture7();
		Hit other = new Hit();
		other.setBlackMove("");
		other.setWhiteMove("");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture8_1()
		throws Exception {
		Hit fixture = getFixture8();
		Hit other = new Hit();
		other.setBlackMove("");
		other.setWhiteMove("0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture9_1()
		throws Exception {
		Hit fixture = getFixture9();
		Hit other = new Hit();
		other.setBlackMove("");
		other.setWhiteMove("An??t-1.0.txt");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture10_1()
		throws Exception {
		Hit fixture = getFixture10();
		Hit other = new Hit();
		other.setBlackMove("0123456789");
		other.setWhiteMove("");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture11_1()
		throws Exception {
		Hit fixture = getFixture11();
		Hit other = new Hit();
		other.setBlackMove("0123456789");
		other.setWhiteMove("0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture12_1()
		throws Exception {
		Hit fixture = getFixture12();
		Hit other = new Hit();
		other.setBlackMove("0123456789");
		other.setWhiteMove("An??t-1.0.txt");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture1_2()
		throws Exception {
		Hit fixture = getFixture1();
		Hit other = new Hit();
		other.setBlackMove("An??t-1.0.txt");
		other.setWhiteMove("");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture2_2()
		throws Exception {
		Hit fixture = getFixture2();
		Hit other = new Hit();
		other.setBlackMove("An??t-1.0.txt");
		other.setWhiteMove("0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture3_2()
		throws Exception {
		Hit fixture = getFixture3();
		Hit other = new Hit();
		other.setBlackMove("An??t-1.0.txt");
		other.setWhiteMove("An??t-1.0.txt");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture5_2()
		throws Exception {
		Hit fixture = getFixture5();
		Object other = new Hit("", "");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture6_2()
		throws Exception {
		Hit fixture = getFixture6();
		Object other = new Hit("0123456789", "0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture7_2()
		throws Exception {
		Hit fixture = getFixture7();
		Object other = new Hit();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture8_2()
		throws Exception {
		Hit fixture = getFixture8();
		Object other = new Hit("", "");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture9_2()
		throws Exception {
		Hit fixture = getFixture9();
		Object other = new Hit("0123456789", "0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture10_2()
		throws Exception {
		Hit fixture = getFixture10();
		Object other = new Hit();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture11_2()
		throws Exception {
		Hit fixture = getFixture11();
		Hit other = new Hit();
		other.setBlackMove("");
		other.setWhiteMove("");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture12_2()
		throws Exception {
		Hit fixture = getFixture12();
		Hit other = new Hit();
		other.setBlackMove("");
		other.setWhiteMove("0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture1_3()
		throws Exception {
		Hit fixture = getFixture1();
		Hit other = new Hit();
		other.setBlackMove("");
		other.setWhiteMove("An??t-1.0.txt");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture2_3()
		throws Exception {
		Hit fixture = getFixture2();
		Hit other = new Hit();
		other.setBlackMove("0123456789");
		other.setWhiteMove("");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture3_3()
		throws Exception {
		Hit fixture = getFixture3();
		Hit other = new Hit();
		other.setBlackMove("0123456789");
		other.setWhiteMove("0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture4_2()
		throws Exception {
		Hit fixture = getFixture4();
		Hit other = new Hit();
		other.setBlackMove("0123456789");
		other.setWhiteMove("An??t-1.0.txt");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture5_3()
		throws Exception {
		Hit fixture = getFixture5();
		Hit other = new Hit();
		other.setBlackMove("An??t-1.0.txt");
		other.setWhiteMove("");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture6_3()
		throws Exception {
		Hit fixture = getFixture6();
		Hit other = new Hit();
		other.setBlackMove("An??t-1.0.txt");
		other.setWhiteMove("0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testEquals_fixture7_3()
		throws Exception {
		Hit fixture = getFixture7();
		Hit other = new Hit();
		other.setBlackMove("An??t-1.0.txt");
		other.setWhiteMove("An??t-1.0.txt");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture1_1()
		throws Exception {
		Hit fixture = getFixture1();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture2_1()
		throws Exception {
		Hit fixture = getFixture2();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture3_1()
		throws Exception {
		Hit fixture = getFixture3();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture4_1()
		throws Exception {
		Hit fixture = getFixture4();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture5_1()
		throws Exception {
		Hit fixture = getFixture5();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture6_1()
		throws Exception {
		Hit fixture = getFixture6();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture7_1()
		throws Exception {
		Hit fixture = getFixture7();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture8_1()
		throws Exception {
		Hit fixture = getFixture8();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture9_1()
		throws Exception {
		Hit fixture = getFixture9();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture10_1()
		throws Exception {
		Hit fixture = getFixture10();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("An??t-1.0.txt", result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture11_1()
		throws Exception {
		Hit fixture = getFixture11();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("An??t-1.0.txt", result);
	}

	/**
	 * Run the String getBlackMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetBlackMove_fixture12_1()
		throws Exception {
		Hit fixture = getFixture12();

		String result = fixture.getBlackMove();

		// add additional test code here
		assertEquals("An??t-1.0.txt", result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture1_1()
		throws Exception {
		Hit fixture = getFixture1();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(74, result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture2_1()
		throws Exception {
		Hit fixture = getFixture2();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(75, result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture3_1()
		throws Exception {
		Hit fixture = getFixture3();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(76, result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture4_1()
		throws Exception {
		Hit fixture = getFixture4();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(77, result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture5_1()
		throws Exception {
		Hit fixture = getFixture5();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(78, result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture6_1()
		throws Exception {
		Hit fixture = getFixture6();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(79, result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture7_1()
		throws Exception {
		Hit fixture = getFixture7();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(80, result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture8_1()
		throws Exception {
		Hit fixture = getFixture8();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(81, result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture9_1()
		throws Exception {
		Hit fixture = getFixture9();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(82, result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture10_1()
		throws Exception {
		Hit fixture = getFixture10();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(83, result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture11_1()
		throws Exception {
		Hit fixture = getFixture11();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(84, result);
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetNumber_fixture12_1()
		throws Exception {
		Hit fixture = getFixture12();

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(85, result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture1_1()
		throws Exception {
		Hit fixture = getFixture1();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture2_1()
		throws Exception {
		Hit fixture = getFixture2();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture3_1()
		throws Exception {
		Hit fixture = getFixture3();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture4_1()
		throws Exception {
		Hit fixture = getFixture4();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture5_1()
		throws Exception {
		Hit fixture = getFixture5();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture6_1()
		throws Exception {
		Hit fixture = getFixture6();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("An??t-1.0.txt", result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture7_1()
		throws Exception {
		Hit fixture = getFixture7();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture8_1()
		throws Exception {
		Hit fixture = getFixture8();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture9_1()
		throws Exception {
		Hit fixture = getFixture9();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("An??t-1.0.txt", result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture10_1()
		throws Exception {
		Hit fixture = getFixture10();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture11_1()
		throws Exception {
		Hit fixture = getFixture11();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhiteMove() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testGetWhiteMove_fixture12_1()
		throws Exception {
		Hit fixture = getFixture12();

		String result = fixture.getWhiteMove();

		// add additional test code here
		assertEquals("An??t-1.0.txt", result);
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture1_1()
		throws Exception {
		Hit fixture = getFixture1();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture2_1()
		throws Exception {
		Hit fixture = getFixture2();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture3_1()
		throws Exception {
		Hit fixture = getFixture3();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture4_1()
		throws Exception {
		Hit fixture = getFixture4();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture5_1()
		throws Exception {
		Hit fixture = getFixture5();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture6_1()
		throws Exception {
		Hit fixture = getFixture6();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture7_1()
		throws Exception {
		Hit fixture = getFixture7();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture8_1()
		throws Exception {
		Hit fixture = getFixture8();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture9_1()
		throws Exception {
		Hit fixture = getFixture9();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture10_1()
		throws Exception {
		Hit fixture = getFixture10();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture11_1()
		throws Exception {
		Hit fixture = getFixture11();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture12_1()
		throws Exception {
		Hit fixture = getFixture12();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture2_2()
		throws Exception {
		Hit fixture = getFixture2();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture3_2()
		throws Exception {
		Hit fixture = getFixture3();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture4_2()
		throws Exception {
		Hit fixture = getFixture4();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture5_2()
		throws Exception {
		Hit fixture = getFixture5();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture6_2()
		throws Exception {
		Hit fixture = getFixture6();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture7_2()
		throws Exception {
		Hit fixture = getFixture7();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture8_2()
		throws Exception {
		Hit fixture = getFixture8();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture9_2()
		throws Exception {
		Hit fixture = getFixture9();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture10_2()
		throws Exception {
		Hit fixture = getFixture10();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture11_2()
		throws Exception {
		Hit fixture = getFixture11();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture12_2()
		throws Exception {
		Hit fixture = getFixture12();
		String blackMove = "";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setBlackMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetBlackMove_fixture1_2()
		throws Exception {
		Hit fixture = getFixture1();
		String blackMove = "0123456789";

		fixture.setBlackMove(blackMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture1_1()
		throws Exception {
		Hit fixture = getFixture1();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture2_1()
		throws Exception {
		Hit fixture = getFixture2();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture3_1()
		throws Exception {
		Hit fixture = getFixture3();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture4_1()
		throws Exception {
		Hit fixture = getFixture4();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture5_1()
		throws Exception {
		Hit fixture = getFixture5();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture6_1()
		throws Exception {
		Hit fixture = getFixture6();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture7_1()
		throws Exception {
		Hit fixture = getFixture7();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture8_1()
		throws Exception {
		Hit fixture = getFixture8();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture9_1()
		throws Exception {
		Hit fixture = getFixture9();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture10_1()
		throws Exception {
		Hit fixture = getFixture10();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture11_1()
		throws Exception {
		Hit fixture = getFixture11();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture12_1()
		throws Exception {
		Hit fixture = getFixture12();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture2_2()
		throws Exception {
		Hit fixture = getFixture2();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture3_2()
		throws Exception {
		Hit fixture = getFixture3();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture4_2()
		throws Exception {
		Hit fixture = getFixture4();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture5_2()
		throws Exception {
		Hit fixture = getFixture5();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture6_2()
		throws Exception {
		Hit fixture = getFixture6();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture7_2()
		throws Exception {
		Hit fixture = getFixture7();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture8_2()
		throws Exception {
		Hit fixture = getFixture8();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture9_2()
		throws Exception {
		Hit fixture = getFixture9();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture10_2()
		throws Exception {
		Hit fixture = getFixture10();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture11_2()
		throws Exception {
		Hit fixture = getFixture11();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture12_2()
		throws Exception {
		Hit fixture = getFixture12();
		String whiteMove = "";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteMove(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testSetWhiteMove_fixture1_2()
		throws Exception {
		Hit fixture = getFixture1();
		String whiteMove = "0123456789";

		fixture.setWhiteMove(whiteMove);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		Hit fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("150.  ", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		Hit fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("151. 0123456789 0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture3_1()
		throws Exception {
		Hit fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("152.  ", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture4_1()
		throws Exception {
		Hit fixture = getFixture4();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("153.  ", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture5_1()
		throws Exception {
		Hit fixture = getFixture5();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("154. 0123456789 ", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture6_1()
		throws Exception {
		Hit fixture = getFixture6();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("155. An??t-1.0.txt ", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture7_1()
		throws Exception {
		Hit fixture = getFixture7();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("156.  0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture8_1()
		throws Exception {
		Hit fixture = getFixture8();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("157. 0123456789 0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture9_1()
		throws Exception {
		Hit fixture = getFixture9();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("158. An??t-1.0.txt 0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture10_1()
		throws Exception {
		Hit fixture = getFixture10();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("159.  An??t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture11_1()
		throws Exception {
		Hit fixture = getFixture11();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("160. 0123456789 An??t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testToString_fixture12_1()
		throws Exception {
		Hit fixture = getFixture12();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("161. An??t-1.0.txt An??t-1.0.txt", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
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
	 * @generatedBy CodePro at 3/19/09 10:35 PM
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
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HitTest.class);
	}
}