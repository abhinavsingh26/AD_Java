
public class Q2_Student 
{
	int id;

	String name;
	float mark;
	String result;
	
	void record(int id, String name, float mark, String result) 
	{
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.result = result;
	}
	
	void displayInfo()
	{
		System.out.println("Student Id : " + id);
		System.out.println("Student name : " + name);
		System.out.println("Student mark : " + mark);
		System.out.println("Student result : " + result);
		
	}
	
}
