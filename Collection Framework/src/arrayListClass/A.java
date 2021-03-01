package arrayListClass;

import java.util.*;

public class A 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add("abc");
		l.add("xyz");
		l.add(10);
		
		System.out.println(l);
		
		int i = (int)l.get(0);
		String s = (String)l.get(3);
		System.out.println("value at index 0 is " +i);
		System.out.println("Value at index 3 is " +s);
	}
}
