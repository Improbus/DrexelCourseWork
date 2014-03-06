package nachos.userprog;

import nachos.machine.*;
import nachos.threads.*;
import nachos.userprog.*;

import java.io.EOFException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Encapsulates the state of a user process that is not contained in its
 * user thread (or threads). This includes its address translation state, a
 * file table, and information about the program being executed.
 *
 * <p>
 * This class is extended by other classes to support additional functionality
 * (such as additional syscalls).
 *
 * @see	nachos.vm.VMProcess
 * @see	nachos.network.NetProcess
 */
public class UserProcess {
    private Map<Integer, OpenFile> m_openIdMap;

    Semaphore m_openIdMapMutex;
    private final int MAX_STRING_LENGTH = 2048;

    /**
     * Allocate a new process.
     */
    public UserProcess() {
	
	// Get the processID
	processID = UserKernel.getKernel().processManager.newProcess(this, -1);
	
	//open file table	
	openFileTable = new OpenFile[maxOpenFiles];


    //the number of physical pages is specified in nachos.conf
    //int numPhysPages = Machine.processor().getNumPhysPages();

	pageTable = new TranslationEntry[pagesPerProcess];
    UserKernel.accessMemory.P(); //nobody should touch the memory
    boolean memoryFull = true;
	for (int i=0; i<pagesPerProcess; i++) {
        memoryFull = true;
        for ( TranslationEntry p : UserKernel.freePages ) {
            if (!p.used) { //if a page is not used
                p.used = true;
                p.vpn = i; //put the new vpn, ppn does not change
                pageTable[i] = p;
                memoryFull = false; //allocation has been made
                break; 
            }
        }
          
	}
    UserKernel.accessMemory.V(); //now other processes can get memory
	m_openIdMap = new Hashtable();
	m_openIdMapMutex = new Semaphore(1);
    }
    
    /**
     * Allocate and return a new process of the correct class. The class name
     * is specified by the <tt>nachos.conf</tt> key
     * <tt>Kernel.processClassName</tt>.
     *
     * @return	a new process of the correct class.
     */
    public static UserProcess newUserProcess() {
	return (UserProcess)Lib.constructObject(Machine.getProcessClassName());
    }

    /**
     * Execute the specified program with the specified arguments. Attempts to
     * load the program, and then forks a thread to run it.
     *
     * @param	name	the name of the file containing the executable.
     * @param	args	the arguments to pass to the executable.
     * @return	<tt>true</tt> if the program was successfully executed.
     */
    public boolean execute(String name, String[] args) {
	if (!load(name, args))
	    return false;

	//need to keep a reference to the new thread incase we need to call join
	thisThread = new UThread(this);
	thisThread.setName(name).fork();
	return true;
    }

    /**
     * Save the state of this process in preparation for a context switch.
     * Called by <tt>UThread.saveState()</tt>.
     */
    public void saveState() {
    }

    /**
     * Restore the state of this process after a context switch. Called by
     * <tt>UThread.restoreState()</tt>.
     */
    public void restoreState() {
	Machine.processor().setPageTable(pageTable);
    }

    /**
     * Read a null-terminated string from this process's virtual memory. Read
     * at most <tt>maxLength + 1</tt> bytes from the specified address, search
     * for the null terminator, and convert it to a <tt>java.lang.String</tt>,
     * without including the null terminator. If no null terminator is found,
     * returns <tt>null</tt>.
     *
     * @param	vaddr	the starting virtual address of the null-terminated
     *			string.
     * @param	maxLength	the maximum number of characters in the string,
     *				not including the null terminator.
     * @return	the string read, or <tt>null</tt> if no null terminator was
     *		found.
     */
    public String readVirtualMemoryString(int vaddr, int maxLength) {
	Lib.assertTrue(maxLength >= 0);

	byte[] bytes = new byte[maxLength+1];

	int bytesRead = readVirtualMemory(vaddr, bytes);

	for (int length=0; length<bytesRead; length++) {
	    if (bytes[length] == 0)
		return new String(bytes, 0, length);
	}

	return null;
    }

    /**
     * Transfer data from this process's virtual memory to all of the specified
     * array. Same as <tt>readVirtualMemory(vaddr, data, 0, data.length)</tt>.
     *
     * @param	vaddr	the first byte of virtual memory to read.
     * @param	data	the array where the data will be stored.
     * @return	the number of bytes successfully transferred.
     */
    public int readVirtualMemory(int vaddr, byte[] data) {
	return readVirtualMemory(vaddr, data, 0, data.length);
    }

