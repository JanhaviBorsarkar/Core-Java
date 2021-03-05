package intro_to_set;

import java.util.*;

public class RemoveDuplicateFromList 
{
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(30);
		l.add(20);
		l.add(23);
		System.out.println("List contains: " +l);
		
		System.out.println("Removing duplicates using set: ");
		Set<Integer> s = new HashSet<Integer>(l);
		System.out.println(s);
		System.out.println("Here, the order of insertion is not maintained");
		
		System.out.println("\n");

		System.out.println("Removing duplicates but maintaining the order of insertion: ");
		Set<Integer> s1 = new LinkedHashSet(l);
		System.out.println(s1);
	}
}
