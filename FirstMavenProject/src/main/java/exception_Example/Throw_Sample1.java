package exception_Example;

public class Throw_Sample1 
{
	public static void main(String[] args) 
	{
		int age=19;
		if(age>=18)
		{
			System.out.println("The Candidate is eligible for voting");
		}
		else
		{
		throw new ArithmeticException("Age under 18");
		}
	}
}
