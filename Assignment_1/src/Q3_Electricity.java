import java.util.Scanner;

public class Q3_Electricity 
{
	int Customer_no;
	String Customer_name;
	float Unit;
	double Bill;
	
	public Q3_Electricity(int customer_no, String customer_name, float Unit) 
	{	
		this.Customer_no = customer_no;
		this.Customer_name = customer_name;
		this.Unit = Unit;
	}
	
	void readData()
	{
		Scanner sc = new Scanner(System.in);
		Customer_no = sc.nextInt();
		Customer_name = sc.next();
		Unit = sc.nextFloat();
	}
	
	void showData()
	{
		System.out.println(Customer_no + " "+ Customer_name + " have bill amount -> " +  Bill );
	}
	
	void computeBill()
	{
		if (Unit <= 100)							// lees than 100 unit
		{
			Bill = Unit * 1.20;
			//System.out.print("Charges on Electricity Bill is : " + Bill);
		}
		else if( Unit <= 200 && Unit > 100 )		// More than 100 and less than 200 unit
		{
			 Bill = (100* 1.20) + ((Unit -100)* 2.00);
			//System.out.print("Charges on Electricity Bill is : " + Bill);
		}
		else if (Unit <= 300 && Unit > 200)			// More than 200 and less than 300 unit
		{
			 Bill = (100* 1.20) + (100 * 2.00) + ((Unit -200) * 3.00);
			//System.out.print("Charges on Electricity Bill is : " + Bill);
		}
		else if( Unit > 300 )						// More than 300 unit
		{
			 Bill = (100* 1.20) + (100 * 2.00) + (100 * 3.00) + ((Unit -300) * 5.00);
			//System.out.print("Charges on Electricity Bill is : " + Bill);
		}
		//return Bill;
	}
}
