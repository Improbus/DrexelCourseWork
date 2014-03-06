package nachos.threads;

import nachos.machine.*;
import nachos.threads.PriorityScheduler.PriorityQueue;
import nachos.threads.PriorityScheduler.ThreadState;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

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
	 * Allocate a new priority scheduler.
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
	public static final int priorityMinimum = 1;

	/**
	 * The maximum priority that a thread can have. Do not change this value.
	 */
	public static final int priorityMaximum = Integer.MAX_VALUE;

	/**
	 * Return the scheduling state of the specified thread.
	 *
	 * @param thread
	 * the thread whose scheduling state to return.
	 * @return the scheduling state of the specified thread.
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

			ThreadState temp = this.pickNextThread();

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

			if(temp != null){

				temp.acquire(this);
			
			}

			return nextThread;
			
		}


		protected ThreadState pickNextThread(){

			ThreadState priorityNextThread = null;
			
			int prioritySecondThread = 0;

			int count = 0;

			int lottoCount = 0;

			LinkedList<Integer> lottery = new LinkedList<Integer>();

			if(wait.size() == 0){

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

			priorityNextThread = (ThreadState) wait.get(prioritySecondThread);

			return priorityNextThread;

		}

		public void print() {
			Lib.assertTrue(Machine.interrupt().disabled());
			
		}
		
		KThread lock = null;
		ThreadState lockQueue = null;
		boolean transferPriority;
		LinkedList<ThreadState> wait = new LinkedList<ThreadState>();

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
	protected class ThreadState {
		/**
		 * Allocate a new <tt>ThreadState</tt> object and associate it with
		 * the specified thread.
		 *
		 * @param thread
		 * the thread this state belongs to.
		 */
		public ThreadState(KThread thread) {
			
			this.thread = thread;

			setPriority(priorityDefault);
		}

		/**
		 * Return the priority of the associated thread.
		 *
		 * @return the priority of the associated thread.
		 */
		public int getPriority() {

			return priority;

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

				PriorityQueue tempQ = (PriorityQueue) i.next();

				for (int j = 0; j < tempQ.wait.size(); j++) {

					int y = tempQ.wait.get(j).EffectivePriority(x - 1);

					p += y;
				}
			}

			return p;
		}

		/**
		 * Set the priority of the associated thread to the specified value.
		 *
		 * @param priority
		 * the new priority.
		 */
		public void setPriority(int priority) {
			
			if (this.priority == priority){
			
				return;
			
			}

			this.priority = priority;

			ep = count;
		}


		/**
		 * Called when <tt>waitForAccess(thread)</tt> (where <tt>thread</tt>
		 * is the associated thread) is invoked on the specified priority queue.
		 * The associated thread is therefore waiting for access to the resource
		 * guarded by <tt>waitQueue</tt>. This method is only called if the
		 * associated thread cannot immediately obtain access.
		 *
		 * @param waitQueue
		 * the queue that the associated thread is now waiting on.
		 *
		 * @see nachos.threads.ThreadQueue#waitForAccess
		 */
		public void waitForAccess(PriorityQueue wait) {
			
			wait.wait.add(this);
			
			if (wait.transferPriority == false){

				return;

			}
		
			ep = count;
		}


		/**
		 * Called when the associated thread has acquired access to whatever is
		 * guarded by <tt>waitQueue</tt>. This can occur either as a result
		 * of <tt>acquire(thread)</tt> being invoked on <tt>waitQueue</tt>
		 * (where <tt>thread</tt> is the associated thread), or as a result of
		 * <tt>nextThread()</tt> being invoked on <tt>waitQueue</tt>.
		 *
		 * @see nachos.threads.ThreadQueue#acquire
		 * @see nachos.threads.ThreadQueue#nextThread
		 */
		public void acquire(PriorityQueue wait) {
			
			wait.lockQueue = this;
			
			wait.wait.remove(this);
			
			queue.add(wait);
			
			ep = count;
			
		}
		
		public void release(PriorityQueue wait)
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
		public HashSet<PriorityQueue> queue = new HashSet<PriorityQueue>();

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
}

