package jdbc.test;

import java.sql.*;

public class DataFromUser 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Main starts");
		 
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		int rno = Integer.parseInt(args[0]);
		String nm = args[1];
		String addr = args[2];
		
		String sql = "insert into student values("+rno+", '"+nm+"', '"+addr+"')";
		
		System.out.println(sql);
		
		Statement smt = con.createStatement();
		
		smt.execute(sql);
		
		con.close();
		smt.close();
		
		System.out.println("Done");
	}
}
