package runnableInterface;

public class Test 
{
	public static void main(String[] args) 
	{
		A a = new A();
		Thread t = new Thread(a);
		t.start();
		for(int i = 1; i  < 20; i++)
		{}
	}
}
