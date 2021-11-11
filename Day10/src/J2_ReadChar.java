import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class J2_ReadChar 
{

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("Abhinav.txt");
		
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		fw.write(str);
		System.out.println("over");
		fw.close();
		
		FileReader fr = new FileReader("Abhinav.txt");
		int i;
		int c= 0;
		while(( i = fr.read()) != -1)
		{
			c++;
			System.out.println((char)i);
		}
		
		System.out.println("println");
		System.out.println("total no of char : " + c);
	}

}
