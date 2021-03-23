package student.management;

import java.util.Scanner;
import org.hibernate.Session;

public class MethodsToCall 
{
	Student s = new Student();
	Scanner sc = new Scanner(System.in);

	public void addStudent()
	{
		Session session =  HibernateUtilStudent.getSessionFactory().openSession();
		System.out.println("Enter Rollno: ");
		s.setRollno(sc.nextInt());
		System.out.println("Enter Name: ");
		s.setName(sc.next());
		session.save(s);
		session.beginTransaction().commit();
		System.out.println("Details added successfully");
		System.out.println("--------------------------------------------------------------------");
	}
	
	public void viewStudent()
	{
		Session session1 = HibernateUtilStudent.getSessionFactory().openSession();
		System.out.println("Enter the roll number you want to view details of: ");
		int rnov = sc.nextInt();
		s = session1.get(Student.class, rnov);
		System.out.println("Roll no: " +s.getRollno());
		System.out.println("Name: " +s.getName());	
		System.out.println("--------------------------------------------------------------------");
	}
	
	public void updateDetails()
	{
		Session session2 =  HibernateUtilStudent.getSessionFactory().openSession();
		System.out.println("Enter the row number you want to update: ");
		int row = sc.nextInt();
		s = session2.get(Student.class, row);
		System.out.println("The details that you want to update are: \n Roll number: " +s.getRollno()+ "\n Name: " +s.getName());
		System.out.println("Enter the name you want to assign: ");
		String update = sc.next();
		s.setName(update);
		session2.update(s);
		session2.beginTransaction().commit();
		System.out.println("Name updated successfully");
		System.out.println("--------------------------------------------------------------------");
	}
	
	public void deleteDetails()
	{
		Session session3 = HibernateUtilStudent.getSessionFactory().openSession();
		System.out.println("Enter the roll number you want to delete: ");
		int rno = sc.nextInt();
		Student s1 = new Student();
		s1 = session3.get(Student.class, rno);
		System.out.println("The details that you want to delete are: \n Roll number: " +s1.getRollno()+ "\n Name: " +s1.getName());
		session3.delete(s1);
		session3.beginTransaction().commit();
		System.out.println("Details removed successfully");
		System.out.println("--------------------------------------------------------------------");
	}
	
}
