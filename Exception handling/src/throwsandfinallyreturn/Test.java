package throwsandfinallyreturn;
// only try block has return statement
public class Test 
{
	public int m1()
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
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Test t = new Test();
		int x = t.m1();
		System.out.println("Value of x in main is " +x);
	}

}
