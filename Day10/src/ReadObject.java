import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObject 
{

	public static void main(String[] args) 
	{
		PersonRO p1= new PersonRO ("Abhi", 30, "Male");
		PersonRO p2= new  PersonRO("Neha", 28, "Female");
		
		try
		{
			FileOutputStream f = new FileOutputStream( "Myobjects.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			//Write Objects to file
			o.writeObject(p1);
			o.writeObject(p2);
			
			o.close();
			f.close();
			
			FileInputStream fi = new FileInputStream( "Myobjects.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			//Read Objects
			PersonRO pr1 = (PersonRO) oi.readObject();
			PersonRO pr2 = (PersonRO) oi.readObject();
			
			System.out.println(pr1.toString());
			System.out.println(pr2.toString());
			
			oi.close();
			fi.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		catch (IOException e)
		{
			System.out.println("Error Initializing stream");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
