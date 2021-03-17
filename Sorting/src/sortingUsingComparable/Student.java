package sortingUsingComparable;

public class Student implements Comparable<Student>
{
	private int rollno;
	private String name;
	
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public int getRollno() 
	{
		return rollno;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	
	public int compareTo(Student stu)
	{
		// return this.rollno-stu.rollno;
		return this.name.compareTo(stu.name);
	}
}
