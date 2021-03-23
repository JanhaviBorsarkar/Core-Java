package mapping.oneToOne.bidirection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Account 
{
	@Id
	private int acc_no;
	private String acc_name;
	private int amount;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
	private AccountPlus acp;
	
	public void setAcc_no(int acc_no) 
	{
		this.acc_no = acc_no;
	}
	public int getAcc_no() 
	{
		return acc_no;
	}
	
	public void setAcc_name(String acc_name) 
	{
		this.acc_name = acc_name;
	}
	public String getAcc_name() 
	{
		return acc_name;
	}
	
	public void setAmount(int amount) 
	{
		this.amount = amount;
	}
	public int getAmount() 
	{
			return amount;
	}

	public void setAcp(AccountPlus acp) 
	{
		this.acp = acp;
	}
	public AccountPlus getAcp() 
	{
		return acp;
	}
}
