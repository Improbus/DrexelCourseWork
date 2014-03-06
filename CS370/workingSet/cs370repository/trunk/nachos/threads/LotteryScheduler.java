package nachos.threads;

import nachos.machine.*;
<<<<<<< .mine

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
=======
import java.util.*;
>>>>>>> .r53
/**
 * A scheduler that chooses threads using a lottery.
 *
 * <p>
 * A lottery scheduler associates a number of tickets with each thread. When a
 * thread needs to be dequeued, a random lottery is held, among all the tickets
 * of all the threads waiting to be dequeued. The thread that holds the winning
 * ticket is chosen.
 *
 * <p>
 * Note that a lottery scheduler must be able to handle a lot of tickets
 * (sometimes billions), so it is not acceptable to maintain state for every
 * ticket.
 *
 * <p>
 * A lottery scheduler must partially solve the priority inversion problem; in
 * particular, tickets must be transferred through locks, and through joins.
 * Unlike a priority scheduler, these tickets add (as opposed to just taking
 * the maximum).
 */
<<<<<<< .mine
public class LotteryScheduler extends PriorityScheduler {
    /**
     * Allocate a new lottery scheduler.
     */
    public LotteryScheduler() {
    }
    
    /**
     * Allocate a new lottery thread queue.
     *
     * @param	transferPriority	<tt>true</tt> if this queue should
     *					transfer tickets from waiting threads
     *					to the owning thread.
     * @return	a new lottery thread queue.
     */
    public ThreadQueue newThreadQueue(boolean transferPriority) {
			return new LotteryQueue(transferPriority);
    }
=======

public class LotteryScheduler extends Scheduler {

	public static int getPriorityDefault() {
		return priorityDefault;
	}

	public static int getPriorityMaximum() {
		return priorityMaximum;
	}

	public static int getPriorityMinimum() {
		return priorityMinimum;
	}

	/**
	 * Allocate a new Lottery scheduler.
	 */
	public LotteryScheduler() {
	}

	/**
	 * Allocate a new priority thread queue.
	 *
	 * @param transferPriority
	 * <tt>true</tt> if this queue should transfer priority from
	 * waiting threads to the owning thread.
	 * @return a new priority thread queue.
	 */
	public ThreadQueue newThreadQueue(boolean transferPriority) {
		return new PriorityQueue(transferPriority);
	}

	public int getPriority(KThread thread) {
		Lib.assertTrue(Machine.interrupt().disabled());

		return getThreadState(thread).getPriority();
	}

	public int getEffectivePriority(KThread thread) {
		Lib.assertTrue(Machine.interrupt().disabled());

		return getThreadState(thread).getEffectivePriority();
	}

	public void setPriority(KThread thread, int priority) {
		Lib.assertTrue(Machine.interrupt().disabled());

		Lib.assertTrue(priority >= priorityMinimum && priority <= priorityMaximum);

		getThreadState(thread).setPriority(priority);
	}

	public boolean increasePriority() {
		boolean intStatus = Machine.interrupt().disable();

		KThread thread = KThread.currentThread();

		int priority = getPriority(thread);
		if (priority == priorityMaximum)
			return false;

		setPriority(thread, priority + 1);

		Machine.interrupt().restore(intStatus);
		return true;
	}

	public boolean decreasePriority() {
		boolean intStatus = Machine.interrupt().disable();

		KThread thread = KThread.currentThread();

		int priority = getPriority(thread);
		if (priority == priorityMinimum)
			return false;

		setPriority(thread, priority - 1);

		Machine.interrupt().restore(intStatus);
		return true;
	}

	/**
	 * The default priority for a new thread. Do not change this value.
	 */
	public static final int priorityDefault = 1;

	/**
	 * The minimum priority that a thread can have. Do not change this value.
	 */
	public static final int priorityMinimum = 1; //Value had to be changed to fit the implementation correctly

	/**
	 * The maximum priority that a thread can have. Do not change this value.
	 */
	public static final int priorityMaximum = Integer.MAX_VALUE; //Value had to be changed to fit the implementation correctly

	/**
	 * Return the scheduling state of the specified thread.
	 *
	 * @param	thread	the thread whose scheduling state to return.
	 * @return	the scheduling state of the specified thread.
	 */
	protected ThreadState getThreadState(KThread thread) {
		if (thread.schedulingState == null)
			thread.schedulingState = new ThreadState(thread);

		return (ThreadState) thread.schedulingState;
	}

	/**
	 * A <tt>ThreadQueue</tt> that sorts threads by priority.
	 */

