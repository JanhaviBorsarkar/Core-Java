package intro_to_generic;

import java.util.*;

public class WithoutGeneric 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add(9);
		l.add(12);
		l.add(22);
		l.add("ABC");
		l.add(32);
		
		/* int x = (int)l.get(3);
		String s = (String)l.get(0); */
		// runtime class cast exception
	}
}
