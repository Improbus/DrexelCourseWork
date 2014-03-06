package nachos.threads;

import nachos.machine.*;
import java.util.*;

/**
 * Uses the hardware timer to provide preemption, and to allow threads to sleep
 * until a certain time.
 */
public class Alarm {
    
    private static Hashtable<KThread, Long> m_alarmThreads = new Hashtable<KThread, Long>(); 
    private static Semaphore m_alarmMutex = new Semaphore(1); 
    // Mutex - This should really be used, but for some reason it crashes when it is used, and doesn't when its not used

    /**
     * Allocate a new Alarm. Set the machine's timer interrupt handler to this
     * alarm's callback.
     *
     * <p><b>Note</b>: Nachos will not function correctly with more than one
     * alarm.
     */
    public Alarm() {
        Machine.timer().setInterruptHandler(new Runnable() {
                public void run() { timerInterrupt(); }
            });
    }

    /**
     * The timer interrupt handler. This is called by the machine's timer
     * periodically (approximately every 500 clock ticks). Causes the current
     * thread to yield, forcing a context switch if there is another thread
     * that should be run.
     */
    public void timerInterrupt() {
        //System.debug.println("In timerInterrupt");
        Long currentTime = Machine.timer().getTime();
                
	m_alarmMutex.P();
        Enumeration threadEnum = m_alarmThreads.keys();
	m_alarmMutex.V();
                
        // to improve, add a condition where we can just quit if time stamp is past
        while (threadEnum.hasMoreElements())
        {
            KThread temp = (KThread)threadEnum.nextElement();
            if ((Long)m_alarmThreads.get(temp) < currentTime)
            {
                m_alarmThreads.remove(temp);

                //System.debug.println(temp + " is now ready!");
                temp.ready();
            }
        }
    }

    /**
     * Put the current thread to sleep for at least <i>x</i> ticks,
     * waking it up in the timer interrupt handler. The thread must be
     * woken up (placed in the scheduler ready set) during the first timer
     * interrupt where
     *
     * <p><blockquote>
     * (current time) >= (WaitUntil called time)+(x)
     * </blockquote>
     *
     * @param   x       the minimum number of clock ticks to wait.
     *
     * @see     nachos.machine.Timer#getTime()
     */
    public void waitUntil(long x) {
        //System.out.println("In waitUntil");

        if (x == 0) {
            return;
        }

        // get our "re-wake" timestamp
        long wakeTime = Machine.timer().getTime() + x;
                
        KThread waitThread = KThread.currentThread();

        m_alarmThreads.put(waitThread, wakeTime);
       
        // now put it to sleep
        boolean interruptStatus = Machine.interrupt().disable();
        //System.out.println(waitThread + " is now out of run queue!");
        waitThread.sleep();
        //System.out.println(waitThread +" it woke up after sleeping");
        Machine.interrupt().restore(interruptStatus);
    }
}
