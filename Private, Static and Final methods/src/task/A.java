package task;

public class A 
{
	static void m1()
	{
		System.out.println("m1---A");
	}
	static void m2()
	{
		System.out.println("m2---A");
	}
	protected void m3()
	{
		System.out.println("m3---A");
	}
	private void m4()
	{
		System.out.println("m4---A");
	}
	final void m5()
	{
		System.out.println("m5---A");
	}
	public A m6()
	{
		A a = new A();
		System.out.println("m6---A");
		return a;
	}
}
