package throwkeyword;

public class VotingClass 
{
	public void voting(int age) throws AgeInvalidException
	{
		System.out.println("Method voting of class VotingClass starts");
		if(age < 18)
		{
			System.out.println("You are not eligible for voting");
		}
		System.out.println("Method voting of class VotingClass ends");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		VotingClass v = new VotingClass();
		try
		{
			v.voting(7);
		}
		catch(AgeInvalidException e)
		{
			System.out.println("Catch block " +e.getMessage());
		}
		System.out.println("Main ends");
	}
}
