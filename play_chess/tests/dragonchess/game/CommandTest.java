package dragonchess.game;

import junit.framework.TestCase;
import org.junit.*;
import dragonchess.pgn.Hit;
import dragonchess.game.commands.DrawCommand;
import dragonchess.game.commands.UndoCommand;
import dragonchess.game.commands.ResignCommand;
import dragonchess.game.commands.HitCommand;
import static org.junit.Assert.*;

/**
 * The class <code>CommandTest</code> contains tests for the class <code>{@link Command}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:06 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class CommandTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Command
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	private Command fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Command
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	private Command fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Command
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	private Command fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Command
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	private Command fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Command
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	public Command getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DrawCommand(new Player(""));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Command
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	public Command getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new HitCommand(new Hit("", ""));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Command
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	public Command getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new ResignCommand(new Player(""));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Command
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	public Command getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new UndoCommand();
		}
		return fixture4;
	}

	/**
	 * Run the void execute() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testExecute_fixture1_1()
		throws Exception {
		Command fixture = getFixture1();

		fixture.execute();

		// add additional test code here
	}

	/**
	 * Run the void execute() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testExecute_fixture2_1()
		throws Exception {
		Command fixture = getFixture2();

		fixture.execute();

		// add additional test code here
	}

	/**
	 * Run the void execute() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testExecute_fixture3_1()
		throws Exception {
		Command fixture = getFixture3();

		fixture.execute();

		// add additional test code here
	}

	/**
	 * Run the void execute() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:06 PM
	 */
	@Test
	public void testExecute_fixture4_1()
		throws Exception {
		Command fixture = getFixture4();

		fixture.execute();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(CommandTest.class);
	}
}
