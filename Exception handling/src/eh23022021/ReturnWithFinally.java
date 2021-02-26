package eh23022021;

public class ReturnWithFinally 
{
	public int m1()
	{
		int x = 10;
		try
		{
			System.out.println("Try block");
			return x;
		}
		finally
		{
			System.out.println("Finally block");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		ReturnWithFinally r1 = new ReturnWithFinally();
		int x = r1.m1();
		System.out.println(x);
		System.out.println("Main ends");
	}
}
