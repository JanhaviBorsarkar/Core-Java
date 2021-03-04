package listPractice;

import java.util.*;

public class Test1 
{
	 public static void main(String[] args) 
	 {
		 List l = new ArrayList();
		 System.out.println("Enter the total number of students: ");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 System.out.println("\n");
		 
		 for(int i = 1; i <= n; i++)
		 {
			 Student s = new Student();
			 System.out.println("Memory address for student: \n" +s);
			 System.out.println("\n");
			 System.out.println("Enter Roll Number: ");
			 s.setRollno(sc.nextInt());
			 System.out.println("\n");
			 System.out.println("Enter Name: ");
			 s.setName(sc.next());
			 l.add(s);
			 System.out.println("\n");
			 System.out.println("List of students: \n" +l);
			 System.out.println("\n");
		 }
		 
		 Iterator itr = l.iterator();
		 while(itr.hasNext())
		 {
			 Student stu = (Student)itr.next();
			 System.out.println("Roll Number of the Student: " +stu.getRollno());
			 System.out.println("Name of the Student: " +stu.getName());
		 }
	}
}
