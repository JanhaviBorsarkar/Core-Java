package com.model;

import javax.persistence.*;

// Entity is used to give the name to table
@Entity
public class StudentHibernate 
{
	// define primary key using id
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
