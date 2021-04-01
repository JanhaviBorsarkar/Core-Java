package com.intro;

import org.hibernate.Session;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.*;

public class GetObjectsOfDifferentDTypes 
{
	public static void main(String[] args) 
	{
		Session s = HUtilCriteriaBuilder.getSessionFactory().openSession();
		CriteriaBuilder builder = s.getCriteriaBuilder();
		CriteriaQuery<Object[]> q = builder.createQuery(Object[].class);
		Root<Student> root = q.from(Student.class);
		q.multiselect(root.get("name"), root.get("addr"));
		List<Object[]> list = s.createQuery(q).getResultList();
		for(Object[] obj : list)
		{
			System.out.println(obj[0]);
			System.out.println(obj[1]);
		}
	}
}
