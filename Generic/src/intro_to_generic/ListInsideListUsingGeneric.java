package intro_to_generic;

import java.util.*;

public class ListInsideListUsingGeneric 
{
	public static void main(String[] args) 
	{
		List<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> jh = new ArrayList<>();
		jh.add("Ranchi");
		jh.add("Lahordaga");
		
		List<List<String>> india = new ArrayList<>();
		india.add(mh);
		india.add(jh);
		
		for(List<String> list : india)
		{
			for(String city : list)
			{
				System.out.println(city);
			}
		}
	}
}
