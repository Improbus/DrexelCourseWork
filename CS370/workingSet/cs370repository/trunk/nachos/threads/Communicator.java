package nachos.threads;

import nachos.machine.*;

/**
 * A <i>communicator</i> allows threads to synchronously exchange 32-bit
 * messages. Multiple threads can be waiting to <i>speak</i>,
 * and multiple threads can be waiting to <i>listen</i>. But there should never
 * be a time when both a speaker and a listener are waiting, because the two
 * threads can be paired off at this point.
 */
public class Communicator {

	private Condition tSpeak;
	private Condition tListen;
	private Lock mLock;
	private int speaks = 0;
	private int listens = 0;
	private int message;
	
    public Communicator() {

	mLock = new Lock();
	tSpeak = new Condition(mLock);
	tListen = new Condition(mLock);
	}

    /**
     * Wait for a thread to listen through this communicator, and then transfer
     * <i>word</i> to the listener.
     *
     * <p>
     * Does not return until this thread is paired up with a listening thread.
     * Exactly one listener should receive <i>word</i>.
     *
     * @param   word    the integer to transfer.
     */
public void speak(int word){
        mLock.acquire();
        
        speaks++;

        while(listens == 0){
            tListen.sleep();
        }
        
        listens--;
        
        message = word;

        mLock.release();
 
    }

    /**
     * Wait for a thread to speak through this communicator, and then return
     * the <i>word</i> that thread passed to <tt>speak()</tt>.
     *
     * @return  the integer transferred.
     */    
    public int listen() {
        mLock.acquire();

        listens++;

        tListen.wakeAll();

        while(speaks == 0){
            tSpeak.sleep();
        }

        speaks--;
        
        mLock.release();

        return message;

    }

	public int getListens() {
		return listens;
	}

	public void setListens(int listens) {
		this.listens = listens;
	}

	public int getMessage() {
		return message;
	}

	public void setMessage(int message) {
		this.message = message;
	}

	public Lock getMLock() {
		return mLock;
	}

	public void setMLock(Lock lock) {
		mLock = lock;
	}

	public int getSpeaks() {
		return speaks;
	}

	public void setSpeaks(int speaks) {
		this.speaks = speaks;
	}

	public Condition getTListen() {
		return tListen;
	}

	public void setTListen(Condition listen) {
		tListen = listen;
	}

	public Condition getTSpeak() {
		return tSpeak;
	}

	public void setTSpeak(Condition speak) {
		tSpeak = speak;
	}

}
