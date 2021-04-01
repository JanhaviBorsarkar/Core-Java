package com.joinedInheritance;

import javax.persistence.Entity;

@Entity
public class Akurdi extends CJC
{
	private int aid;
	private String weekendbatch;
	// setter getter
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
