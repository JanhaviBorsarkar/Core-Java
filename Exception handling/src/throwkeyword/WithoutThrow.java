package throwkeyword;

public class WithoutThrow 
{
	public void method1()
	{
		System.out.println("Method1 of class WithoutThrow starts");
		int a = 10/0;
		System.out.println("Method1 of class WithoutThrow ends");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		WithoutThrow w = new WithoutThrow();
		try
		{
			w.method1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block " +e.getMessage());
		}
		System.out.println("Main ends");
	}
}
