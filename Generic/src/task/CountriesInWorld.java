package task;

import java.util.*;

public class CountriesInWorld 
{
	public static void main(String[] args) 
	{	
		List<String> usa = new ArrayList<>();
		usa.add("Texas");
		usa.add("Alaska");
		usa.add("Ohio");
		
		List<String> india = new ArrayList<>();
		india.add("Maharashtra");
		india.add("Telangana");
		india.add("Gujrat");
		
		List<List<String>> world = new ArrayList();
		world.add(usa);
		world.add(india);
		
		for(List<String> list : world)
		{
			for(String state : list)
			{
				System.out.println(state);
			}
		}
		
	}
}
