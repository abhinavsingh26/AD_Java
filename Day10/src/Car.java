import java.io.Serializable;

public class Car implements Serializable
{
	private static final long serialVersionUID = 1L;
	String name;
	String model;
	float price;
	
	public Car(String name, String model, float price) 
	{
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	void dispCar()
	{
		System.out.println(name + " " + model + " " + price);
	}
}
