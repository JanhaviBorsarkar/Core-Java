package task;

import java.util.*;

public class College 
{
	// defining method
	public List<Student> getInfo()
	{
		Scanner sc = new Scanner(System.in);
		// getting the no of students
		System.out.println("Enter the number of students you want details of: ");
		int m = sc.nextInt();
		// creating a list of size m
		List<Student> list = new ArrayList<>();
		// getting student details
		for(int i = 0; i < m; i++)
		{
			Student s = new Student();
			System.out.println("Enter the Roll Number: ");
			s.setRollno(sc.nextInt());
	
			System.out.println("Enter the Name: ");
			s.setName(sc.next());
			// storing details into list
			list.add(s);
			System.out.println("\n");
		}
		System.out.println("\n List of Students: ");
		for(Student stu : list)
		{
			System.out.println("Roll Number: " +stu.getRollno());
			System.out.println("Name: " +stu.getName());
		}
		
		System.out.println("\n");
		return list;
	}
}
