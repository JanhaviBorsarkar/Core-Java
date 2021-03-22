package com.java.based;

import org.hibernate.Session;

public class PrintData 
{
	public static void main(String[] args) 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		StudentJavaBased s1 = session.load(StudentJavaBased.class, 3);
		System.out.println("Roll no: " +s1.getRollno());
		System.out.println("Name: " +s1.getName());
	}
}
