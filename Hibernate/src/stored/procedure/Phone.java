package stored.procedure;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Phone 
{
	@Id
	private int phid;
	private String phno;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rno")
	private Student stu;
	
	public int getPhid() {
		return phid;
	}
	public void setPhid(int phid) {
		this.phid = phid;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	
}
