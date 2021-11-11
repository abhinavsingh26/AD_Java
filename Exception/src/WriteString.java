import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteString 
{

	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("name.txt", true);
		String str;
		Scanner sc= new Scanner(System.in);
		
		while(!(str = sc.nextLine()).equals("exit"))
		{
			fw.write("\n"+ str);
		}
		
		System.out.println("Write Operation is over");
		fw.close();
	}

}
