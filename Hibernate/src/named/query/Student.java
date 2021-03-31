package named.query;

import javax.persistence.*;

@Entity
@NamedQuery(name = "s_all", query = "from Student")
public class Student 
{
	@Id
	private int rollno;
	private String name;
	private String addr;
	//setter getter
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
	
	
}
