import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringRead
{

	public static void main(String[] args) throws IOException 
	{
		FileReader fr= new FileReader("C:\\Users\\Lincon\\OneDrive\\Desktop\\abhi.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//String str= br.readLine();
		
		String str=null;
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
	}

}
