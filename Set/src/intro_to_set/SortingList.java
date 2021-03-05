package intro_to_set;

import java.util.*;

public class SortingList 
{
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(30);
		l.add(20);
		l.add(7);
		l.add(3);
		l.add(5);
		System.out.println("The given list: " +l);
		
		System.out.println("\n");
		
		System.out.println("Sorting without duplicates: ");
		Set<Integer> s = new TreeSet<Integer>(l);
		System.out.println(s);
		
		System.out.println("\n");
		
		System.out.println("Sorting with duplicates: ");
		Collections.sort(l);
		System.out.println(l);
	}
}
