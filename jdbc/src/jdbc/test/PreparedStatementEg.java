package jdbc.test;

import java.sql.*;

public class PreparedStatementEg 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		String sql = "insert into student values(?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1,5);
		ps.setString(2, "student");
		ps.setString(3, "Aurangabad");
		ps.execute();
		
		ps.close();
		con.close();
		
		System.out.println("Done");
	}

}
