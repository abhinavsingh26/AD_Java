import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client 
{

	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		// Client Side
		
		Socket s=new Socket("192.168.1.9", 888);

		//Read String from console
		System.out.println("Enter the message");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str= br.readLine();
		
		//Open socket for write
		
		OutputStream ops = s.getOutputStream();
		PrintStream ps = new PrintStream(ops);
		
		//String is written into the socket
		
		ps.println(str);
		
		s.close();
		ops.close();
		ps.close();
		System.out.println("Socket Write is over");
		
	}

}
