import java.util.Scanner;

public class HapNum 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		int rem = 0 ; 
		int sum = 0;
		int count = 0;
		if(sum != 1)
		{
			while(number > 0)
			{
				if(count == 10)
				{
					System.out.println("Unhappy Num");
					break;
				}
				
				rem = number %10;
				sum = sum+(rem*rem);
				number = number/10;
				
				count++;
				
				sum = number;
			} 
			
		}
	}

}
