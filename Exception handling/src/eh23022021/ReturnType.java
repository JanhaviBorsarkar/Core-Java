package eh23022021;

public class ReturnType 
{
		public int m1()
		{
			System.out.println("Method m1 starts");
			if(true)
				return 10;
			System.out.println("Method m1");
			return 20;
		}
		public static void main(String args[])
		{
			System.out.println("Main starts");
			ReturnType r = new ReturnType();
			int x = r.m1();
			System.out.println(x);//10
			System.out.println("Main Ends");
		}
}
