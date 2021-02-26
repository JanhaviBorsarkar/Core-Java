package throwkeyword;

public class SyntaxofThrow 
{
	public void m1()
	{
		ArithmeticException e = new ArithmeticException();
		throw e;
	}
	public void m2()
	{
		throw new ArithmetiException();
	}
}
