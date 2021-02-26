package usingConstructor;

public class Student 
{
	int rollno;
	String name;
	Address addr;
	
	public Student(int rollno, String name, Address addr)
	{
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
	}
}
