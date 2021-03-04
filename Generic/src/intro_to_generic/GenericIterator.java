package intro_to_generic;

import java.util.*;

public class GenericIterator 
{
	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<>();
		l.add("aaa");
		l.add("bbb");
		l.add("ccc");
		
		Iterator<String> itr = l.iterator();
		while(itr.hasNext())
		{
			String val = itr.next();
			System.out.println(val);
		}
	}
}
