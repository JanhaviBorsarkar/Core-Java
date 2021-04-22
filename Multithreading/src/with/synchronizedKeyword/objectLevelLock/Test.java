package with.synchronizedKeyword.objectLevelLock;

public class Test 
{
	public static void main(String[] args) 
	{
		Hello h = new Hello();
		A t1= new A(h, "Java");
		A t2 = new A(h, "Class");
		t1.start();
		t2.start();
	}
}
