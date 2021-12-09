import java.util.Scanner;

public class Q4_account 
{
	int accNo;
	String accName;
	double amount;
	float temp_amt;
	int time;
	Scanner sc = new Scanner(System.in);
	void read_account(int accNo, String accName, double amount) 
	{
		this.accNo = accNo;
		this.accName = accName;
		this.amount = amount;
	}
	
	
	
	void withdraw()
	{
		System.out.println("Enter amount to withdraw: ");
		temp_amt = sc.nextFloat();
		if(temp_amt > amount)
		{
			System.out.println("Insufficient balance. ");
		}
		else
		{
			System.out.println("Amount "+ temp_amt+ " deducted, remaining balance is "+ (amount = amount - temp_amt));
		}	
	}
	
	void deposit()
	{
		System.out.println("Enter amount to deposit: ");
		temp_amt = sc.nextFloat();
		System.out.println("Amount "+ temp_amt+ " deposited, remaining balance is "+ (amount = amount + temp_amt));			
	}
	
	void intrest()
	{
		System.out.println("To find intrest on remaining balance enter time(in months) of deposit ");
		time = sc.nextInt();
		if(time <= 3)
		{
			System.out.println("Intrest on available balance is: " + ((amount * time* 3)/100));
		}
		else if(time > 3 && time <= 12)
		{
			System.out.println("Intrest on available balance is: " + ((amount * time* 4)/100));
		}
		else if(time > 12 && time <= 36)
		{
			System.out.println("Intrest on available balance is: " + ((amount * time* 5.5)/100));
		}
		else
		{
			System.out.println("Intrest on available balance is: " + ((amount * time* 7)/100));
		}
	}
	
}
