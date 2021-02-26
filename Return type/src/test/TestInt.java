package test;

public class TestInt 
{
	public int m2()
	{
		System.out.println("Method of Test");
		return 10;
	}
	public static void main(String args[])
	{
		System.out.println("Main starts here");
		TestInt t1 = new TestInt();
		int x = t1.m2();
		System.out.println(x);
		System.out.println("main ends here");
	}

}
