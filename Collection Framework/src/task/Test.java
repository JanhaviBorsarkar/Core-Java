package task;

import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of num list");
		int m = sc.nextInt();
		List num = new ArrayList(m);
		
		System.out.println("Enter size of string list");
		int n = sc.nextInt();
		List items = new ArrayList(n);
	
		for(int i = 0; i < m; i++)
		{
			System.out.println("Enter a number: ");
			int x = sc.nextInt();
			num.add(x);
		}
		
		//iterate through num list
		Iterator itr = num.iterator();
		while(itr.hasNext())
		{
			int p = (int)itr.next();
			//System.out.println("Number is: " +p);
		}
		
		System.out.println("\n");
		System.out.println("The final list of numbers is: " +num);
		
		for(int j = 0; j < n; j++)
		{
			System.out.println("Enter cityname: ");
			String y = sc.next();
			items.add(y);
		}
		
		// iterate through string list
		Iterator itr1 = items.iterator();
		while(itr1.hasNext())
		{
			String q = (String)itr1.next();
			//System.out.println("Item is: " +q);
		}
		
		System.out.println("\n");
		System.out.println("Final list of cities is: " +items);
	}
}
