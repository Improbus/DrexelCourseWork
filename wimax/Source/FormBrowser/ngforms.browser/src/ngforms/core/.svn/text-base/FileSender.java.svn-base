package ngforms.core;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileSender {
	static String host = "127.0.0.1";
	static int port = 10155;


	public static void SendFile(File f) throws UnknownHostException, IOException {
		// sendfile
		Socket sock = new Socket(host, port);
		byte [] mybytearray  = new byte [(int)f.length()];
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		bis.read(mybytearray,0,mybytearray.length);
		OutputStream os = sock.getOutputStream();
		os.write(mybytearray,0,mybytearray.length);
		os.flush();
		sock.close();
	}
}
