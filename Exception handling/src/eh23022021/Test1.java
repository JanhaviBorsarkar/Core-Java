package eh23022021;

public class Test1 
{
	public static void main(String args[])
	{
		System.out.println("Main starts");
		try
		{
			int a = 10/0;
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("Main ends");
	}
}
