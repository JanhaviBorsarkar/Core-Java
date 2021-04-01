package com.intro;

import org.hibernate.Session;

public class SetData 
{
	public static void main(String[] args) 
	{
		Session s = HUtilCriteriaBuilder.getSessionFactory().openSession();
		
		Student stu = new Student();
		stu.setRollno(1);
		stu.setName("ABC");
		stu.setAddr("Pune");
		
		Student stu1 = new Student();
		stu1.setRollno(2);
		stu1.setName("XYZ");
		stu1.setAddr("Mumbai");
		
		s.save(stu);
		s.save(stu1);
		s.beginTransaction().commit();
	}
}
