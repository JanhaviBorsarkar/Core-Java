package com.java.based;

import org.hibernate.Session;

public class InsertData 
{
	public static void main(String[] args) 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		StudentJavaBased stu = new StudentJavaBased();
		stu.setRollno(3);
		stu.setName("XYZ");
		session.save(stu);
		session.beginTransaction().commit();
	}
}
