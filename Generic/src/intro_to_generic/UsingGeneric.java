package intro_to_generic;

import java.util.*;

public class UsingGeneric 
{
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		//l.add("abc"); // here only integer data is allowed
		l.add(39);
		
		int y = l.get(0);
		int z = l.get(3);
	}
}
