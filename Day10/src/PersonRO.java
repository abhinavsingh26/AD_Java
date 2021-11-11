import java.io.Serializable;

public class PersonRO implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	String gender;
	
	PersonRO()
	{};
	PersonRO(String name, int age, String gender) 
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString()
	{
		return "Name:" + name + "\n Age:  " +  age +  "\nGender: " + gender;
	}
	
}
