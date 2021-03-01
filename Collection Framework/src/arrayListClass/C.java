package arrayListClass;

import java.util.*;

public class C 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext())
		{
			int x = (int)itr.next();
			System.out.println(x);
		}
	}
}
