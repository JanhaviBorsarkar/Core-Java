package runnableInterface;

public class A implements Runnable
{
	@Override
	public void run() 
	{
		for(int i = 1; i<20; i++)
		{
			System.out.println("A...." +i);
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