    /**
     * Transfer data from this process's virtual memory to the specified array.
     * This method handles address translation details. This method must
     * <i>not</i> destroy the current process if an error occurs, but instead
     * should return the number of bytes successfully copied (or zero if no
     * data could be copied).
     *
     * @param	vaddr	the first byte of virtual memory to read.
     * @param	data	the array where the data will be stored.
     * @param	offset	the first byte to write in the array.
     * @param	length	the number of bytes to transfer from virtual memory to
     *			the array.
     * @return	the number of bytes successfully transferred.
     */
    public int readVirtualMemory(int vaddr, byte[] data, int offset,
				 int length) {
	Lib.assertTrue(offset >= 0 && length >= 0 && offset+length <= data.length);

    //here the magic should happen, the process is not allowed to have access to the
    //whole memory. It is allowed only to its stack pages memory. 
	byte[] memory = Machine.processor().getMemory();
	
	// for now, just assume that virtual addresses equal physical addresses
	if (vaddr < 0 || vaddr >= memory.length)
	    return 0;

	int amount = Math.min(length, memory.length-vaddr);

    //translate to physical address
    int offsetVpn = Machine.processor().pageFromAddress(offset);
    int offsetOffset = Machine.processor().offsetFromAddress(offset);

    int vaddrVpn  = Machine.processor().pageFromAddress(vaddr); 
    int vaddrOffset = Machine.processor().offsetFromAddress(vaddr);
    //translate to physical page + offset
    int physicalOffset = Machine.processor().makeAddress(pageTable[offsetVpn].ppn, offsetOffset);
    int physicalVaddr  = Machine.processor().makeAddress(pageTable[vaddrVpn].ppn, vaddrOffset);

    //now use the new physical addresses
	System.arraycopy(memory, physicalVaddr, data, 0, amount);

	return amount;
    }

    /**
     * Transfer all data from the specified array to this process's virtual
     * memory.
     * Same as <tt>writeVirtualMemory(vaddr, data, 0, data.length)</tt>.
     *
     * @param	vaddr	the first byte of virtual memory to write.
     * @param	data	the array containing the data to transfer.
     * @return	the number of bytes successfully transferred.
     */
    public int writeVirtualMemory(int vaddr, byte[] data) {
	return writeVirtualMemory(vaddr, data, 0, data.length);
    }

    /**
     * Transfer data from the specified array to this process's virtual memory.
     * This method handles address translation details. This method must
     * <i>not</i> destroy the current process if an error occurs, but instead
     * should return the number of bytes successfully copied (or zero if no
     * data could be copied).
     *
     * @param	vaddr	the first byte of virtual memory to write.
     * @param	data	the array containing the data to transfer.
     * @param	offset	the first byte to transfer from the array.
     * @param	length	the number of bytes to transfer from the array to
     *			virtual memory.
     * @return	the number of bytes successfully transferred.
     */
    public int writeVirtualMemory(int vaddr, byte[] data, int offset,
				  int length) {
	Lib.assertTrue(offset >= 0 && length >= 0 && offset+length <= data.length);

	byte[] memory = Machine.processor().getMemory();
	
	// for now, just assume that virtual addresses equal physical addresses
	if (vaddr < 0 || vaddr >= memory.length)
	    return 0;

	int amount = Math.min(length, memory.length-vaddr);
    //translate to physical address
    //System.out.println("vaddr & offset " + vaddr +  "  " + offset);
    int offsetVpn = Machine.processor().pageFromAddress(offset);
    int offsetOffset = Machine.processor().offsetFromAddress(offset);

    int vaddrVpn  = Machine.processor().pageFromAddress(vaddr); 
    int vaddrOffset = Machine.processor().offsetFromAddress(vaddr);
    //translate to physical page + offset
    int physicalOffset = Machine.processor().makeAddress(pageTable[offsetVpn].ppn, offsetOffset);
    //System.out.println("number of virtualPages = "+ vaddrVpn);
    int physicalVaddr  = Machine.processor().makeAddress(pageTable[vaddrVpn].ppn,  vaddrOffset);
    //now use the new physical addresses
	System.arraycopy(data, 0, memory, physicalVaddr, amount);

	return amount;
    }

