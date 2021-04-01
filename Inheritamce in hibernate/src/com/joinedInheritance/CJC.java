package com.joinedInheritance;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class CJC 
{
	@Id
	private int id;
	private String sname;
	private String cname;
	// setter getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
