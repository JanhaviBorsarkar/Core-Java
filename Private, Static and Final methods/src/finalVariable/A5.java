package finalVariable;
// defining class variable as final
public class A5 
{
	int x;
	public static void main(String args[])
	{
		A5 a = new A5();
		a.x = 100;
		A5 a1 = new A5();
		a1.x = 200;
		a = a1;
		System.out.println(a.x);
		System.out.println(a1.x);
	}
}
