import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject 
{
	FileInputStream fis = new FileInputStream("Empobject");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Employee e = (Employee) ois.readObject();
	
	updatesal(e);
	
	e.dispEmp();
	
	fis.close();
	ois.close();
}

