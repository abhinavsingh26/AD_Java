import java.util.Scanner;

public class welcome 
{
	public static String changecase(String name)
	{
		return name.toUpperCase();
	}
	
	
	public static void main(String[] args)
	{
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		name = sc.next();
		String cname = changecase(name);
		System.out.println(cname);
		System.out.println(changecase(cname));
		sc.close();
	}
	
}
