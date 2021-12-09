
public class Q3_Electric_Bill 
{

	public static void main(String[] args) 
	{
		Q3_Electricity QE= new Q3_Electricity(0, null, 0);
		
		QE.readData();
		QE.computeBill();
		QE.showData();
	}

}
