package com.defaultInheritance;

import javax.persistence.*;

@Entity
public class Akurdi extends CJC
{
	@Id
	private int aid;
	private String weekendbatch;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getWeekendbatch() {
		return weekendbatch;
	}
	public void setWeekendbatch(String weekendbatch) {
		this.weekendbatch = weekendbatch;
	}
	
	
}
