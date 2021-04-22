package synchronizedBlock.classLevel;

public class Hello 
{
	public void display(String msg) {
		synchronized (Hello.class) {
			System.out.println("[");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(msg);
			System.out.println("]");
		}
		
	}

}
