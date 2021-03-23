package mapping.oneToOne.unidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountPlus 
{
	@Id
	private int acp_id;
	private String type;
	private String branch;
	
	public void setAcp_id(int acp_id) 
	{
		this.acp_id = acp_id;
	}
	public int getAcp_id() 
	{
		return acp_id;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	public String getType() 
	{
		return type;
	}
	
	public void setBranch(String branch) 
	{
		this.branch = branch;
	}
	public String getBranch() 
	{
		return branch;
	}
}
