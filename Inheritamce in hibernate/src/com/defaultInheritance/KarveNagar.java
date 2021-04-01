package com.defaultInheritance;

import javax.persistence.*;

@Entity
public class KarveNagar extends CJC
{
	@Id
	private int kid;
	private String regularbatch;
	
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
