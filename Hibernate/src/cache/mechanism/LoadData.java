package cache.mechanism;

import org.hibernate.Session;

public class LoadData 
{
	public static void main(String[] args) 
	{
		Session session = HibernateUtilCache.getSessionFactory().openSession();
		StudentCache s1 = session.load(StudentCache.class, 101);
		System.out.println("Roll no: " +s1.getRollno());
		System.out.println("Name: " +s1.getName());
		
		StudentCache s2 = session.load(StudentCache.class, 101);
		System.out.println("Roll no: " +s2.getRollno());
		System.out.println("Name: " +s2.getName());
		
		Session session1 = HibernateUtilCache.getSessionFactory().openSession();
		StudentCache s3 = session1.load(StudentCache.class, 101);
		System.out.println("Roll no: " +s3.getRollno());
		System.out.println("Name: " +s3.getName());
	}
}
