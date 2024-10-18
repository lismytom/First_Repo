package exception_Example;

public class CustomException1 
{
	public static void main(String[] args) throws VotingException 
	{
		int age=4;
		if(age>=18)
		{
			System.out.println("The Candidate is eligible for voting");
		}
		else
		{
		throw new VotingException("Age under 18");
		}
	}
}
