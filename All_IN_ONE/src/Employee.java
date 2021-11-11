public class Employee 
{

	int empno;
	String name;
	float sal;
	
	public Employee(int empno, String name, float sal) 
	{
		
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}
	
	void dispEmp()
	{
		System.out.println(empno +" "+ name+" " + sal);
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}

	
	
	
	
}
