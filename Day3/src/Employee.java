import java.util.Scanner;

public class Employee 
{
	int empno;
	String name;
	float sal;
	String designation;
	
//	Employee()
//	{
//		empno = 1004;
//		name = "uma";
//		sal = 7000;
//		designation = "admin";
//	}
	
	public Employee(int empno, String name, float sal, String designation) 
	{
		this.empno = empno;
		this.name = name;
		this.sal = sal;
		this.designation = designation;
	}
	
	void getEmployeedata()
	{
		Scanner sc= new Scanner(System.in);
		empno = sc.nextInt();
		name = sc.next();
		sal=sc.nextFloat();
		designation = sc.next();
	}
	
	void displayEmployee()
	{
		System.out.println(empno + " " + name + " " + sal + " " + designation);
//	@Override
//	public String toString() 
//	{
//		return "Employee [empno=" + empno + ", name=" + name + ", sal=" + sal + ", designation=" + designation + "]";
//	}
		}
}

class testEmployee
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Employee[] e = new Employee[2];
		
		System.out.println("Enter the Employee Data");
		
		for (int i = 0 ; i < e.length; i++)
		{
			int empno = sc.nextInt();
			String name = sc.next();
			float sal = sc.nextFloat();
			String designation = sc.next();
			
			e[i] = new Employee (empno, name, sal,designation); 
		}
		
		System.out.println("Employee Data");
		for(int i=0; i< e.length; i ++)
		{
			e[i].displayEmployee();
		}
		sc.close();
	}

}
