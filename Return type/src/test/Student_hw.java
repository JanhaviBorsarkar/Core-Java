package test;

public class Student_hw 
{
	int rollnum;
	String names;
	
	public Student_hw methods()
	{
		 Student_hw stu = new  Student_hw();
		 stu.rollnum = 1;
		 stu.names = "ABC";
		 return stu;
	}
	public static void main(String args[])
	{
		 Student_hw stu = new  Student_hw();
		 Student_hw m = stu.methods();
		 
		 System.out.println("Roll number: " +m.rollnum);
		 System.out.println("Name: " +m.names);
	}
}
