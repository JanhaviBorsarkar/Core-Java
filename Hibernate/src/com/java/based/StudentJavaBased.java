package com.java.based;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentJavaBased 
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