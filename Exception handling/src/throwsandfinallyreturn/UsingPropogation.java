package throwsandfinallyreturn;

public class UsingPropogation 
{
	public void m1()
	{
		int a = 10/0;
		System.out.println("m1 ends");
	}
	public void m2()
	{
		try
		{
			m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
		}
	}
}
