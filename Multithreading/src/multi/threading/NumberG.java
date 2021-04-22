package multi.threading;

public class NumberG  extends Thread
{
	int strt;
	int end;
	
	public NumberG(int strt, int end)
	{
		this.strt = strt;
		this.end = end;
	}
	
	public void run()
	{
		for(int i = strt; i < end; i++)
		{
			try
			{
				sleep(300);
			}
			catch(Exception e)
			{
				System.out.println("exception");
			}
			System.out.println(i+ " " +Thread.currentThread().getName());
			i = i + 1;
		}
	}
}
