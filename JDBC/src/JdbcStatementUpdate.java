import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatementUpdate 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//Loading driver class and getting connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//getting the connection
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_dbt","root","eov3zl5ilx7c");
		System.out.println("Connection Established");
		
		Statement smt = con.createStatement();
		
		String q1 = "update emp set basicpay = basicpay + 100";
		
		int no = smt.executeUpdate(q1);
		
		System.out.println("Record updated " + no);
		//--------------------------------------------------------------------------------------------------------------------
		Statement smt1 = con.createStatement();
		
		//create query
		String q2 = "select * from emp";
		
		//Execute the Query
		ResultSet rs=smt1.executeQuery(q2);
		
		//Iterate the result set
		while (rs.next())
		{
			System.out.println(rs.getInt("emp.empcode") + " "+ rs.getString("emp.empname") + " "+rs.getFloat("emp.basicpay"));

		}
		
		
	}

}
