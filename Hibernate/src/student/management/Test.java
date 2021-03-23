package student.management;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		MethodsToCall m = new MethodsToCall();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(true)
		{
			System.out.println("Please select one of the following operations to move forward");
			System.out.println("\n");
			System.out.println("1. Add Student Details");
			System.out.println("2. View Student Details");
			System.out.println("3. Update Student Details");
			System.out.println("4. Delete Student Details");
			System.out.println("5. Exit");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: 
					m.addStudent();
					break;
		
				case 2:
					m.viewStudent();
					break;
					
				case 3:
					m.updateDetails();
					break;
					
				case 4:
					m.deleteDetails();
					break;
					
				case 5:
					System.out.println("Thank you!!");
					System.exit(0);
					
				default:
					System.out.println("Invalid Selection");
		}
	}
	}
}
