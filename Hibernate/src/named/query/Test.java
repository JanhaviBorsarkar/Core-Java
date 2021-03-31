package named.query;

import org.hibernate.*;
import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		Session s = HibernateUtilNamedQuery.getSessionFactory().openSession();
		List<Student> list = s.createNamedQuery("s_all").getResultList();
		Student stu = new Student();
		stu.setRollno(1);
		stu.setName("ABC");
		stu.setAddr("pune");
		for(Student stu1 : list)
		{
			System.out.println("Roll number: " +stu1.getRollno());
			System.out.println("Name: " +stu1.getName());
			System.out.println("Address: " +stu1.getAddr());
		}
		s.save(stu);
		s.beginTransaction().commit();
		
	}
}
