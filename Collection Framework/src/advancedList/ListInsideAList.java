package advancedList;

import java.util.*;

public class ListInsideAList 
{
	public static void main(String[] args) 
	{
		List mh = new ArrayList();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Aurangabad");
		
		List jh = new ArrayList();
		jh.add("Ranchi");
		jh.add("Dhanbad");
		
		List india = new ArrayList();
		india.add(mh);
		india.add(jh);
		
		//Iterating with given index
		System.out.println("Iteration using index");
		List i = (List)india.get(1);
		System.out.println("Cities at index 1 are: " +i);
		
		System.out.println("\n");
		
		// Sequential iteration
		System.out.println("Sequential iteration");
		Iterator itr = india.iterator();
		while(itr.hasNext())
		{
			List l = (List)itr.next();
			Iterator itr1 = l.iterator();
			while(itr1.hasNext())
			{
				String city = (String)itr1.next();
				System.out.println("Cities: " +city);
			}
		}
	}
}
