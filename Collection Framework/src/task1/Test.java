package task1;

import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		List Cricket = new ArrayList();
		Cricket.add("For playing cricket we need: ");
		Cricket.add("Ball");
		Cricket.add("Bat");
		Cricket.add("Stumps");
		
		List Football = new ArrayList();
		Football.add("For playing football we need: " );
		Football.add("Soccer Ball");
		Football.add("Net");
		
		List Badminton = new ArrayList();
		Badminton.add("For playing badminton we need: ");
		Badminton.add("Shuttle");
		Badminton.add("Rackets");
		
		List Sports = new ArrayList();
		Sports.add(Cricket);
		Sports.add(Football);
		Sports.add(Badminton);
		
		//Iterating with given index
		System.out.println("Iteration using index");
		List s = (List)Sports.get(1);
		System.out.println("Cities at index 1 are: " +s);
				
		System.out.println("\n");
				
		// Sequential iteration
		System.out.println("Sequential iteration");
		Iterator itr = Sports.iterator();
		while(itr.hasNext())
		{
			List l = (List)itr.next();
			Iterator itr1 = l.iterator();
			while(itr1.hasNext())
			{
				String item = (String)itr1.next();
				System.out.println("Items: " +item);
			}
		}
	}
}
