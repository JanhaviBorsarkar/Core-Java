package intro_to_generic;

import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setRollno(1);
		s1.setName("Abc");
		
		Student s2 = new Student();
		s2.setRollno(2);
		s2.setName("Xyz");
		
		List<Student> l = new ArrayList<>();
		l.add(s1);
		l.add(s2);
		
		for(Student stu : l)
		{
			System.out.println("Roll Number: " +stu.getRollno());
			System.out.println("Name: " +stu.getName());
		}
	}
}
