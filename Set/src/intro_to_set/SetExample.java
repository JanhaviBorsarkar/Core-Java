package intro_to_set;

import java.util.*;

public class SetExample 
{
	public static void main(String[] args) 
	{
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(2);
		s.add(3);
		
		System.out.println("Using iterator");
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			int x = itr.next();
			System.out.println(x);
		}
		
		System.out.println("Using enhanced for loop");
		for(int x1 : s)
		{
			System.out.println(x1);
		}
	}
}
