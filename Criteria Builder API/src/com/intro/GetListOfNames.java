package com.intro;

import org.hibernate.Session;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.*;

public class GetListOfNames 
{
	public static void main(String[] args) 
	{
		Session s = HUtilCriteriaBuilder.getSessionFactory().openSession();
		CriteriaBuilder builder = s.getCriteriaBuilder();
		CriteriaQuery<String> q = builder.createQuery(String.class);
		Root<Student> root = q.from(Student.class);
		q.select(root.get("name"));
		List<String> list = s.createQuery(q).getResultList();
		for(String nm : list)
		{
			System.out.println(nm);
		}
		
	}
}
