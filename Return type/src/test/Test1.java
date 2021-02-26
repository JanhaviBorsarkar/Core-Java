package test;

public class Test1 
{
	public int m3(int a, int b)
	{
		System.out.println("Method of Test1");
		int c = a + b;
		return c;
	}
	public static void main(String args[])
	{
		System.out.println("Main starts");
		Test1 te = new Test1();
		int x = te.m3(28, 12);
		System.out.println(x);
		System.out.println("Main ends");
	}

}
