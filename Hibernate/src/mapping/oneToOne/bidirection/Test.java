package mapping.oneToOne.bidirection;

import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) 
	{
		Session session = HibernateUtilBi.getSessionFactory().openSession();
		Account account = new Account();
		account.setAcc_no(101);
		account.setAcc_name("XYZ");
		account.setAmount(50000);
		
		AccountPlus acp = new AccountPlus();
		acp.setAcp_id(101);
		acp.setBranch("Akurdi");
		acp.setType("Savings");
		
		acp.setAccount(account);
		account.setAcp(acp);
		
		session.save(account);
		session.beginTransaction().commit();
	}
}
