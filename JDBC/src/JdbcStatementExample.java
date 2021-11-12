
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcStatementExample 
{

	public static void main(String[] args) throws ClassNotFoundException , SQLException
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_dbt","root", "eov3zl5ilx7c");
		
		System.out.println("Connection got with mysql");
		
		//Statement smt = con.createStatement();
		
		//String q1 = "select * from  emp";
		
		//ResultSet rs = smt.executeQuery(q1);
		
		//while (rs.next())
		//{
			//System.out.println(rs.getInt(1) + rs.getString(2) + rs.getFloat(6));
		//}
		
	}

}
