package jdbc.test;

import java.sql.*;

public class GetDataFromDB 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		String sql = "select * from student";
		
		Statement smt = con.createStatement();
		
		ResultSet rs = smt.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
	}

}
