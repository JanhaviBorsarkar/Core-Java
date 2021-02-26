package throwkeyword;

public class WithThrow 
{
	public void method2(int age)
	{
		System.out.println("Method2 of class WithThrow starts");
		if(age < 0)
		{
			throw new ArithmeticException("Age should not be less than zero");
		}
		System.out.println("Method2 of class WithThrow ends");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		WithThrow w1 = new WithThrow();
		try
		{
			w1.method2(7);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block " +e.getMessage());
		}
		System.out.println("Main ends");
	}
}
