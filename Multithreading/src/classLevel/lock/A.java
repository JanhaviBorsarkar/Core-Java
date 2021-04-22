package classLevel.lock;

public class A  extends Thread
{
	Hello h;
	String msg;
	public A(Hello h, String msg)
	{
		this.h = h;
		this.msg = msg;
	}
	public void run()
	{
		h.display(msg);
	}
}