    /**
     * Load the executable with the specified name into this process, and
     * prepare to pass it the specified arguments. Opens the executable, reads
     * its header information, and copies sections and arguments into this
     * process's virtual memory.
     *
     * @param	name	the name of the file containing the executable.
     * @param	args	the arguments to pass to the executable.
     * @return	<tt>true</tt> if the executable was successfully loaded.
     */
    private boolean load(String name, String[] args) {
	Lib.debug(dbgProcess, "UserProcess.load(\"" + name + "\")");
	
	OpenFile executable = ThreadedKernel.fileSystem.open(name, false);

	if (executable == null) {
	    Lib.debug(dbgProcess, "\topen failed");
	    return false;
	}

	try {
	    coff = new Coff(executable);
	}	
	catch (EOFException e) {
	    executable.close();
	    Lib.debug(dbgProcess, "\tcoff load failed");
	    return false;
	}

	// make sure the sections are contiguous and start at page 0
	numPages = 0;
	for (int s=0; s<coff.getNumSections(); s++) {
	    CoffSection section = coff.getSection(s);
	    if (section.getFirstVPN() != numPages) {
		coff.close();
		Lib.debug(dbgProcess, "\tfragmented executable");
		return false;
	    }
	    numPages += section.getLength();
	}

	// make sure the argv array will fit in one page
	byte[][] argv = new byte[args.length][];
	int argsSize = 0;
	for (int i=0; i<args.length; i++) {
	    argv[i] = args[i].getBytes();
	    // 4 bytes for argv[] pointer; then string plus one for null byte
	    argsSize += 4 + argv[i].length + 1;
	}
	if (argsSize > pageSize) {
	    coff.close();
	    Lib.debug(dbgProcess, "\targuments too long");
	    return false;
	}

	// program counter initially points at the program entry point
	initialPC = coff.getEntryPoint();	

	// next comes the stack; stack pointer initially points to top of it
	numPages += stackPages;
	initialSP = numPages*pageSize;

	// and finally reserve 1 page for arguments
	numPages++;

	if (!loadSections())
	    return false;

	// store arguments in last page
	int entryOffset = (numPages-1)*pageSize;
	int stringOffset = entryOffset + args.length*4;

	this.argc = args.length;
	this.argv = entryOffset;
	
	for (int i=0; i<argv.length; i++) {
	    byte[] stringOffsetBytes = Lib.bytesFromInt(stringOffset);
	    Lib.assertTrue(writeVirtualMemory(entryOffset,stringOffsetBytes) == 4);
	    entryOffset += 4;
	    Lib.assertTrue(writeVirtualMemory(stringOffset, argv[i]) ==
		       argv[i].length);
	    stringOffset += argv[i].length;
	    Lib.assertTrue(writeVirtualMemory(stringOffset,new byte[] { 0 }) == 1);
	    stringOffset += 1;
	}

	return true;
    }

    /**
     * Allocates memory for this process, and loads the COFF sections into
     * memory. If this returns successfully, the process will definitely be
     * run (this is the last step in process initialization that can fail).
     *
     * @return	<tt>true</tt> if the sections were successfully loaded.
     */
    protected boolean loadSections() {
	if (numPages >  Machine.processor().getNumPhysPages()) {
      //System.out.println("----> insufficient physical memory"+numPages);
	    coff.close();
	    Lib.debug(dbgProcess, "\tinsufficient physical memory");
	    return false;
	}

	// load sections
	for (int s=0; s<coff.getNumSections(); s++) {
	    CoffSection section = coff.getSection(s);
	    
	    Lib.debug(dbgProcess, "\tinitializing " + section.getName()
		      + " section (" + section.getLength() + " pages)");

	    for (int i=0; i<section.getLength(); i++) {
		int vpn = section.getFirstVPN()+i;

		// for now, just assume virtual addresses=physical addresses
        // ---------not anymore 
        boolean isReadOnly = section.isReadOnly();
        pageTable[vpn].readOnly = isReadOnly;
		section.loadPage(i, pageTable[vpn].ppn);
	    }
	}
	
	return true;
    }

    /**
     * Release any resources allocated by <tt>loadSections()</tt>.
     */
    protected void unloadSections() {
    }    

