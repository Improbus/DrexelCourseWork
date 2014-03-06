package dragonchess.network;

import junit.framework.TestCase;
import java.net.InetAddress;
import dragonchess.Main;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DragonChessServerTest</code> contains tests for the class <code>{@link DragonChessServer}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:35 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class DragonChessServerTest extends TestCase{
	/**
	 * Run the DragonChessServer(DataRecipient) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testDragonChessServer_1()
		throws Exception {
		DataRecipient dataRecipient = new Main();

		DragonChessServer result = new DragonChessServer(dataRecipient);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Run the DragonChessServer(DataRecipient,String,int) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testDragonChessServer_2()
		throws Exception {
		DataRecipient dataRecipient = new Main();
		String host = "";
		int port = 0;

		DragonChessServer result = new DragonChessServer(dataRecipient, host, port);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Run the DragonChessServer(DataRecipient,String,int) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testDragonChessServer_3()
		throws Exception {
		DataRecipient dataRecipient = new Main();
		String host = "0123456789";
		int port = 1;

		DragonChessServer result = new DragonChessServer(dataRecipient, host, port);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Run the DragonChessServer(DataRecipient,String,int) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testDragonChessServer_4()
		throws Exception {
		DataRecipient dataRecipient = new Main();
		String host = "";
		int port = 7;

		DragonChessServer result = new DragonChessServer(dataRecipient, host, port);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Run the DragonChessServer(DataRecipient,String,int) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testDragonChessServer_5()
		throws Exception {
		DataRecipient dataRecipient = new Main();
		String host = "";
		int port = 1;

		DragonChessServer result = new DragonChessServer(dataRecipient, host, port);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Run the DragonChessServer(DataRecipient,String,int) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testDragonChessServer_6()
		throws Exception {
		DataRecipient dataRecipient = new Main();
		String host = "0123456789";
		int port = 7;

		DragonChessServer result = new DragonChessServer(dataRecipient, host, port);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Run the DragonChessServer(DataRecipient,String,int) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:35 PM
	 */
	@Test
	public void testDragonChessServer_7()
		throws Exception {
		DataRecipient dataRecipient = new Main();
		String host = "0123456789";
		int port = 0;

		DragonChessServer result = new DragonChessServer(dataRecipient, host, port);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(DragonChessServerTest.class);
	}
}
