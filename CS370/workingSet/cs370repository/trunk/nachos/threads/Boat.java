package nachos.threads;
import nachos.ag.BoatGrader;

public class Boat
{
    static BoatGrader bg;
    static int nChildAtO;
    static int nChildAtM;
    static int nAdultAtO;
    static int nAdultAtM;
    static int childrenMoved;
    static int emptySeatsOnBoat;
    static Semaphore boatO; // make this 1 initiakkt
    static Semaphore boatM; // 0
    static Semaphore childAtM;
    static Semaphore seatOnBoat; // (i.e. At O) init to 2
    static Semaphore waitingForSecondChild;
    static Semaphore syncChildOutput;
    static Semaphore finished;
    static Lock dataLock;
    
    public static void selfTest()
    {
	BoatGrader b = new BoatGrader();
	
	System.out.println("\n ***Testing Boats with only 2 children***");
	begin(0, 2, b);

	System.out.println("\n ***Testing Boats with 2 children, 1 adult***");
  	begin(1, 2, b);

  	System.out.println("\n ***Testing Boats with 3 children, 3 adults***");
  	begin(3, 3, b);

	System.out.println("\n ***Testing Boats with 10 children, 10 adults***");
	begin(10, 10, b);
    }

    public static void begin( int adults, int children, BoatGrader b )
    {
	// Store the externally generated autograder in a class
	// variable to be accessible by children.
	bg = b;
	nChildAtO = children;
	nAdultAtO = adults;

	// Instantiate global variables here
	boatO = new Semaphore(1);
	boatM = new Semaphore(0);
	childAtM = new Semaphore(0);
	seatOnBoat = new Semaphore(2);
	waitingForSecondChild = new Semaphore(0);
	syncChildOutput = new Semaphore(0);
	finished = new Semaphore(0);
	dataLock = new Lock();
	emptySeatsOnBoat = 2;
	
	// Create threads here. See section 3.4 of the Nachos for Java
	// Walkthrough linked from the projects page.

	for (int i=0; i<adults; i++)
	{	
	Runnable r = new Runnable() {
	    public void run() {
                AdultItinerary();
            }
        };
        KThread t = new KThread(r);
        t.setName("Adult Thread");
        t.fork();
	}

	for (int i=0; i<children; i++)
	{
	Runnable r = new Runnable() {
	    public void run() {
                ChildItinerary();
            }
        };
        KThread t = new KThread(r);
        t.setName("Child Thread");
        t.fork();
	}

	finished.P();

	System.out.println("We are finished");
    }

    static void AdultItinerary()
    {
	/* This is where you should put your solutions. Make calls
	   to the BoatGrader to show that it is synchronized. For
	   example:
	       bg.AdultRowToMolokai();
	   indicates that an adult has rowed the boat across to Molokai
	*/
	    childAtM.P();
	    childAtM.P();
	    boatO.P();
	    bg.AdultRowToMolokai();
	    dataLock.acquire();
	    nAdultAtO--;
	    dataLock.release();
	    boatM.V();
    }

    static void ChildItinerary()
    {
	    int childLocation = 0;

	    while (true) // unsure if this is considered a tight loop
	    {
		if (childLocation == 0)
		{
			if (emptySeatsOnBoat == 2 && nChildAtO != 0)
			{
				dataLock.acquire();
				emptySeatsOnBoat--;
				dataLock.release();
				waitingForSecondChild.P();
				bg.ChildRideToMolokai();
				syncChildOutput.V();
				childLocation = 1;
				childAtM.V();
			}
			else
			{
				boatO.P();
				bg.ChildRowToMolokai();
				waitingForSecondChild.V();
				if (emptySeatsOnBoat != 2)
				{
					syncChildOutput.P();
				}
				dataLock.acquire();
				nChildAtO -= 2;
				nChildAtM += 2;
				emptySeatsOnBoat = 2;
				dataLock.release();
				childLocation = 1;
				childAtM.V();

				// ride back or set to finish
				// there is a race condition there right now
				if (nChildAtO == 0 && nAdultAtO == 0)
				{
					finished.V();
				}
				else
				{
					boatM.V();
				}
			}
		}
		else
		{
			boatM.P();
			bg.ChildRowToOahu();
			dataLock.acquire();
			nChildAtM--;
			nChildAtO++;
			//childAtM.P(); // V b/c he isn't there anymore
			dataLock.release();
			boatO.V();
			childLocation = 0;
		}
	    }
    }

    static void SampleItinerary()
    {
	// Please note that this isn't a valid solution (you can't fit
	// all of them on the boat). Please also note that you may not
	// have a single thread calculate a solution and then just play
	// it back at the autograder -- you will be caught.
	System.out.println("\n ***Everyone piles on the boat and goes to Molokai***");
	bg.AdultRowToMolokai();
	bg.ChildRideToMolokai();
	bg.AdultRideToMolokai();
	bg.ChildRideToMolokai();
    }
    
}
