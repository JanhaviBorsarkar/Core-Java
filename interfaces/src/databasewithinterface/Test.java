package databasewithinterface;

public class Test 
{
	public static void main(String[] args) 
	{
		Connection con = new Oracle();
		con.commit();
		con.rollback();
		
		Connection con1 = new Mysql();
		con1.commit();
		con1.rollback();
	}
}
