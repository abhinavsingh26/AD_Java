
public class TestClassAndObject 
{

	public static void main(String[] args)
	{
		float dprice= 0.0f;
		
		Book b1 = new Book();
		Book b2 = new Book();
		
		System.out.println("Enter the B1 Data : ");
		b1.ReadBookData();
		
		System.out.println("b1 object data");
		b1.DisplayBook();
		
		dprice =  b1.FindPriceDiscount();
		System.out.println(" Reduced Price: " + dprice);
		
		System.out.println(" Enter the b2 data");
		b2.ReadBookData();
		
		System.out.println(" b2 object data");
		b2.DisplayBook();
		
		dprice = b2.FindPriceDiscount();
		System.out.println(" Resuced Price : " + dprice);
		
		

	}

}
