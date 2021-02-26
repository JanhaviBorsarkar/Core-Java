package eh23022021;

public class Test 
{
	public static void main(String[] args) 
	{
		try 
		{
			String s = args[0];
			int x = Integer.parseInt(s);
			int a = 10/x;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
			System.out.println("Please enter a non-zero value");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Please enter input value");
		}
		catch(NumberFormatException e2)
		{
			System.out.println("NumberFormatException");
			System.out.println("Please enter numeric string");
		}
	}
}
