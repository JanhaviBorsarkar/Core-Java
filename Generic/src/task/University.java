package task;

import java.util.*;

public class University 
{
	public static void main(String[] args) 
	{
		College c = new College();
		List<Student> list = c.getInfo();
		System.out.println("\n List of Students: ");
		for(Student stu : list)
		{
			System.out.println("Roll Number: " +stu.getRollno());
			System.out.println("Name: " +stu.getName());
		}
	}
}