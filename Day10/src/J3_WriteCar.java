import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class J3_WriteCar 
{

	public static void main(String[] args) throws IOException 
	{
		//Read data from CSV
		FileReader fr= new FileReader("cardata.csv");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		String[] car = new String[3];
		
		FileOutputStream fos = new FileOutputStream("carobject");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		while((str = br.readLine()) != null)
		{
			car = str.split(",");
			
			String name = car[0];
			String model = car[1];
			float price = Float.parseFloat(car[2]);
			
			Car c = new Car(name, model, price);
			oos.writeObject(c);
		}
		
		fos.close();
		oos.close();
		
		System.out.println("Write Over");
	}
}
