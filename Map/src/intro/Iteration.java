package intro;

import java.util.*;

public class Iteration 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> m = new HashMap<>();
		m.put(5, "abc");
		m.put(6, "pqr");
		m.put(7, "mno");
		
		Set<Integer> keys = m.keySet();
		System.out.println(keys);
		
		// Iteration using iterator
		System.out.println("Iteration using iterator");
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext())
		{
			int key = itr.next();
			System.out.println(key);
			String val = m.get(key);
			System.out.println(val);
		}
		
		// Iteration using enhanced for loop
		System.out.println("Iteration using enhanced for loop");
		for (int key : keys)
		{
			System.out.println(key);
			String val = m.get(key);
			System.out.println(val);
		}
	}
}
