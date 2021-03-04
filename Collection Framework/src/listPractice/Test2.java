package listPractice;

import java.util.*;

public class Test2 
{
	public static void main(String[] args) 
	{
		List mca = new ArrayList();
		List mca1 = new ArrayList();
		List mca2 = new ArrayList();
		
		Student s1 = new Student();
		s1.setRollno(1);
		s1.setName("abc");
		mca1.add(s1);
		
		s1 = new Student();
		s1.setRollno(2);
		s1.setName("xyz");
		mca1.add(s1);
		
		s1 = new Student();
		s1.setRollno(3);
		s1.setName("pqr");
		mca2.add(s1);
		
		s1 = new Student();
		s1.setRollno(4);
		s1.setName("mno");
		mca2.add(s1);
		
		mca.add(mca1);
		mca.add(mca2);
		
		Iterator itr = mca.iterator();
		while(itr.hasNext())
		{
			List l = (List)itr.next();
			Iterator itr1 = l.iterator();
			while(itr1.hasNext())
			{
				Student stu = (Student)itr.next();
				System.out.println("Roll Number of Student is " +stu.getRollno());
				System.out.println("Name of Student is " +stu.getName());
			}
		}
	}
}
