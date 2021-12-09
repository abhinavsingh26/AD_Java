import java.util.Scanner;

public class emp 
{
	int empno;
	String empname;
	String designation;
	String dept;
	int salary;
	
	void readEmpdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee no = ");
		empno = sc.nextInt();
		System.out.println("Employee name = ");
		empname = sc.next();
		System.out.println("Employee designation = ");
		designation = sc.next();
		System.out.println("Employee department = ");
		dept = sc.next();
		System.out.println("Employee salary = ");
		salary = sc.nextInt();
		
	}
	
	void displayData()
	{
		System.out.println("Employee no = "+ empno);
		System.out.println("Employee name is = "+  empname);
		System.out.println("Employee designation is = " + designation);
		System.out.println("Employee department is = " + dept);
		System.out.println("Employee Salary is = " + salary);
	}
}
