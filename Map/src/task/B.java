package task;

import java.util.*;

public class B 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "abc");
		m.put(2, "pqr");
		m.put(3, "xyz");
		
		Set<Integer> keys = m.keySet();
		System.out.println(keys);
		
		// Iteration using iterator
		System.out.println("Iteration using iterator");
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext())
		{
			Integer key = itr.next();
			System.out.println(key);
			String val = m.get(key);
			System.out.println(val);
		}
		
		// Iteration using enhanced for loop
		System.out.println("Iteration using enhanced for loop");
		for (Integer key : keys)
		{
			System.out.println(key);
			String val = m.get(key);
			System.out.println(val);
		}
	}
}
