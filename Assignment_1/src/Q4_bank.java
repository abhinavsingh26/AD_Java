import java.util.Scanner;

public class Q4_bank {

	public static void main(String[] args) 
	{
		Q4_account QA = new Q4_account();
		Scanner scan = new Scanner(System.in);
		QA.read_account(123,"Abhinav", 12345.45); 
		System.out.println("<----------MENU-------------->");
		System.out.println("Press 1 for deposit.");
		System.out.println("Press 2 for withdrawl.");
		System.out.println("Press 3 to know intrest.");
		System.out.println("Press 4 to exit.");
		
		do{
			int choice= scan.nextInt();
		
			switch(choice)
		
			{
				case 1: 
					QA.deposit();
					break;
		
				case 2:
					QA.withdraw();
					break;
				case 3:
					QA.intrest();
					break;
				case 4:
					System.exit(0);
					break;
			}
		
		}while(true);
	}

}
