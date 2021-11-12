import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatementExampl 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Loading driver class and getting connection	
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		//Getting the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_dbt","root","eov3zl5ilx7c");
		System.out.println("Connection got with local mysql");
		
		//Create Statement
		Statement smt = con.createStatement();
		
		//create query
		String q1= "select * from emp where empcode = 7499";
		//int no = 6569;
		
		//Execute the query
		ResultSet rs = smt.executeQuery(q1);
		
		//Iterate the result set
		while(rs.next())
		{
			//System.out.println(rs.getInt("emp.empcode"));
			System.out.println(rs.getInt("emp.empcode") + " "+ rs.getString("emp.empname") + " "+rs.getFloat("emp.basicpay"));

		}

	}

}
