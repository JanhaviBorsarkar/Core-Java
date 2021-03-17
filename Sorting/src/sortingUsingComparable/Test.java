package sortingUsingComparable;

import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		Set<Student> st = new TreeSet<>();
		
		Student s = new Student();
		s.setRollno(3);
		s.setName("aaa");
		
		Student s1 = new Student();
		s1.setRollno(1);
		s1.setName("bbb");
		
		Student s2 = new Student();
		s2.setRollno(2);
		s2.setName("ccc");
		
		st.add(s);
		st.add(s1);
		st.add(s2);
		
		for(Student stu : st)
		{
			System.out.println("Roll number: " +stu.getRollno());
			System.out.println("Name: " +stu.getName());
		}
	}
}
