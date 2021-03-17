package task;

import java.util.*;

public class CountriesInWorld 
{
	public static void main(String[] args) 
	{	
		List<String> texas = new ArrayList<>();
		texas.add("Austin");
		texas.add("Texas City");
		
		List<String> alaska = new ArrayList<>();
		alaska.add("Nome");
		alaska.add("Skagway");
		
		List<List<String>> usa = new ArrayList<>();
		usa.add(texas);
		usa.add(alaska);
		
		List<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> te = new ArrayList<>();
		te.add("Hyderabad");
		te.add("Nizamabad");
		
		List<List<String>> india = new ArrayList<>();
		india.add(mh);
		india.add(te);
		
		List<List<List<String>>> world = new ArrayList();
		world.add(usa);
		world.add(india);
		
		for(List<List<String>> country : world)
		{
			for(List<String> state : country)
			{
				for(String city : state)
				{
					System.out.println("City: " +city);
				}
			}
		}
		
	}
}