	protected class PriorityQueue extends ThreadQueue{

		//Constructor 
		PriorityQueue(boolean transferPriority) {
			this.transferPriority = transferPriority;
		}

		public void waitForAccess(KThread thread) {
			Lib.assertTrue(Machine.interrupt().disabled());
			getThreadState(thread).waitForAccess(this);
		}

		public void acquire(KThread thread) {
			Lib.assertTrue(Machine.interrupt().disabled());
			getThreadState(thread).acquire(this);
		}


		public KThread nextThread() {
			
			Lib.assertTrue(Machine.interrupt().disabled());

			//If the lock is null then remove this thread			
			if(lockQueue != null){
				lockQueue.queue.remove(this);  //remove the thread from the queue
			}

			ThreadState temp = this.pickNextThread(); //Create a temp ThreadState to check for the next thread state

			KThread nextThread = null; //Create a thread to be returned
			
			//as long as temp is not null then assign it as the next thread and aquire a lock			
			if(temp != null){
				nextThread = temp.thread;
				temp.acquire(this);
				
			} 
			else{
				nextThread = null; //if the temp is null then the next thread is null	
			}

			return nextThread;  //return the next thread
			
		}


		protected ThreadState pickNextThread(){

			ThreadState nextThread = null;  //Next Thread State
			 
			int priorityNextThread = 0; //The numerical priority of the next thread

			int count = 0; //sum count for all the priorities

			int lottoCount = 0; //current lottery priority sum

			LinkedList<Integer> lottery = new LinkedList<Integer>();  //Linked List of integers to hold the lottery priorities

			if(wait.isEmpty()){

				//Checks if the wait Queue is Empty and returns null if it is.

				return nextThread;

			}
			else{

			for(int i = 0; i < wait.size(); i++){
				//Gets the effective priority for each thread in the wait queue
				int lottoPriority = wait.get(i).getEffectivePriority();
				
				//Add the priority to the lottery linked list of priorities
				lottery.add(lottoPriority);
	
				//Increase the lottoCount to the sum of all the Priorities
				lottoCount += lottoPriority;

			}
			
			//Uses a random Number in he range of the priority
			Random num = new Random();

			//Number that is generated for Priority Donation
			int smallerPriority  = num.nextInt(lottoCount); 

			//Loop Through all of the priorities and add the count to them as long as it increases the number
			//This is essentially where the donation happens
			while(count + lottery.get(priorityNextThread) <= smallerPriority){

				count += lottery.get(priorityNextThread++);  //Add the count to the priority of the Next thread chosen

			}
			
			//set the next thread to the thread state of the priority of the next thread
			nextThread = (ThreadState) wait.get(priorityNextThread);

			//return the next thread
			return nextThread;
		}

		}

		public void print() {
			Lib.assertTrue(Machine.interrupt().disabled());
			//Implement me if you want
		}

		/**
		 * <tt>true</tt> Decreases the waiting Counter
		 */

		/**
		 * <tt>true</tt> if this queue should transfer priority from waiting
		 * threads to the owning thread.
		 */
		
		KThread lock = null; //Left over from Priority Scheduler
		ThreadState lockQueue = null; //Serves the same purpose as lock but uses a ThreadState as the mutex locking mechanism
		boolean transferPriority;  //Whether the transfer of priorities is valid or not
		LinkedList<ThreadState> wait = new LinkedList<ThreadState>(); //the wait queue in the form of a linked list of thread states

		//Getters and Setters for all the vars
		public ThreadState getLockQueue() {
			return lockQueue;
		}

		public void setLockQueue(ThreadState lockQueue) {
			this.lockQueue = lockQueue;
		}

		public boolean isTransferPriority() {
			return transferPriority;
		}

		public void setTransferPriority(boolean transferPriority) {
			this.transferPriority = transferPriority;
		}

		public LinkedList<ThreadState> getWait() {
			return wait;
		}

		public void setWait(LinkedList<ThreadState> wait) {
			this.wait = wait;
		}
		


	}

	/**
	 * The scheduling state of a thread. This should include the thread's
	 * priority, its effective priority, any objects it owns, and the queue
	 * it's waiting for, if any.
	 *
	 * @see	nachos.threads.KThread#schedulingState
	 */
	protected class ThreadState {
		/**
		 * Allocate a new <tt>ThreadState</tt> object and associate it with the
		 * specified thread.
		 *
		 * @param	thread	the thread this state belongs to.
		 */
		public ThreadState(KThread thread) {
			
			this.thread = thread;

			setPriority(priorityDefault);
		}

