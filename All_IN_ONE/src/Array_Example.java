import java.util.Scanner;

public class Array_Example 
{

	public static String findODD(int num)
	{
		String result;
		if (num % 2 == 0)
			result = "Even";
		else
			result = "Odd";
		return result;
	}
	
	public static String[] find_array_odd_even(int[] num)
	{
		String[] result = new String[4];
		for(int i = 0; i < num.length; i++)
			if(num[i] % 2 == 0)
				result[i] = "Even";
			else
				result[i] = "Odd";
		return result;
	}
	public static void main(String[] args) 
	{
		int[] num = new int[4];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number the erray Element");
//----------------------------------------------------------------------------------

		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
//--------------------------------------------------------------------------------------
		System.out.println("Array Element");
		
		for(int i = 0; i < num.length; i++)
		{
			String result = findODD(num[i]);
			System.out.println(num[i] + " is "+ result);
		}
//--------------------------------------------------------------------------------------
		System.out.println("Array Element");
		
		for ( int i= 0; i< num.length; i++)
		{
			System.out.println(num[i]+ " ");
		}
		System.out.println(" ");
		
		String[] result =find_array_odd_even(num);

//--------------------------------------------------------------------------------------
		for(int i = 0; i< result.length; i++)
		{
			System.out.print(result[i]+ " ");
		}
	}
}
