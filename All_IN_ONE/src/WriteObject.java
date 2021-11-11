import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteObject 
{

	public static void main(String[] args)  throws IOException
	{
		Employee e1 = new Employee(1003,"shan",4000);
		Employee e2 = new Employee(1004,"Abhi",3000);
		Employee e3 = new Employee(1006,"Nath",5000);
		Employee e4 = new Employee(1008,"Sil",8000);
		Employee e5 = new Employee(1009,"Min",2000);
		
		FileOutputStream fos = new FileOutputStream("Empobject");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		fos.close()
		oos.close
		
	}

}
