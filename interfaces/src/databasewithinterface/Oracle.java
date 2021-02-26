package databasewithinterface;

public class Oracle implements Connection 
{
	public void commit() 
	{
		System.out.println("Commit--Oracle");
	}
	public void rollback() 
	{
		System.out.println("Rollback--Oracle");
	}
}
