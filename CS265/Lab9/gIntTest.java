import junit.framework.*;

public class gIntTest extends TestCase {
	
	private gInt a;
	private gInt b;
	private gInt c;
	private gInt d;

	public gIntTest( String name ) 
	{
		super( name );
	}

 	protected void setUp() 
	{
    a = new gInt(1 , 2);
		b = new gInt(-1, 2);
		c = new gInt(1, -2);
		d = new gInt(-1, -2);
	}

	protected void tearDown() {}

	public static Test suite() 
	{
		return new TestSuite( gIntTest.class );
	}
	
	public void testAdd()
	{
		gInt test = a.add(b);
		assertEquals(test, new gInt(0, 4));
	}

	public void testMult()
	{
		gInt test = c.add(d);
		assertEquals(test, new gInt(-1, -4));
	}


	public static void main( String args[] ) 
	{
		String[] caseName = { gIntTest.class.getName() };
		junit.textui.TestRunner.main( caseName );
	}


}

