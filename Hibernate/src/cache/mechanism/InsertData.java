package cache.mechanism;

import org.hibernate.Session;

public class InsertData 
{
	public static void main(String[] args) 
	{
		Session session = HibernateUtilCache.getSessionFactory().openSession();
		StudentCache stu = new StudentCache();
		stu.setRollno(101);
		stu.setName("ABC");
		session.save(stu);
		session.beginTransaction().commit();
	}
}