    /**
     * Initialize the processor's registers in preparation for running the
     * program loaded into this process. Set the PC register to point at the
     * start function, set the stack pointer register to point at the top of
     * the stack, set the A0 and A1 registers to argc and argv, respectively,
     * and initialize all other registers to 0.
     */
    public void initRegisters() {
	Processor processor = Machine.processor();

	// by default, everything's 0
	for (int i=0; i<processor.numUserRegisters; i++)
	    processor.writeRegister(i, 0);

	// initialize PC and SP according
	processor.writeRegister(Processor.regPC, initialPC);
	processor.writeRegister(Processor.regSP, initialSP);

	// initialize the first two argument registers to argc and argv
	processor.writeRegister(Processor.regA0, argc);
	processor.writeRegister(Processor.regA1, argv);
    }

    /**
     * Handle the halt() system call. 
     */
    private int handleHalt() {
        //only root process has the priviledge to halt the system
        //processID == 0 should ensure the current process is root
        //System.out.println("This process has pid = " + processID);
        if (processID == 0) {
	    Machine.halt();
	    Lib.assertNotReached("Machine.halt() did not halt machine!");
        }

	return 0;
    }

	private int handleExit(int returnCode)
	{
		unloadSections();

                freeProcessPageTable();

		//if this process has children, remove their reference to this
		UserKernel.getKernel().processManager.removeParent(processID);

		//verify that this process doesn't own any others
		Lib.assertTrue(UserKernel.getKernel().processManager.checkNoChildren(processID), "Children not disowned");

		//close all open files
		for (int i = 0; i < maxOpenFiles; i++)
		{
			if (openFileTable[i] != null)
			{
				handleClose(i);
			}
		}

		//System.out.println("Verify that openFileList is empty: " + UserKernel.getKernel().fileManager.isFileListEmpty());

		//set return status
		UserKernel.getKernel().processManager.setReturn(processID, returnCode);

		//notify processmanager that this process is finished
		UserKernel.getKernel().processManager.setFinished(processID);

		//if last process need to halt machine
		if (UserKernel.getKernel().processManager.isLastProcess(processID))
		{
			Kernel.kernel.terminate();
		}

		//Otherwise just stop running this thread
		KThread.currentThread().finish();

		Lib.assertNotReached("syscall exit didn't exit");
		return 0;
	}


	private int handleExec(String fileName, int argc, int argvAddr)
	{
		//create a new process
		UserProcess newProcess = newUserProcess();

		//give new process this pid for parent
		UserKernel.getKernel().processManager.changeParent(newProcess.processID, processID);

		//figure out arguments
		String[] args = new String[argc];
		byte[] argAddresses = new byte[argc*bytesInInt];
		readVirtualMemory(argvAddr, argAddresses);
		for (int i = 0; i < argc; i++)
		{
			args[i] = readVirtualMemoryString(Lib.bytesToInt(argAddresses, i * bytesInInt), 256);
		}

		//execute the new process
		if (newProcess.execute(fileName, args) == false)
		{
			//error - need to tidy up
			UserKernel.getKernel().processManager.setFinished(newProcess.processID);
			UserKernel.getKernel().processManager.setError(processID);
			UserKernel.getKernel().processManager.setReturn(processID, -1);

			//shouldn't need this since parent won't find out the child pid anyway
			//UserKernel.getKernel().processManager.setReturn(newProcess.processID, -1);
			return -1;
		}

		//return child pid
		return newProcess.processID;
	}


	private int handleJoin(int childID, int statusAddr)
	{
		//check that the child pid is valid
		if (UserKernel.getKernel().processManager.exists(childID) == false)
		{
			return -1;
		}

		//check that this is the parent of the child process
		if (UserKernel.getKernel().processManager.getParent(childID) != processID)
		{
			return -1;
		}

		//if child is still running then call join
		if (UserKernel.getKernel().processManager.isRunning(childID))
		{
			UserKernel.getKernel().processManager.getProcess(childID).thisThread.join();
		}

		//check if child returned because of an error
		if (UserKernel.getKernel().processManager.checkError(childID))
		{
			return 0;
		}

		//stop parent from being able to call join twice:
		UserKernel.getKernel().processManager.changeParent(childID, -1);

		//store return value in status register
		int status = UserKernel.getKernel().processManager.getReturn(childID);
		writeVirtualMemory(statusAddr, Lib.bytesFromInt(status));
		return 1;
	}


