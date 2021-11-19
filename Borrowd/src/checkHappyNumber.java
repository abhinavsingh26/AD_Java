import java.util.*;

public class checkHappyNumber
{
	public static int checkHappy (int number)
	{
		
		int rem = 0, sum = 0; 

		// calculate the sum of squares of each digits
		while(number > 0)
		{
			rem = number %10;
			sum = sum+(rem*rem);
			number = number/10;
		}

		return sum;
	}

	public static void main(String[] args)
	{
		// Take number from KeyBoard
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a non-zero Positive Number:");
		int number1 = sc.nextInt( );
		int number2 = sc.nextInt( );
		//int  result = number;
		int count=0;
		
		for(int x=number1;number1<=number2;x++) 
		{
			int result=x;
			while (result != 1 && result != 4)
			{
				count++;
				result = checkHappy(result);
			}
			
			System.out.println("iterations"+count);
			
			if (result ==1)
			{
				System.out.print ("Happy Numbers are:"+x+",");
			}
			else
			{
				System.out.println (" It is not a Happy Number");
			}
		}
	}
}