		/**
		 * Return the priority of the associated thread.
		 *
		 * @return	the priority of the associated thread.
		 */
		public int getPriority() {
			return priority;
		}

		/**
		 * Set the priority of the associated thread to the specified value.
		 *
		 * @param	priority	the new priority.
		 */
		public void setPriority(int priority) {

			if (this.priority == priority){
				return;  //If it is already set leave it alone
			}

			this.priority = priority; //Set the priority

			ep = this.count; //reset the effective priority when the regular priority is set.
		}

		/**
		 * Return the effective priority of the associated thread.
		 *
		 * @return	the effective priority of the associated thread.
		 */

		//here I had to separate the calculation from the definition so that the sum of the lottery priorities would be correct
		public int getEffectivePriority() {
			
			//If the EP isn't equal to the count then the ep is already correct so return
			if (ep != count){
				return ep;				

			}
			else{
				//any other time calculate the effectivePriority with 1 as the passed priority
				ep = EffectivePriority(1);
			}

			return ep; //return the EP when calculation is done
		}


		//Properly Calculates the lottery priority for the current ThreadState, separated from previous version to insure the correct priority
		public int EffectivePriority(int x) {

			//Integer to Hold Priority
			int p = priority; 
			//if the passed priority is 0 than the effective priority is itself so it is returned.
			if (x != 0){
				
			//Iterate the PriorityQueue which is a hash
			for (Iterator i = queue.iterator(); i.hasNext();) {
				//Create a temporary queue to hold the current Priority queue being processed
				PriorityQueue tempQ = (PriorityQueue) i.next();
				
				//Traverse the temporary Priority queue and calculate the effective priority recursively then add that priority to the priority returned
				for (int j = 0; j < tempQ.wait.size(); j++) {

					int priorityToAdd = tempQ.wait.get(j).EffectivePriority(x - 1);  //calculate the priority to add to the current effective priority

					p += priorityToAdd; //calculate the sum priority and return it. 
				}
			}

			return p;	//return priority after inversly donating the priority			
		}
			else{

				return p; //If the passed value during the recursion is 0 then return the priority.  Recursion Protection.
			
			}
		}

		/**
		 * Called when <tt>waitForAccess(thread)</tt> (where <tt>thread</tt> is
		 * the associated thread) is invoked on the specified priority queue.
		 * The associated thread is therefore waiting for access to the
		 * resource guarded by <tt>waitQueue</tt>. This method is only called
		 * if the associated thread cannot immediately obtain access.
		 *
		 * @param	waitQueue	the queue that the associated thread is
		 *				now waiting on.
		 *
		 * @see	nachos.threads.ThreadQueue#waitForAccess
		 */
		public void waitForAccess(PriorityQueue wait) {
			
			//add the passed wait queue and add it to the larger wait queue creating a double nested wait queue	
			wait.wait.add(this);
			
			//If the transfer priority is valid then set the effective Priority to the count else just return.
			if (wait.transferPriority){
				ep = count;
			}
			else{
				return;
			}
		
			
		}


		/**
		 * Called when the associated thread has acquired access to whatever is
		 * guarded by <tt>waitQueue</tt>. This can occur either as a result of
		 * <tt>acquire(thread)</tt> being invoked on <tt>waitQueue</tt> (where
		 * <tt>thread</tt> is the associated thread), or as a result of
		 * <tt>nextThread()</tt> being invoked on <tt>waitQueue</tt>.
		 *
		 * @see	nachos.threads.ThreadQueue#acquire
		 * @see	nachos.threads.ThreadQueue#nextThread
		 */
		public void acquire(PriorityQueue wait) {
			
			Lib.assertTrue(Machine.interrupt().disabled());			

			wait.lockQueue = this; //Lock the queue for editing
			 
			wait.wait.remove(this); //Remove the queue from the nested queue
			
			queue.add(wait);  //add the wait queue to the hash set for storage
			
			ep = count; //reset the effective priority to the current count
			
		}
		
		
		//Release Mechanism for the mutex lock
		public void release(PriorityQueue wait)
		{

			this.queue.remove(wait);

			wait.lock = null;

		}


		/** The thread with which this object is associated. */
		protected KThread thread;
		/** The priority of the associated thread. */
		protected int priority; //Actual riority
		protected int count = -1; // Count set to -1 to ensure the priority is set correctly at start 
		protected int ep = -1;  //Effective priority set to -1 at first so count is validated
		public HashSet<PriorityQueue> queue = new HashSet<PriorityQueue>();  //Changed from LinkedList to HashSet for  quicker easier access and functionality

