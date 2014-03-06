package dragonchess.pgn;

import java.util.List;

import junit.framework.TestCase;
import dragonchess.game.Position;
import dragonchess.game.GamePieceColor;
import org.junit.*;
import dragonchess.game.Player;
import dragonchess.game.GamePieceType;
import static org.junit.Assert.*;

/**
 * The class <code>PgnMoveTest</code> contains tests for the class <code>{@link PgnMove}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:21 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class PgnMoveTest extends TestCase
{
	/**
	 * An instance of the class being tested.
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	private PgnMove fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	private PgnMove fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	private PgnMove fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	private PgnMove fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	private PgnMove fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	private PgnMove fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	private PgnMove fixture7;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	public PgnMove getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new PgnMove(new Player(""), "");
			fixture1.addFlag(Flag.AMBIGUOUS);
			fixture1.addFlag(Flag.AMBIGUOUS);
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	public PgnMove getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new PgnMove(new Player(""), "");
			fixture2.addFlag(Flag.AMBIGUOUS);
			fixture2.addFlag(Flag.CAPTURE);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	public PgnMove getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new PgnMove(new Player(""), "");
			fixture3.addFlag(Flag.AMBIGUOUS);
			fixture3.addFlag(Flag.CHECK);
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	public PgnMove getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new PgnMove(new Player("", GamePieceColor.Black), "0123456789");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	public PgnMove getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new PgnMove(new Player("", GamePieceColor.Black), "0123456789");
			fixture5.addFlag(Flag.AMBIGUOUS);
			fixture5.addFlag(Flag.AMBIGUOUS);
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	public PgnMove getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new PgnMove(new Player("", GamePieceColor.Black), "0123456789");
			fixture6.addFlag(Flag.AMBIGUOUS);
			fixture6.addFlag(Flag.CAPTURE);
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PgnMove
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	public PgnMove getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new PgnMove(new Player("", GamePieceColor.Black), "0123456789");
			fixture7.addFlag(Flag.AMBIGUOUS);
			fixture7.addFlag(Flag.CHECK);
		}
		return fixture7;
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_1()
		throws Exception {
		Player player = new Player("");
		String hit = "";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getPiece());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_2()
		throws Exception {
		Player player = new Player("", GamePieceColor.Black);
		String hit = "0123456789";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPosition());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_3()
		throws Exception {
		Player player = new Player("", GamePieceColor.Black, false);
		String hit = "0123456789";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPosition());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_4()
		throws Exception {
		Player player = new Player("0123456789", GamePieceColor.NULL);
		String hit = "0123456789";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPosition());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_5()
		throws Exception {
		Player player = new Player("0123456789", GamePieceColor.NULL, true);
		String hit = "0123456789";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPosition());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_6()
		throws Exception {
		Player player = new Player("An??t-1.0.txt", GamePieceColor.White, true);
		String hit = "0123456789";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPosition());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_7()
		throws Exception {
		Player player = new Player(GamePieceColor.Black);
		String hit = "0123456789";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPosition());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_8()
		throws Exception {
		Player player = new Player("", GamePieceColor.Black);
		String hit = "";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getPiece());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_9()
		throws Exception {
		Player player = new Player("", GamePieceColor.Black, false);
		String hit = "";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getPiece());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_10()
		throws Exception {
		Player player = new Player("0123456789", GamePieceColor.NULL);
		String hit = "";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getPiece());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_11()
		throws Exception {
		Player player = new Player("0123456789", GamePieceColor.NULL, true);
		String hit = "";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getPiece());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_12()
		throws Exception {
		Player player = new Player("An??t-1.0.txt", GamePieceColor.White, true);
		String hit = "";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getPiece());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_13()
		throws Exception {
		Player player = new Player(GamePieceColor.Black);
		String hit = "";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getPiece());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the PgnMove(Player,String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testPgnMove_14()
		throws Exception {
		Player player = new Player("");
		String hit = "0123456789";

		PgnMove result = new PgnMove(player, hit);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPosition());
		assertEquals(false, result.hasFlags());
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture1_1()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.AMBIGUOUS;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture2_1()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.CAPTURE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture3_1()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.CHECK;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture4_1()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CHECKMATE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture5_1()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.KCASTLE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture6_1()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.PROMOTE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture7_1()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.QCASTLE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture2_2()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.AMBIGUOUS;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture3_2()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.CAPTURE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture4_2()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CHECK;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture5_2()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CHECKMATE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture6_2()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.KCASTLE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture7_2()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.PROMOTE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture1_2()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.QCASTLE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture3_3()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.AMBIGUOUS;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture4_3()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CAPTURE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture5_3()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CHECK;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture6_3()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CHECKMATE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture7_3()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.KCASTLE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture1_3()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.PROMOTE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture2_3()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.QCASTLE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture4_4()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.AMBIGUOUS;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture5_4()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CAPTURE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture6_4()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CHECK;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture7_4()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.CHECKMATE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture1_4()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.KCASTLE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture2_4()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.PROMOTE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture3_4()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.QCASTLE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture5_5()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.AMBIGUOUS;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void addFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testAddFlag_fixture6_5()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CAPTURE;

		fixture.addFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture1_1()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.AMBIGUOUS;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture2_1()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.CAPTURE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture3_1()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.CHECK;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture4_1()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CHECKMATE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture5_1()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.KCASTLE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture6_1()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.PROMOTE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture7_1()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.QCASTLE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture2_2()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.AMBIGUOUS;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture3_2()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.CAPTURE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture4_2()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CHECK;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture5_2()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CHECKMATE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture6_2()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.KCASTLE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture7_2()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.PROMOTE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture1_2()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.QCASTLE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture3_3()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.AMBIGUOUS;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture4_3()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CAPTURE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture5_3()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CHECK;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture6_3()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CHECKMATE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture7_3()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.KCASTLE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture1_3()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.PROMOTE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture2_3()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.QCASTLE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture4_4()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.AMBIGUOUS;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture5_4()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CAPTURE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture6_4()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CHECK;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture7_4()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.CHECKMATE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture1_4()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.KCASTLE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture2_4()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.PROMOTE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture3_4()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.QCASTLE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture5_5()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.AMBIGUOUS;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the void delFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testDelFlag_fixture6_5()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CAPTURE;

		fixture.delFlag(flag);

		// add additional test code here
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture1_1()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.AMBIGUOUS;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture2_1()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.CAPTURE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture3_1()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.CHECK;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture4_1()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CHECKMATE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture5_1()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.KCASTLE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture6_1()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.PROMOTE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture7_1()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.QCASTLE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture2_2()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.AMBIGUOUS;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture3_2()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.CAPTURE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture4_2()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CHECK;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture5_2()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CHECKMATE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture6_2()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.KCASTLE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture7_2()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.PROMOTE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture1_2()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.QCASTLE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture3_3()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.AMBIGUOUS;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture4_3()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CAPTURE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture5_3()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CHECK;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture6_3()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CHECKMATE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture7_3()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.KCASTLE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture1_3()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.PROMOTE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture2_3()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.QCASTLE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture4_4()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.AMBIGUOUS;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture5_4()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CAPTURE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture6_4()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CHECK;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture7_4()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.CHECKMATE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture1_4()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.KCASTLE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture2_4()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.PROMOTE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture3_4()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.QCASTLE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture5_5()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.AMBIGUOUS;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getAttribute(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetAttribute_fixture6_5()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CAPTURE;

		Object result = fixture.getAttribute(flag);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Flag> getFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetFlags_fixture1_1()
		throws Exception {
		PgnMove fixture = getFixture1();

		List<Flag> result = fixture.getFlags();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<Flag> getFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetFlags_fixture2_1()
		throws Exception {
		PgnMove fixture = getFixture2();

		List<Flag> result = fixture.getFlags();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<Flag> getFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetFlags_fixture3_1()
		throws Exception {
		PgnMove fixture = getFixture3();

		List<Flag> result = fixture.getFlags();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<Flag> getFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetFlags_fixture4_1()
		throws Exception {
		PgnMove fixture = getFixture4();

		List<Flag> result = fixture.getFlags();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Flag> getFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetFlags_fixture5_1()
		throws Exception {
		PgnMove fixture = getFixture5();

		List<Flag> result = fixture.getFlags();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<Flag> getFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetFlags_fixture6_1()
		throws Exception {
		PgnMove fixture = getFixture6();

		List<Flag> result = fixture.getFlags();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<Flag> getFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetFlags_fixture7_1()
		throws Exception {
		PgnMove fixture = getFixture7();

		List<Flag> result = fixture.getFlags();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the GamePieceType getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPiece_fixture1_1()
		throws Exception {
		PgnMove fixture = getFixture1();

		GamePieceType result = fixture.getPiece();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePieceType getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPiece_fixture2_1()
		throws Exception {
		PgnMove fixture = getFixture2();

		GamePieceType result = fixture.getPiece();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePieceType getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPiece_fixture3_1()
		throws Exception {
		PgnMove fixture = getFixture3();

		GamePieceType result = fixture.getPiece();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePieceType getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPiece_fixture4_1()
		throws Exception {
		PgnMove fixture = getFixture4();

		GamePieceType result = fixture.getPiece();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getValue());
		assertEquals("Pawn", result.name());
		assertEquals("Pawn", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the GamePieceType getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPiece_fixture5_1()
		throws Exception {
		PgnMove fixture = getFixture5();

		GamePieceType result = fixture.getPiece();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getValue());
		assertEquals("Pawn", result.name());
		assertEquals("Pawn", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the GamePieceType getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPiece_fixture6_1()
		throws Exception {
		PgnMove fixture = getFixture6();

		GamePieceType result = fixture.getPiece();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getValue());
		assertEquals("Pawn", result.name());
		assertEquals("Pawn", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the GamePieceType getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPiece_fixture7_1()
		throws Exception {
		PgnMove fixture = getFixture7();

		GamePieceType result = fixture.getPiece();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getValue());
		assertEquals("Pawn", result.name());
		assertEquals("Pawn", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the Player getPlayer() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPlayer_fixture1_1()
		throws Exception {
		PgnMove fixture = getFixture1();

		Player result = fixture.getPlayer();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[NULL \"\"]", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isLocal());
	}

	/**
	 * Run the Player getPlayer() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPlayer_fixture2_1()
		throws Exception {
		PgnMove fixture = getFixture2();

		Player result = fixture.getPlayer();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[NULL \"\"]", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isLocal());
	}

	/**
	 * Run the Player getPlayer() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPlayer_fixture3_1()
		throws Exception {
		PgnMove fixture = getFixture3();

		Player result = fixture.getPlayer();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[NULL \"\"]", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isLocal());
	}

	/**
	 * Run the Player getPlayer() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPlayer_fixture4_1()
		throws Exception {
		PgnMove fixture = getFixture4();

		Player result = fixture.getPlayer();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Black \"\"]", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isLocal());
	}

	/**
	 * Run the Player getPlayer() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPlayer_fixture5_1()
		throws Exception {
		PgnMove fixture = getFixture5();

		Player result = fixture.getPlayer();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Black \"\"]", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isLocal());
	}

	/**
	 * Run the Player getPlayer() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPlayer_fixture6_1()
		throws Exception {
		PgnMove fixture = getFixture6();

		Player result = fixture.getPlayer();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Black \"\"]", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isLocal());
	}

	/**
	 * Run the Player getPlayer() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPlayer_fixture7_1()
		throws Exception {
		PgnMove fixture = getFixture7();

		Player result = fixture.getPlayer();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Black \"\"]", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isLocal());
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPosition_fixture1_1()
		throws Exception {
		PgnMove fixture = getFixture1();

		Position result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals("X-1", result.toString());
		assertEquals('X', result.getFile());
		assertEquals(-1, result.getRank());
		assertEquals(false, result.isStartPosition());
		assertEquals("NONE", result.name());
		assertEquals(64, result.ordinal());
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPosition_fixture2_1()
		throws Exception {
		PgnMove fixture = getFixture2();

		Position result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals("X-1", result.toString());
		assertEquals('X', result.getFile());
		assertEquals(-1, result.getRank());
		assertEquals(false, result.isStartPosition());
		assertEquals("NONE", result.name());
		assertEquals(64, result.ordinal());
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPosition_fixture3_1()
		throws Exception {
		PgnMove fixture = getFixture3();

		Position result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals("X-1", result.toString());
		assertEquals('X', result.getFile());
		assertEquals(-1, result.getRank());
		assertEquals(false, result.isStartPosition());
		assertEquals("NONE", result.name());
		assertEquals(64, result.ordinal());
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPosition_fixture4_1()
		throws Exception {
		PgnMove fixture = getFixture4();

		Position result = fixture.getPosition();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPosition_fixture5_1()
		throws Exception {
		PgnMove fixture = getFixture5();

		Position result = fixture.getPosition();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPosition_fixture6_1()
		throws Exception {
		PgnMove fixture = getFixture6();

		Position result = fixture.getPosition();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testGetPosition_fixture7_1()
		throws Exception {
		PgnMove fixture = getFixture7();

		Position result = fixture.getPosition();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture1_1()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.AMBIGUOUS;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture2_1()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.CAPTURE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture3_1()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.CHECK;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture4_1()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CHECKMATE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture5_1()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.KCASTLE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture6_1()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.PROMOTE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture7_1()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.QCASTLE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture2_2()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.AMBIGUOUS;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture3_2()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.CAPTURE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture4_2()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CHECK;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture5_2()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CHECKMATE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture6_2()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.KCASTLE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture7_2()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.PROMOTE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture1_2()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.QCASTLE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture3_3()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.AMBIGUOUS;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture4_3()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.CAPTURE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture5_3()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CHECK;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture6_3()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CHECKMATE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture7_3()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.KCASTLE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture1_3()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.PROMOTE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture2_3()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.QCASTLE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture4_4()
		throws Exception {
		PgnMove fixture = getFixture4();
		Flag flag = Flag.AMBIGUOUS;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture5_4()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.CAPTURE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture6_4()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CHECK;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture7_4()
		throws Exception {
		PgnMove fixture = getFixture7();
		Flag flag = Flag.CHECKMATE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture1_4()
		throws Exception {
		PgnMove fixture = getFixture1();
		Flag flag = Flag.KCASTLE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture2_4()
		throws Exception {
		PgnMove fixture = getFixture2();
		Flag flag = Flag.PROMOTE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture3_4()
		throws Exception {
		PgnMove fixture = getFixture3();
		Flag flag = Flag.QCASTLE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture5_5()
		throws Exception {
		PgnMove fixture = getFixture5();
		Flag flag = Flag.AMBIGUOUS;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlag(Flag) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlag_fixture6_5()
		throws Exception {
		PgnMove fixture = getFixture6();
		Flag flag = Flag.CAPTURE;

		boolean result = fixture.hasFlag(flag);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlags_fixture1_1()
		throws Exception {
		PgnMove fixture = getFixture1();

		boolean result = fixture.hasFlags();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlags_fixture2_1()
		throws Exception {
		PgnMove fixture = getFixture2();

		boolean result = fixture.hasFlags();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlags_fixture3_1()
		throws Exception {
		PgnMove fixture = getFixture3();

		boolean result = fixture.hasFlags();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlags_fixture4_1()
		throws Exception {
		PgnMove fixture = getFixture4();

		boolean result = fixture.hasFlags();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlags_fixture5_1()
		throws Exception {
		PgnMove fixture = getFixture5();

		boolean result = fixture.hasFlags();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlags_fixture6_1()
		throws Exception {
		PgnMove fixture = getFixture6();

		boolean result = fixture.hasFlags();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasFlags() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testHasFlags_fixture7_1()
		throws Exception {
		PgnMove fixture = getFixture7();

		boolean result = fixture.hasFlags();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testInitialize_fixture1_1()
		throws Exception {
		PgnMove fixture = getFixture1();

		fixture.initialize();

		// add additional test code here
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testInitialize_fixture2_1()
		throws Exception {
		PgnMove fixture = getFixture2();

		fixture.initialize();

		// add additional test code here
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testInitialize_fixture3_1()
		throws Exception {
		PgnMove fixture = getFixture3();

		fixture.initialize();

		// add additional test code here
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testInitialize_fixture4_1()
		throws Exception {
		PgnMove fixture = getFixture4();

		fixture.initialize();

		// add additional test code here
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testInitialize_fixture5_1()
		throws Exception {
		PgnMove fixture = getFixture5();

		fixture.initialize();

		// add additional test code here
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testInitialize_fixture6_1()
		throws Exception {
		PgnMove fixture = getFixture6();

		fixture.initialize();

		// add additional test code here
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testInitialize_fixture7_1()
		throws Exception {
		PgnMove fixture = getFixture7();

		fixture.initialize();

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		PgnMove fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("llunllun", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		PgnMove fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("xllun", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testToString_fixture3_1()
		throws Exception {
		PgnMove fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("llun+", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testToString_fixture4_1()
		throws Exception {
		PgnMove fixture = getFixture4();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.pgn.PgnMove.toString(PgnMove.java:242)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testToString_fixture5_1()
		throws Exception {
		PgnMove fixture = getFixture5();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.pgn.PgnMove.toString(PgnMove.java:242)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testToString_fixture6_1()
		throws Exception {
		PgnMove fixture = getFixture6();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.pgn.PgnMove.toString(PgnMove.java:242)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	@Test
	public void testToString_fixture7_1()
		throws Exception {
		PgnMove fixture = getFixture7();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.pgn.PgnMove.toString(PgnMove.java:242)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:21 PM
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
	 * @generatedBy CodePro at 3/19/09 10:21 PM
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
	 * @generatedBy CodePro at 3/19/09 10:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PgnMoveTest.class);
	}
}