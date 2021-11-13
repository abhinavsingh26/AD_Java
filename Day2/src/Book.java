import java.util.Scanner;

public class Book 
{
	int bid;
	String bname;
	float bprice;
	String aname;

	public void DisplayBook() 
	{
		System.out.println(bid);
		System.out.println(bname);
		System.out.println(bprice);
		System.out.println(aname);
		
	}

	public void ReadBookData() 
	{
		Scanner sc =new Scanner(System.in);
		bid= sc.nextInt();
		bname= sc.next();
		bprice = sc.nextFloat();
		aname= sc.next();
	}

	public float FindPriceDiscount() 
	{
		float discount = 0.0f;
		if(bprice > 500)
		{
			discount = bprice* 0.02f;
		}
		else
		{
			discount = 0.0f;
		}
		float dprice = (bprice - discount);
		
		return dprice;
	}

}
