package nachos.userprog;

import nachos.machine.*;
import nachos.threads.*;
import nachos.userprog.*;
import java.util.*;

/**
 * A kernel that can support multiple user processes.
 */
public class UserKernel extends ThreadedKernel {
    /**
     * Allocate a new user kernel.
     */
    public UserKernel() {
	super();
    }

    /**
     * Initialize this kernel. Creates a synchronized console and sets the
     * processor's exception handler.
     */
    public void initialize(String[] args) {
	super.initialize(args);

	processManager = new ProcessManager();


	console = new SynchConsole(Machine.console());
    //setup the memory
    accessMemory = new Semaphore(1);
    int numPages = Machine.processor().getNumPhysPages();
    for (int i=0; i<numPages; i++) {
        //TranslationEntry(int vpn, ppn, boolean valid, readOnly, used, dirty) {
        freePages.addLast(new TranslationEntry(0,i,true,false,false,false)); //nothing else is running, not need of synchronization
    }
	
	Machine.processor().setExceptionHandler(new Runnable() {
		public void run() { exceptionHandler(); }
	    });

    }

    /**
     * Test the console device.
     */	
    public void selfTest() {
	super.selfTest();

	System.out.println("Testing the console device. Typed characters");
	System.out.println("will be echoed until q is typed.");

	char c;

	do {
	    c = (char) console.readByte(true);
	    console.writeByte(c);
	}
	while (c != 'q');

	System.out.println("");
    }

    /**
     * Returns the current process.
     *
     * @return	the current process, or <tt>null</tt> if no process is current.
     */
    public static UserProcess currentProcess() {
	if (!(KThread.currentThread() instanceof UThread))
	    return null;
	
	return ((UThread) KThread.currentThread()).process;
    }

    /**
     * The exception handler. This handler is called by the processor whenever
     * a user instruction causes a processor exception.
     *
     * <p>
     * When the exception handler is invoked, interrupts are enabled, and the
     * processor's cause register contains an integer identifying the cause of
     * the exception (see the <tt>exceptionZZZ</tt> constants in the
     * <tt>Processor</tt> class). If the exception involves a bad virtual
     * address (e.g. page fault, TLB miss, read-only, bus error, or address
     * error), the processor's BadVAddr register identifies the virtual address
     * that caused the exception.
     */
    public void exceptionHandler() {
	Lib.assertTrue(KThread.currentThread() instanceof UThread);

	UserProcess process = ((UThread) KThread.currentThread()).process;
	int cause = Machine.processor().readRegister(Processor.regCause);
	process.handleException(cause);
    }

    /**
     * Start running user programs, by creating a process and running a shell
     * program in it. The name of the shell program it must run is returned by
     * <tt>Machine.getShellProgramName()</tt>.
     *
     * @see	nachos.machine.Machine#getShellProgramName
     */
    public void run() {
	super.run();

	UserProcess process = UserProcess.newUserProcess();
	
	String shellProgram = Machine.getShellProgramName();
	String args[] = Machine.getCommandLineArguments();	
	Lib.assertTrue(process.execute(shellProgram, args));

	KThread.currentThread().finish();
    }

    /**
     * Terminate this kernel. Never returns.
     */
    public void terminate() {
	super.terminate();
    }

	
	//used to keep track of all the processes (running and finished)
	public class ProcessManager
	{
		public ProcessManager()
		{
			processList = new TreeMap<Integer, ProcessNode>();
		}

		//checks if a pid is valid
		public boolean exists(int processID)
		{
			return processList.containsKey(processID);
		}

		//creates a new node, assigns it a pid
		public int newProcess(UserProcess process, int parent)
		{
			//System.err.println("newProcess being called");
			//System.err.flush();
			ProcessNode newProcessNode = new ProcessNode(process, parent, nextProcessID);
			processList.put(newProcessNode.pid, newProcessNode);
			nextProcessID++;
			return newProcessNode.pid;
		}

		//returns the process corresponding to a pid
		public UserProcess getProcess(int processID)
		{
			return processList.get(processID).process;
		}

		//change the parent of the process
		public void changeParent(int childPID, int parentPID)
		{
			processList.get(childPID).parent = parentPID;
		}

		public boolean checkNoChildren(int parentPID)
		{
			Iterator iter = processList.keySet().iterator();
			ProcessNode processNode;
			while (iter.hasNext())
			{
				processNode = processList.get(iter.next());
				if (processNode.parent == parentPID)
				{
					return false;
				}
			}
			return true;
		}

		public void removeParent(int parentPID)
		{
			Iterator iter = processList.keySet().iterator();
			ProcessNode processNode;
			while (iter.hasNext())
			{
				processNode = processList.get(iter.next());
				if (processNode.parent == parentPID)
				{
					changeParent(processNode.pid, -1);
				}
			}
		}

		//returns the PID of the parent of this child process
		public int getParent(int childPID)
		{
			return processList.get(childPID).parent;
		}

		//set return status of a process when it finishes
		public void setReturn(int pid, int returnCode)
		{
			processList.get(pid).exitStatus = returnCode;
		}

		//checks of a process is running or finished
		public boolean isRunning(int processID)
		{
			return processList.get(processID).running;
		}

		//set the state of the process to finished
		public void setFinished(int processID)
		{
			processList.get(processID).running = false;
		}

		//allows a parent to get the return status of a child
		public int getReturn(int processID)
		{
			ProcessNode process = processList.get(processID);
			return process.exitStatus;
		}

		//checks to see if the process exited due to an error
		public boolean checkError(int processID)
		{
			return processList.get(processID).error;
		}

		//notify that a process was terminated because of an error
		public void setError(int processID)
		{
			processList.get(processID).error = true;
		}

		//check if this is the final process
		public boolean isLastProcess(int processID)
		{
			Iterator iter = processList.keySet().iterator();
			ProcessNode processNode;
			int count = 0;
			while (iter.hasNext())
			{
				processNode = processList.get(iter.next());
				//System.err.println("status of process " + processNode.pid + " : " + processNode.running);System.err.flush();
				if (processNode.pid != processID && processNode.running)
				{
					count++;
				}
			}
			return (count == 0);
		}

		private class ProcessNode
		{
			public ProcessNode(UserProcess process, int parent, int pid)
			{
				this.pid = pid;
				this.parent = parent;
				this.process = process;
				this.running = true;
				this.joined = false;
				this.error = false;
			}

			int pid;
			int parent;
			int exitStatus;
			boolean joined;
			boolean running;
			boolean error;
			UserProcess process;
		}

		private int nextProcessID = 0;
		private TreeMap<Integer, ProcessNode> processList;
	}

	
	//provide a nicer way for the UserProcess to access the UserKernel
	public static UserKernel getKernel()
	{
		if (kernel instanceof UserKernel) return (UserKernel)kernel;
		return null;
	}


    /** Globally accessible reference to the synchronized console. */
    public static SynchConsole console;

    // dummy variables to make javac smarter
    private static Coff dummy1 = null;

    //Keep the free pages memory
   public static LinkedList<TranslationEntry> freePages = new LinkedList<TranslationEntry>();
   public static Semaphore accessMemory;

   public ProcessManager processManager;

}

/* vim: set ts=8 sts=4 sw=4 et: */
