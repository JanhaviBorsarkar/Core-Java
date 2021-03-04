package intro_to_generic;

import java.util.*;

public class EnhancedForLoop 
{
	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<>();
		l.add("aaa");
		l.add("bbb");
		l.add("ccc");
		
		for(String s : l)
		{
			System.out.println(s);
		}
	}
}
