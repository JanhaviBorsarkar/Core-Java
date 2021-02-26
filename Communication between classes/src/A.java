
public class A 
{
	public void disp()
	{
		System.out.println("Hello---");
	}
	public static void main(String args[])
	{
		System.out.println("Main Started---");
		A a = new A();
		a.disp();
		B b = new B();
		b.display();
		System.out.println("Main Ends Here---");
	}

}
