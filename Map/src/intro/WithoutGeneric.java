package intro;

import java.util.*;

public class WithoutGeneric 
{
	public static void main(String[] args) 
	{
		Map m = new HashMap();
		m.put(5, "abc");
		m.put(6, "pqr");
		m.put(7, "mno");
		
		String nm = (String)m.get(6);
		System.out.println(nm);
	}
}
