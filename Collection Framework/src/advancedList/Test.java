package advancedList;

import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setRollno(1);
		s1.setName("abc");
		
		Student s2 = new Student();
		s2.setRollno(2);
		s2.setName("xyz");
		
		List l = new ArrayList();
		l.add(s1);
		l.add(s2);
		
		// Iterating by index
		System.out.println("Iteration by given index");
		Student stu = (Student)l.get(1);
		System.out.println("Roll no of Student at index 1 is " +stu.getRollno());
		System.out.println("Name of student at index 1 is "+stu.getName());
		
		System.out.println("\n");
		
		// Sequential iteration
		System.out.println("Sequetial iteration");
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			Student stu1 = (Student)itr.next();
			System.out.println("Roll number: " +stu1.getRollno());
			System.out.println("Name: " +stu1.getName());
		}
	}
}
