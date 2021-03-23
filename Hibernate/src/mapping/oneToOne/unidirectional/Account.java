package mapping.oneToOne.unidirectional;

import javax.persistence.*;

@Entity
public class Account 
{
	@Id
	private int acc_no;
	private String acc_name;
	private int amount;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account")
	private AccountPlus acp;
	
	public void setAcc_no(int acc_no) 
	{
		this.acc_no = acc_no;
	}
	public int getAcc_no() 
	{
		return acc_no;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
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
	public AccountPlus getAcp() {
		return acp;
	}
	
}