    // I think we need to error check this too, what if they create mutiple of the same files....
    private int handleCreate(int namePtr) {
	String nameStr = readVirtualMemoryString(namePtr, MAX_STRING_LENGTH);

    //open(namStr, true) true - means create the file
	OpenFile file = ThreadedKernel.fileSystem.open(nameStr, true);

	if (file == null) {
	   System.out.println("NACHOS: fileSystem.create did not work!");
	   return -1;
	}

	m_openIdMapMutex.P();

	// +2 because we reserve 0 and 1
	int nextId = m_openIdMap.size() + 2;
	m_openIdMap.put(nextId, file);

	m_openIdMapMutex.V();
	return nextId; // It looks like Create doesn't return anything. Is that correct?
    }

    private int handleOpen(int namePtr) {
	String nameStr = readVirtualMemoryString(namePtr, MAX_STRING_LENGTH);
	int retVal = -1;

	OpenFile file = ThreadedKernel.fileSystem.open(nameStr, false);

	if (file == null) {
	   System.out.println("NACHOS: File couldn't be found (" + nameStr + ")");
	   return -1;
	}

	m_openIdMapMutex.P();

	if (m_openIdMap.containsValue(file)) {
	   // File is open, handle this?
	   retVal = -1;
	}
	else {
	   int nextId = m_openIdMap.size() + 2;
	   m_openIdMap.put(nextId, file);
	   retVal = nextId;
	}

	m_openIdMapMutex.V();

	return retVal;
    }

    private int handleRead(int fd, int bufferPtr, int size) {
	OpenFile file = getOpenFile(fd);
	
	if (file == null) {
	   System.out.println("File associated with " + fd + " not found!");
	   return -1; //ERROR
	}

	byte[] bufferBytes = new byte[size];
	int numRead = file.read(bufferBytes, 0, size);
	int numWrote  = writeVirtualMemory(bufferPtr, bufferBytes, 0, numRead);

	return numWrote;
    }

    private int handleWrite(int fd, int bufferPtr, int size) {
	OpenFile file = getOpenFile(fd);
	
	if (file == null) {
	   System.out.println("File associated with " + fd + " not found!");
	   return -1; //ERROR!
	}

	String bufferStr = readVirtualMemoryString(bufferPtr, MAX_STRING_LENGTH);
	
	int numWrite = file.write(bufferStr.getBytes(), 0, bufferStr.length());
	return numWrite;
    }

    private int handleClose(int fd) {
	m_openIdMapMutex.P();

	if (m_openIdMap.containsKey(fd)) {
	   m_openIdMap.remove(fd);
	}

	m_openIdMapMutex.V();

	return 0;
    }

    // Is this what Unlink does?
    // My understanding is that it removes the fileName from the opened file list...
    // Hung, I think Unlink removes the file.(Georgi)
    private int handleUnlink(int namePtr) {
	String nameStr = readVirtualMemoryString(namePtr, MAX_STRING_LENGTH);

	int retVal = -1;

	boolean fileDeleted = ThreadedKernel.fileSystem.remove(nameStr);

	if (!fileDeleted ) {
	   System.out.println("NACHOS: File couldn't be found for deletion");
	   return -1;
	}
	// This is going to suck because we have to look through each OpenFile in our map and check its name
	// We can improve this by reconstructing our map to incorportate file name lookup
	m_openIdMapMutex.P();

	Set keys = m_openIdMap.keySet();
	
	// untyped typed? Is there an easier way?
	for (Object keyUntyped : keys) {
	   Integer keyTyped = (Integer)keyUntyped;
	   if (m_openIdMap.get(keyTyped).getName().equals(nameStr)) {
	      m_openIdMap.remove(keyTyped);
	      break;
	   }
	}

	m_openIdMapMutex.V();

	return 0;
    }

    private OpenFile getOpenFile(int fd) {

	 // Handle stdin and stdio fd explicitly
	 if (fd == 0) {
	    return UserKernel.console.openForReading();
	 }
	 else if (fd == 1) {
	    return UserKernel.console.openForWriting();
	 }
	 
	 m_openIdMapMutex.P();
	 OpenFile ret = m_openIdMap.get(fd);
	 m_openIdMapMutex.V();

	 return ret;
    }

    private static final int
        syscallHalt = 0,
	syscallExit = 1,
	syscallExec = 2,
	syscallJoin = 3,
	syscallCreate = 4,
	syscallOpen = 5,
	syscallRead = 6,
	syscallWrite = 7,
	syscallClose = 8,
	syscallUnlink = 9;

