package abstractclass;

public class CTest 
{
	public static void main(String args[])
	{
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		
		B b = new C();
		b.m1();
		b.m2();
	}
}
