package com.hql;

import org.hibernate.Session;
import org.hibernate.query.*;
import java.util.*;

public class GetDataUsingHQL 
{
	public static void main(String[] args) 
	{
		Session s = HibernateUtilHQL.getSessionFactory().openSession();
		Query q = s.createQuery("from Student");
		List<Student> list = q.getResultList();
		for(Student stu : list)
		{
			System.out.println("Roll number: " +stu.getRollno());
			System.out.println("Name: " +stu.getName());
			System.out.println("Address: " +stu.getAddr());
		}
	}
}
