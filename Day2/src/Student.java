import java.util.Scanner;

public class Student 
{
	int sid;
	String name;
	int mark;
	
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.readStudentData();
		System.out.println("Student Data : ");
		
		s1.DisplayStudent();
		s1.FindResult();
		
		s2.readStudentData();
		System.out.println("Student Data : ");
		
		s2.DisplayStudent();
		s2.FindResult();

	}

	private void FindResult() 
	{
		if(mark > 40)
		{
			System.out.println(" Pass ");			
		}
		else
		{
			System.out.println(" fail ");
		}
		
	}

	private void DisplayStudent() 
	{
		System.out.println(sid + " " +  name + " " + mark + " ");
		
	}

	private void readStudentData() 
	{
		System.out.println(" Enter Student Data : ");
		Scanner sc = new Scanner(System.in);
		sid = sc.nextInt();
		name = sc.next();
		mark = sc.nextInt();
		
	}

}
