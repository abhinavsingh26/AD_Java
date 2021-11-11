import java.util.Scanner;

public class ExceptionEx 
{
	private static void addNumber(int a, int b) 
	{
		try
		{
			int c=a/b;
			System.out.println("value of c = " + c);
		}
		catch(java.lang.ArithmeticException e) 
		{
			System.out.println(e.getMessage());
			System.out.println("Invalid Input");
		}
		
	}
	
	private static void addArray(int[] num)
	{
		try
		{
			for(int i=0 ; i<5 ;i++)
			{
				System.out.println(num[i]);
			}
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of bounds");
		}
	}
	
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);	
	int a= sc.nextInt();
	int b= sc.nextInt();
	int[] num= {10, 20, 30, 40};
	String str= null;
	
	addNumber(a,b);
	addArray(num);
	StringData(str);
	sc.close();
	}

	private static void StringData(String str)
	{
		try
		{
			System.out.println(str.length());
		}
		catch(java.lang.NullPointerException e)
		{
			System.out.println("String is null");
		}
		
	}


	

	

}
