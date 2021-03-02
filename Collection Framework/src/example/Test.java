package example;

import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add(new Student(1,"abc"));
		l.add(new Student(2,"xyz"));
		l.add(new Employee(101, "ename"));
		l.add(new Employee(102, "ename1"));
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			
			if(o instanceof Student)
			{
				Student stu = (Student)o;
				System.out.println("Student details: " +stu);
			}
			else if(o instanceof Employee)
			{
				Employee e = (Employee)o;
				System.out.println("Employee details: " +e);
			}
		}
	}
}
