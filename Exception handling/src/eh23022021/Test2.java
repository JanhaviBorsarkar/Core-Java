package eh23022021;

public class Test2 
{
	public static void main(String args[])
	{
		System.out.println("Main starts");
		try
		{
			int a = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("Main ends");
	}
}