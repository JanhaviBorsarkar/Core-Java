package com.intro;

import org.hibernate.Session;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class GetSingleEntry 
{
	public static void main(String[] args) 
	{
		Session s = HUtilCriteriaBuilder.getSessionFactory().openSession();
		CriteriaBuilder builder = s.getCriteriaBuilder();
		CriteriaQuery<Student> q = builder.createQuery(Student.class);
		Root<Student> root = q.from(Student.class);
		q.select(root).where(builder.equal(root.get("rollno"), 1));
		Student stu = s.createQuery(q).getSingleResult();
		System.out.println("Roll number: " +stu.getRollno());
		System.out.println("Name: " +stu.getName());
		System.out.println("Address: " +stu.getAddr());
	}
}