    /**
     * Handle a syscall exception. Called by <tt>handleException()</tt>. The
     * <i>syscall</i> argument identifies which syscall the user executed:
     *
     * <table>
     * <tr><td>syscall#</td><td>syscall prototype</td></tr>
     * <tr><td>0</td><td><tt>void halt();</tt></td></tr>
     * <tr><td>1</td><td><tt>void exit(int status);</tt></td></tr>
     * <tr><td>2</td><td><tt>int  exec(char *name, int argc, char **argv);
     * 								</tt></td></tr>
     * <tr><td>3</td><td><tt>int  join(int pid, int *status);</tt></td></tr>
     * <tr><td>4</td><td><tt>int  creat(char *name);</tt></td></tr>
     * <tr><td>5</td><td><tt>int  open(char *name);</tt></td></tr>
     * <tr><td>6</td><td><tt>int  read(int fd, char *buffer, int size);
     *								</tt></td></tr>
     * <tr><td>7</td><td><tt>int  write(int fd, char *buffer, int size);
     *								</tt></td></tr>
     * <tr><td>8</td><td><tt>int  close(int fd);</tt></td></tr>
     * <tr><td>9</td><td><tt>int  unlink(char *name);</tt></td></tr>
     * </table>
     * 
     * @param	syscall	the syscall number.
     * @param	a0	the first syscall argument.
     * @param	a1	the second syscall argument.
     * @param	a2	the third syscall argument.
     * @param	a3	the fourth syscall argument.
     * @return	the value to be returned to the user.
     */
    public int handleSyscall(int syscall, int a0, int a1, int a2, int a3) {
//System.out.println("SYSCALL!! ( "+ syscall + " " + a0 + "  " + a1 + "  " + a2 + "  " + a3+ " ) !!");
	
	switch (syscall) {
	case syscallHalt:
            System.out.println("HALT IS CALLED");
	    return handleHalt();
	case syscallExit:
            System.out.println("EXIT IS CALLED");
	    return handleExit(a0);
	case syscallExec:
	    return handleExec(readVirtualMemoryString(a0,256),a1,a2);
	case syscallJoin:
	    return handleJoin(a0, a1);
	case syscallCreate:
	    return handleCreate(a0);
	case syscallOpen:
	    return handleOpen(a0);
	case syscallRead:
	    return handleRead(a0, a1, a2);
	case syscallWrite:
	    return handleWrite(a0, a1, a2);
	case syscallClose:
	    return handleClose(a0);
	case syscallUnlink:
	    return handleUnlink(a0);
	default:
	    Lib.debug(dbgProcess, "Unknown syscall " + syscall);
	    Lib.assertNotReached("Unknown system call!");
	}
	return 0;
    }

    /**
     * Handle a user exception. Called by
     * <tt>UserKernel.exceptionHandler()</tt>. The
     * <i>cause</i> argument identifies which exception occurred; see the
     * <tt>Processor.exceptionZZZ</tt> constants.
     *
     * @param	cause	the user exception that occurred.
     */
    public void handleException(int cause) {
	Processor processor = Machine.processor();

	switch (cause) {
	case Processor.exceptionSyscall:
	    int result = handleSyscall(processor.readRegister(Processor.regV0),
				       processor.readRegister(Processor.regA0),
				       processor.readRegister(Processor.regA1),
				       processor.readRegister(Processor.regA2),
				       processor.readRegister(Processor.regA3)
				       );
	    processor.writeRegister(Processor.regV0, result);
	    processor.advancePC();
	    break;				       
				       
	default:
	    Lib.debug(dbgProcess, "Unexpected exception: " +
		      Processor.exceptionNames[cause]);
	    Lib.assertNotReached("Unexpected exception");
	}
    }

   //frees all the pages taken from the process
   private void freeProcessPageTable() {
      for (int i=0; i< pagesPerProcess; i++) {
          pageTable[i].used = false;
          pageTable[i].vpn = 0;
       }
   }

    /** The program being run by this process. */
    protected Coff coff;

    /** This process's page table. */
    protected TranslationEntry[] pageTable;
    /** The number of contiguous pages occupied by the program. */
    protected int numPages;

    /** The number of pages in the program's stack. */
    protected final int stackPages = 8;
    protected final int pagesPerProcess = 15;
    
    private int initialPC, initialSP;
    private int argc, argv;
	
    private static final int pageSize = Processor.pageSize;
    private static final char dbgProcess = 'a';

	private UThread thisThread;

	private static final int bytesInInt = 4;
	private OpenFile[] openFileTable;
	private final int maxOpenFiles = 16;
	private int processID;

}

/* vim: set ts=8 sts=4 sw=4 et: */
