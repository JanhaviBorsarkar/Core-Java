package databasewithclass;

public class Test 
{
	public static void main(String[] args) 
	{
		Oracle o = new Oracle();
		o.commitOracle();
		o.rollbackOracle();
		
		Mysql m = new Mysql();
		m.commitMysql();
		m.rollbackMysql();
	}

}
