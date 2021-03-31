package com.hql;

import org.hibernate.query.Query;
import org.hibernate.Session;
import java.util.*;

public class SetDataUsingHQL 
{
	public static void main(String[] args) 
	{
		// we cant insert data directly using hql
		Session s = HibernateUtilHQL.getSessionFactory().openSession();
		Student stu = new Student();
		stu.setRollno(1);
		stu.setName("ABC");
		stu.setAddr("Pune");
		
		Student stu1= new Student();
		stu1.setRollno(2);
		stu1.setName("XYZ");
		stu1.setAddr("Pune");
		
		s.save(stu);
		s.save(stu1);
		s.beginTransaction().commit();
		System.out.println("Details set successfully!");
	}
}
