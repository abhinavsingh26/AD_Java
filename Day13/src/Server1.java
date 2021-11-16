import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 
{

	public static void main(String[] args) throws IOException 
	{
		//Server Side
		ServerSocket ss = new ServerSocket(3887);
		Socket s= ss.accept();
		System.out.println("Connection got from client to server.");
		
		//Opened for read
		
		InputStream is = s.getInputStream();
		
		//Read from socket // in place of scanner you can use
		
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String Clientmasage = br.readLine();
		
		System.out.println(Clientmasage);
		
		//Read from user console
		
		System.out.println("Enter the massage for client ");
		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		String Servermeassage = br1.readLine();
		
		
		//  Write to the Socket
		
		OutputStream ops = s.getOutputStream();
		PrintStream ps = new PrintStream(ops);
		
		// String is written into the socket
		
		ps.println(Servermeassage);
		
		
		ss.close();
		s.close();
		ops.close();
		ps.close();
		
	}

}
