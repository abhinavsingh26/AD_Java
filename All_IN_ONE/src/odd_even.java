import java.util.Scanner;

public class odd_even 
{

	public static String findOddOrEven(int num)
	{
		String result;
		if (num %2==0)
		{
			result = "Even";
		}
		else
		{
			result = "ODD";
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		// finding odd even
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find odd or even");
		num = sc.nextInt();
		
		String result = findOddOrEven(num);
		System.out.println("Given Number is " + result);

	}

}
