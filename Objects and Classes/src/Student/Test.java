package Student;

public class Test 
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "XYZ";
		
		Student s2 = new Student();
		s2.rollno = 2;
		s2.name = "ABC";
		
		System.out.println("Student 1 details:");
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		
		System.out.println("Student 2 details: ");
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		
	}

}
