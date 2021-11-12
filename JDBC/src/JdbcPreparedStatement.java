import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcPreparedStatement 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con= CreateConnection();
		Selectwithcondition(con);
		//selectAll(con);
		//deleteusingEmpcode(con);
		//updateSal(con);
		//selectAll(con);
		insertemp(con);
		selectAll(con);
		
	}

	private static void insertemp(Connection con) throws SQLException 
	{
		String q1 = "insert into emp(empcode, empname, basicpay) values(?, ?, ? ) ";
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the employee code, employee name , employee salary ");
		
		int no = sc.nextInt();
		String name = sc.next();
		float sal = sc.nextFloat();
		
		PreparedStatement pmt = con.prepareStatement(q1);
		pmt.setInt(1, no);
		pmt.setString(2, name);
		pmt.setFloat(3, sal);
		
		int row = pmt.executeUpdate();
		System.out.println(row + "Record Inserted");
		
	}

	private static void updateSal(Connection con) throws SQLException 
	{
		String q1 = "update emp set basicpay = basicpay + ? where empcode = ?";
		PreparedStatement pmt = con.prepareStatement(q1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empcode and increment salary to update ");
		int no = sc.nextInt();
		float sal =sc.nextFloat();
		
		pmt.setFloat(1, sal);
		pmt.setInt(2, no);
		
		int row = pmt.executeUpdate();
		System.out.println("Record Updated " + row);
		
	}

	private static void deleteusingEmpcode(Connection con) throws SQLException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee code to delete");
		int no = sc.nextInt();
		
		String q1= "delete from emp where empcode = ? ";
		
		PreparedStatement pmt = con.prepareStatement(q1);
		pmt.setInt(1, no) ; 
		
		int row= pmt.executeUpdate();
		System.out.println(no + "Record Deleted");
		
	}

	private static void selectAll(Connection con) throws SQLException 
	{
		String q1 = "select * from emp";
		PreparedStatement pmt = con.prepareStatement(q1);
		ResultSet rs = pmt.executeQuery(q1);
		
		while(rs.next())
		{
			System.out.println(rs.getInt("emp.empcode") + " " + rs.getString("emp.empname") + " " + rs.getFloat("emp.basicpay"));
		}
		
	}

	private static void Selectwithcondition(Connection con) throws SQLException
	{
		String q1= "select * from emp where empcode= ? ";
		
		PreparedStatement pmt = con.prepareStatement(q1);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee code to select : " );
		int no = sc.nextInt();
		
		pmt.setInt(1,  no);
		ResultSet rs=pmt.executeQuery();
		
		while (rs.next())
		{
			System.out.println(rs.getInt("emp.empcode") + " " + rs.getString("emp.empname") + " " + rs.getFloat("emp.basicpay"));
		}		
	}

	private static Connection CreateConnection() throws ClassNotFoundException, SQLException
	{
		// Loading Driver class and getting connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Getting the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_dbt","root","eov3zl5ilx7c");
		System.out.println("Connection Established");
		
		//Select using condition
		return con;
	}

}
