package test;

public class StudentTest 
{
	public Student method1()
	{
		Student s1 = new Student();
		s1.setRollno(1);
		s1.setName("XYZ");
		return s1;
	}
	public static void main(String args[])
	{
		StudentTest te1 = new StudentTest();
		Student stu = te1.method1();
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
	}
}
