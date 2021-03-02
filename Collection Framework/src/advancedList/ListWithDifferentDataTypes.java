package advancedList;

import java.util.*;

public class ListWithDifferentDataTypes 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add(5);
		l.add(30);
		l.add("abc");
		l.add(30);
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			if(o instanceof Integer)
			{
				int x = (int)o;
				System.out.println(x);
			}
			else if(o instanceof String)
			{
				String s = (String)o;
				System.out.println(s);
			}
		}
	}
}
