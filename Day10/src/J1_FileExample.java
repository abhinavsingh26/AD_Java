import java.io.File;
import java.io.IOException;

public class J1_FileExample 
{

	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("dac");
		f1.createNewFile();
		System.out.println(f1.exists());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.canRead());
		System.out.println(f1.canExecute());
		System.out.println(f1.delete());
		System.out.println(f1.exists());
		System.out.println(f1.isDirectory());
	}

}

