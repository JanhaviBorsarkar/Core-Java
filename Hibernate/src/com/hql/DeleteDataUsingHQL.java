package com.hql;

import org.hibernate.*;
import org.hibernate.query.Query;
import java.util.*;

public class DeleteDataUsingHQL 
{
	public static void main(String[] args) 
	{
		Session s = HibernateUtilHQL.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("delete Student where rollno=:rno");
		q.setParameter("rno", 1);
		q.executeUpdate();
		tx.commit();
	}
}
