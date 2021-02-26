package task1;

public class TestImplements 
{
	public static void main(String args[])
	{
		I i = new AImplements();
		i.m1();
		i.m2();
	
		I b = new BImplements();
		b.m1();
		b.m2();
	}
}
