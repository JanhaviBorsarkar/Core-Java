package stored.procedure;

import org.hibernate.Session;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

public class StoredProcedureTest 
{
	public static void main(String[] args) 
	{
		Session s = HUtilStored.getSessionFactory().openSession();
		StoredProcedureQuery spq = s.createStoredProcedureQuery("phone_count");
		spq.registerStoredProcedureParameter("rolno", Integer.class, ParameterMode.IN);
		spq.registerStoredProcedureParameter("phcount", Integer.class, ParameterMode.OUT);
		spq.setParameter("rolno", 1);
		spq.execute();
		System.out.println(spq.getOutputParameterValue("phcount"));
	}
}
