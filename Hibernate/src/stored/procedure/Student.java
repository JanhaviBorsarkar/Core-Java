package stored.procedure;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class Student 
{
	@Id
	private int rollno;
	private String name;
	private String addr;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "stu")
	private Set<Phone> sphone = new HashSet<>();
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Set<Phone> getSphone() {
		return sphone;
	}
	public void setSphone(Set<Phone> sphone) {
		this.sphone = sphone;
	}
	
	
}
