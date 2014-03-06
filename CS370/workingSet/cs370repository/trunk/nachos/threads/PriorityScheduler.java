package nachos.threads;

import nachos.machine.*;

import java.util.LinkedList;
import java.util.TreeSet;
import java.util.HashSet;

/**
 * A scheduler that chooses threads based on their priorities.
 *
 * <p>
 * A priority scheduler associates a priority with each thread. The next thread
 * to be dequeued is always a thread with priority no less than any other
 * waiting thread's priority. Like a round-robin scheduler, the thread that is
 * dequeued is, among all the threads of the same (highest) priority, the
 * thread that has been waiting longest.
 *
 * <p>
 * Essentially, a priority scheduler gives access in a round-robin fassion to
 * all the highest-priority threads, and ignores all other threads. This has
 * the potential to
 * starve a thread if there's always a thread waiting with higher priority.
 *
 * <p>
 * A priority scheduler must partially solve the priority inversion problem; in
 * particular, priority must be donated through locks, and through joins.
 */
public class PriorityScheduler extends Scheduler {

	/**
	 * Allocate a new priority scheduler.
	 */
	public PriorityScheduler() {
	}

	/**
	 * Allocate a new priority thread queue.
	 *
	 * @param	transferPriority	<tt>true</tt> if this queue should
	 *					transfer priority from waiting threads
	 *					to the owning thread.
	 * @return	a new priority thread queue.
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

		Lib.assertTrue(priority >= priorityMinimum &&
				priority <= priorityMaximum);

		getThreadState(thread).setPriority(priority);
	}

	public boolean increasePriority() {
		boolean intStatus = Machine.interrupt().disable();

		KThread thread = KThread.currentThread();

		int priority = getPriority(thread);
		if (priority == priorityMaximum)
			return false;

		setPriority(thread, priority+1);

		Machine.interrupt().restore(intStatus);
		return true;
	}

	public boolean decreasePriority() {
		boolean intStatus = Machine.interrupt().disable();

		KThread thread = KThread.currentThread();

		int priority = getPriority(thread);
		if (priority == priorityMinimum)
			return false;

		setPriority(thread, priority-1);

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
	protected class PriorityQueue extends ThreadQueue {
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
			
			if(lock != null){
				getThreadState(lock).release(this);
			}
			
			ThreadState temp = this.pickNextThread();

			if(temp == null){
				
				return null;
				
			}
			
			else{
				
				return temp.thread;
				
			}
		}

		/**
		 * Return the next thread that <tt>nextThread()</tt> would return,
		 * without modifying the state of this queue.
		 *
		 * @return	the next thread that <tt>nextThread()</tt> would
		 *		return.
		 */
		protected ThreadState pickNextThread() {
		
		int counter = 0;
		int dterm = 0;
		ThreadState next = null;
		ThreadState temp;
		
		
			if(wait.isEmpty()){
				return null;
			}
			else{
			
				
			
				for(int i=0; i < wait.size(); i++){
				
					temp = (ThreadState) wait.get(i);
					
					if(transferPriority){
						dterm = temp.getCount() + temp.getEffectivePriority();
					}
					else{
						dterm = temp.getCount() + temp.getPriority();
					}

					

					
					if(dterm > counter){
						counter = dterm;
						next = temp;
					}
				}
				if(counter == 0){
					for(int i=0; i < wait.size(); i++){

						temp = (ThreadState) wait.get(i);

						if(transferPriority){
							temp.setCount(temp.getEffectivePriority());
						}
						else{
							temp.setCount(temp.getPriority());
						}
					}

					counter = 0;
					next = null;

					for(int i=0; i < wait.size(); i++){
					
						temp = (ThreadState) wait.get(i);
						
						if(transferPriority){
							dterm = temp.getCount() + temp.getEffectivePriority();
						}
						else{
							dterm = temp.getCount() + temp.getPriority();
						}

						

						
						if (dterm > counter)
						{
							counter = dterm;
							next = temp;
						}
					}
					if (counter == 0){
						return null;
					}
					else{
						wait.remove(next);
						return next;
					}
				}
				else {
					wait.remove(next);
					return next;
				}
			} 
		}

		public void print() {
			Lib.assertTrue(Machine.interrupt().disabled());
			
		}

		/**
		 * <tt>true</tt> Decreases the waiting Counter
		 */

		/**
		 * <tt>true</tt> if this queue should transfer priority from waiting
		 * threads to the owning thread.
		 */
		public boolean transferPriority;
		public KThread lock = null;
		public LinkedList wait = new LinkedList();
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
		 * Return the effective priority of the associated thread.
		 *
		 * @return	the effective priority of the associated thread.
		 */
		public int getEffectivePriority() {
			
			ThreadState temp;
			int priority = this.priority;

			for(int i=0; i < queue.size(); i++){
			
				PriorityQueue tempQ = (PriorityQueue) queue.get(i);

				temp = (ThreadState) queue.get(i);

				if(tempQ.lock == this.thread){

					for(int j=0; i < queue.size(); j++){

						temp = (ThreadState) queue.get(i);

						if(priority < temp.getPriority()){

							priority = temp.getPriority();

						}
					}
				}
			}
			return priority; 
		}

		/**
		 * Set the priority of the associated thread to the specified value.
		 *
		 * @param	priority	the new priority.
		 */
		public void setPriority(int priority) {
			if (this.priority == priority)
				return;

			this.priority = priority;
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
			if(this.count == -1){

				if(wait.transferPriority){

					this.count = this.getEffectivePriority();

				}
				else{

					this.count = this.priority;

				}

			}

			System.out.println("I AM BEING CALED!!!!!!!!!!!!!!!!!!");
			wait.wait.add(this);

			this.queue.add((PriorityQueue) wait);
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

			Lib.assertTrue(wait.wait.isEmpty());

			Lib.assertTrue(Machine.interrupt().disabled());

			this.queue.add((PriorityQueue) wait);

			if(wait.transferPriority){

				wait.lock = this.thread;

			}
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
		protected LinkedList queue = new LinkedList();


		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public LinkedList getQueue() {
			return queue;
		}

		public void setQueue(LinkedList queue) {
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
