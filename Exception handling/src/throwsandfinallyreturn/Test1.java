package throwsandfinallyreturn;
// both try and finally blocks has return statement

public class Test1 
{
	public int m2()
	{
		int x = 20;
		try
		{
			System.out.println("Try block");
			return x;
		}
		finally
		{
			x = 30;
			System.out.println("finally block");
			System.out.println("Value of x in finally block is: " +x);
			return x;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		Test1 t = new Test1();
		int x = t.m2();
		System.out.println("Value of x in main is " +x);
	}

}
