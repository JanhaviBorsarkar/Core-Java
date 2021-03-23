package mapping.oneToOne.bidirection;

import javax.persistence.*;

@Entity
public class AccountPlus 
{
	@Id
	private int acp_id;
	private String type;
	private String branch;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "acc_no")
	private Account account;
	
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
	
	public void setAccount(Account account) 
	{
		this.account = account;
	}
	public Account getAccount() 
	{
		return account;
	}
}
