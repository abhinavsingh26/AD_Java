import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class J4_ReadCarObject 
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		//Open and Read from file
		FileInputStream fis = new FileInputStream("carobject");
		
		//Object Read
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//reading One object
		Car obj;
		
		try
		{
			while ((obj = (Car) ois.readObject()) != null)
			{
				obj.dispCar();
			}
		}
		catch(EOFException e)
		{
			System.out.println();
		}
	}

}
