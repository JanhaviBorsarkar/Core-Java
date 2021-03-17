package jdbc.test;

import java.sql.*;

public class Test 
{
	 public static void main(String[] args) throws Exception
	 {
		System.out.println("Main starts");
		 
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		//String sql = "create table student (rollno int, name varchar(24), address varchar(24))";
		String sql = "insert into student values(2, 'abc', ' pune')"; 
		
		Statement smt = con.createStatement();
		
		smt.execute(sql);
		//System.out.println("Table created successfully");
		System.out.println("Values added successfully");
		
		con.close();
		smt.close();
			
	}
}
