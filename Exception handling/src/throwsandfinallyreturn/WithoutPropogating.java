package throwsandfinallyreturn;

public class WithoutPropogating 
{
	public void m1()
	{
		try
		{
			int a = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
		}
		System.out.println("m1 ends");
	}
	public void m2()
	{
		m1();
	}
}
