package task;

public class B extends A
{
	static void m1()
	{
		System.out.println("m1---B");
	}
	static void m2()
	{
		System.out.println("m2---B");
	}
	protected void m3()
	{
		System.out.println("m3---B");
	}
	protected void m4()
	{
		System.out.println("m4---B");
	}
	/* final void m5()
	{
		System.out.println("m5---B");
	} */
	public B m6()
	{
		A a = new A();
		B b = new B();
		System.out.println("m6---B");
		return b;
	}
}