		//getters and setters for all of the vars		

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public int getEp() {
			return ep;
		}

		public void setEp(int ep) {
			this.ep = ep;
		}

		public HashSet<PriorityQueue> getQueue() {
			return queue;
		}

		public void setQueue(HashSet<PriorityQueue> queue) {
			this.queue = queue;
		}

		public KThread getThread() {
			return thread;
		}

		public void setThread(KThread thread) {
			this.thread = thread;
		}
	}
>>>>>>> .r53

		protected class LotteryQueue extends PriorityQueue{
		
		LotteryQueue(boolean transferPriority){
			super( transferPriority );
		}

		public void waitForAccess(KThread thread) {
      Lib.assertTrue(Machine.interrupt().disabled());
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
      getThreadState(thread).waitForAccess(this);
    }

    public void acquire(KThread thread) {
      Lib.assertTrue(Machine.interrupt().disabled());
      getThreadState(thread).acquire(this);
    }




		 public KThread nextThread() {

      Lib.assertTrue(Machine.interrupt().disabled());
    
      LotteryThreadState temp = this.pickNextThread();

      KThread nextThread = null;
      
      if(lockQueue != null){
        lockQueue.queue.remove(this);
      }
      
      if(temp == null){
        nextThread = null;
      } 
      else{
        nextThread = temp.thread;
      }

			System.out.println("ACQUIRE...");
      if(temp != null){

        temp.acquire(this);
 
      }

			System.out.println("DONE " + nextThread);

      return nextThread;
      
    }

		

	
			public LotteryThreadState pickNextThread(){

      LotteryThreadState priorityNextThread = null;
 
      int prioritySecondThread = 0;

      int count = 0;

      int lottoCount = 0;

      LinkedList<Integer> lottery = new LinkedList<Integer>();

      if(wait.size() == 0){

				System.out.println("==========================================");
        return priorityNextThread;

      }

      for(int i = 0; i < wait.size(); i++){

        int lottoPriority = wait.get(i).getEffectivePriority();

        lottery.add(lottoPriority);

        lottoCount += lottoPriority;

      }

      Random num = new Random();

      int smallerPriority  = num.nextInt(lottoCount);

      while(count + lottery.get(prioritySecondThread) <= smallerPriority){

        count += lottery.get(prioritySecondThread++);

      }

      priorityNextThread = (LotteryThreadState) wait.get(prioritySecondThread);

			System.out.println("?? = " + priorityNextThread);

      return priorityNextThread;

    }

    LotteryThreadState lockQueue = null;
		boolean transferPriority;
		LinkedList<LotteryThreadState> wait = new LinkedList<LotteryThreadState>();

	}

	protected class LotteryThreadState extends ThreadState{

			public LotteryThreadState(KThread thread) {
      	super(thread);
				setPriority(priorityDefault);
    	}

			public void waitForAccess(LotteryQueue wait) {
System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
      wait.wait.add(this);

      if (wait.transferPriority == false){

        return;

      }

      ep = count;
    }


	//here I had to separate the calculation from the definition so that the sum of the lottery priorities would be correct
    public int getEffectivePriority() {
    
      if (ep == count){

        ep = EffectivePriority(1);
 
      }

      return ep;
    }

	//Properly Calculates the lottery priority for the current ThreadState, separated from previous version to insure the correct priority
    public int EffectivePriority(int x) {
    
      int p = priority;
  
      if (x == 0){

        return p;

      }

      for (Iterator i = queue.iterator(); i.hasNext();) {

        LotteryQueue tempQ = (LotteryQueue) i.next();

        for (int j = 0; j < tempQ.wait.size(); j++) {

          int y = tempQ.wait.get(j).EffectivePriority(x - 1);

          p += y;
        }
      }

      return p;
    }
	
	public void setPriority(int priority) {
 
      if (this.priority == priority){
      
        return;
      
      }

      this.priority = priority;

      ep = count;
    }
		

		 public void acquire(LotteryQueue wait) {

      wait.lockQueue = this;

      wait.wait.remove(this);

      queue.add(wait);

      ep = count;

    }
   
    public void release(LotteryQueue wait)
    {

      this.queue.remove(wait);

      wait.lock = null;

    }

	/** The thread with which this object is associated. */
    protected KThread thread;
    /** The priority of the associated thread. */
    protected int priority;
    protected int count = -1;
    protected int ep = -1; 
    public HashSet<LotteryQueue> queue = new HashSet<LotteryQueue>();
	
	
	}
}

