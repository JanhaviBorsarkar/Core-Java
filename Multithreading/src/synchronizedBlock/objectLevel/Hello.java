package synchronizedBlock.objectLevel;

public class Hello 
{
	public void display(String msg) {
		System.out.println("Hello.....");
		synchronized (this) {
			System.out.println("[");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg);
			System.out.println("]");
			
		}
				
	}

}
