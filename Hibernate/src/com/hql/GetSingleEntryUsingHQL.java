package com.hql;

import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.*;

public class GetSingleEntryUsingHQL 
{
	public static void main(String[] args) 
	{
		Session s = HibernateUtilHQL.getSessionFactory().openSession();
		Query q = s.createQuery("from Student where rollno =:rno");
		q.setParameter("rno", 1);
		Student stu = (Student) q.getSingleResult();
		
		System.out.println("Roll number: " +stu.getRollno());
		System.out.println("Name: " +stu.getName());
		System.out.println("Address: " +stu.getAddr());
	}
}
