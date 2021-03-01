package arrayListClass;

import java.util.*;

public class B 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		
		Iterator itr = l.iterator();
		
		int x = (int)itr.next();
		System.out.println(x);
		
		int y = (int)itr.next();
		System.out.println(y);
		
		int z = (int)itr.next();
		System.out.println(z);
		
		int p = (int)itr.next();
		System.out.println(p);
	
		/*int q = (int)itr.next();
		System.out.println(q);*/
	}
}
