package task;

import java.util.*;

public class A 
{
	public static void main(String[] args) 
	{
		Map<String, String> m = new HashMap<>();
		m.put("aa", "abc");
		m.put("bb", "pqr");
		m.put("cc", "xyz");
		
		Set<String> keys = m.keySet();
		System.out.println(keys);
		
		// Iteration using iterator
		System.out.println("Iteration using iterator");
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(key);
			String val = m.get(key);
			System.out.println(val);
		}
		
		// Iteration using enhanced for loop
		System.out.println("Iteration using enhanced for loop");
		for (String key : keys)
		{
			System.out.println(key);
			String val = m.get(key);
			System.out.println(val);
		}
	}
}
