package cache.mechanism;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class StudentCache 
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
