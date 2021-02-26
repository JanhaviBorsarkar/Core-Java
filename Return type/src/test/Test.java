package test;

public class Test 
{
	public void m1()
	{
		System.out.println("Method of Test");
	}
	public static void main(String args[])
	{
		System.out.println("Main starts");
		Test t = new Test();
		t.m1();
		System.out.println("Main ends");
	}

}
