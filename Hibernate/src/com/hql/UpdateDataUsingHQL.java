package com.hql;

import org.hibernate.query.Query;
import org.hibernate.*;
import java.util.*;

public class UpdateDataUsingHQL 
{
	public static void main(String[] args) 
	{
		Session s = HibernateUtilHQL.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("update Student set name=:nm where rollno=:rno");
		q.setParameter("nm", "XYZ");
		q.setParameter("rno", 1);
		q.executeUpdate();
		tx.commit();
	}
}
