package annotation.based;

import javax.persistence.*;
@Entity
public class StudentAnnotation 
{
	@Id
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
}
