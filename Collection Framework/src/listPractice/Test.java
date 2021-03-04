package listPractice;

import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		Student s = new Student();
		System.out.println("Memory address of s: \n" +s);
		s.setRollno(1);
		s.setName("ABC");
		l.add(s);
		
		System.out.println("\n");
		
		s = new Student();
		System.out.println("Memory address of s for second student: \n " +s);
		s.setName("XYZ");
		s.setRollno(2);
		l.add(s);
		
		System.out.println("\n");
		
		System.out.println("List of students: \n" +l);
		Student stu = (Student)l.get(0);
		System.out.println("\n");
		System.out.println("Roll number of student at index 0 is " +stu.getRollno());
		System.out.println("Name of student at index 0 is " +stu.getName());
	}

}
