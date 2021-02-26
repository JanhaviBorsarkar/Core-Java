package trycatch;

public class Test 
{
	public static void main(String args[])
	{
		System.out.println("Main Starts");
		try
		{
			System.out.println("Try starts");
			int a = 10/0;
			System.out.println("try ends");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
		}
		System.out.println("Main Ends");
	}
}