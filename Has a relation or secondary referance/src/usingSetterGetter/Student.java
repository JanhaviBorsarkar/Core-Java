package usingSetterGetter;

public class Student 
{
	private int rollno;
	private String name;
	private Address addr;
	
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
	
	public void setAddr(Address addr) 
	{
		this.addr = addr;
	}
	public Address getAddr() 
	{
		return addr;
	}
	
	

}
