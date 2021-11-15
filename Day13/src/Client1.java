import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 
{

	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		// Connection
		Socket s = new Socket("192.167.1.9", 887);
		
		//Read From User
		
		System.out.println("Enter message from server: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String usrmasage = br.readLine();

		//write to the socket
		
		OutputStream ops = s.getOutputStream();
		PrintStream ps = new PrintStream(ops);
		
		//String is written into the socket
		
		ps.println(usrmasage);
		
		// Read from Socket
		
		InputStream is = s.getInputStream();
		
		InputStreamReader isr1 = new InputStreamReader(is);
		BufferedReader br1 = new BufferedReader(isr1);
		
		String Servermasage= br1.readLine();
		
		System.out.println(Servermasage);
		
		s.close();
		ops.close();
		ps.close();
	}

}
