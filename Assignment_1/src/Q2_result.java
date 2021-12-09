
public class Q2_result 
{

	public static void main(String[] args) 
	{
		Q2_Student QS = new Q2_Student();
		Q2_Student QS1 = new Q2_Student();
		
		QS.record(1, "Abhinav", 555, "first");
		QS1.record(2, "Manya", 345, "Second");
		
		QS.displayInfo();
		QS1.displayInfo();

	}

}
