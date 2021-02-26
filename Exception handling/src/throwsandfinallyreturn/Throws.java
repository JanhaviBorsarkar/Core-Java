package throwsandfinallyreturn;

public class Throws 
{
	
	// checked exception
	public void m1()
	{
		Class.forName("A");
	}
	
	//using try-catch block
	public void m2()
	{
		try
		{
			Class.forName("A");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Catch block");
		}
	}
	
	// using throws keyword
	public void m3() throws ClassNotFoundException
	{
		Class.forName("A");
	}
}
