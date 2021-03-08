package intro;

import java.util.*;

public class MapWithList 
{
	public static void main(String[] args) 
	{
		List<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> jh = new ArrayList<>();
		jh.add("Ranchi");
		jh.add("Dhanbad");
		
		Map<String, List<String>> india = new HashMap<>();
		india.put("Maharashtra", mh);
		india.put("Jharkhand", jh);
		
		Set<String> keys = india.keySet();
		
		for(String key : keys)
		{
			System.out.println(key);
			List<String> list = india.get(key);
			for(String city : list)
			{
				System.out.println(city);
			}
		}
	}
}
