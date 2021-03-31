package stored.procedure;

import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) 
	{
		Session s = HUtilStored.getSessionFactory().openSession();
		
		Student stu = new Student();
		stu.setRollno(1);
		stu.setName("ABC");
		stu.setAddr("Pune");
		
		Phone p = new Phone();
		p.setPhid(1);
		p.setPhno("9876543210");
		p.setStu(stu);
		
		Phone p1= new Phone();
		p1.setPhid(2);
		p1.setPhno("8901234567");
		p1.setStu(stu);
		
		stu.getSphone().add(p);
		stu.getSphone().add(p1);
		
		s.save(stu);
		s.beginTransaction().commit();
		
	}
}
