package com.joinedInheritance;

import javax.persistence.Entity;

@Entity
public class KarveNagar extends CJC
{
	private int kid;
	private String regularbatch;
	// setter getter
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getRegularbatch() {
		return regularbatch;
	}
	public void setRegularbatch(String regularbatch) {
		this.regularbatch = regularbatch;
	}
}
