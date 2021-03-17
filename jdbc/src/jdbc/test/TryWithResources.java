package jdbc.test;

import java.sql.*;

public class TryWithResources 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
					Statement smt = con.createStatement();
					ResultSet rs = smt.executeQuery("select * from student");)	
			{
				while(rs.next())
				{
					System.out.println("Roll number: " +rs.getInt(1));
					System.out.println("Name: " +rs.getString(2));
					System.out.println("Address: " +rs.getString(3));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
