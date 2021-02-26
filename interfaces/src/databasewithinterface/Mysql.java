package databasewithinterface;

public class Mysql implements Connection 
{
	public void commit() 
	{
		System.out.println("Commit--Mysql");
	}
	public void rollback() 
	{
		System.out.println("Rollback--Mysql");
	}

}
