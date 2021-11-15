import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{

	public static void main(String[] args) throws IOException 
	{

		ServerSocket ss = new ServerSocket(888);
		Socket s = ss.accept();
		System.out.println("Connection got from client to server");
		
		//opened for read
		InputStream is = s.getInputStream();
		
		//Read from Socket // in place of scanner you can use
		
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String obj = br.readLine();
		
		// write to console
		
		System.out.println("Message from client: " + obj);
	}

}
