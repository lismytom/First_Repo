package interface_sample;

public class MultipleInterface_Childclass1 implements MultipleInterface1,MultipleInterface2
{

	public static void main(String[] args) 
	{
		MultipleInterface_Childclass1 obj=new MultipleInterface_Childclass1();
		obj.sum();
		obj.diff();
	}

	@Override
	public void sum() 
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Sum is: "+sum);
	}

	@Override
	public void diff()
	{
		int a=100;
		int b=20;
		int diff=a-b;
		System.out.println("Difference is: "+diff);
		
	}

}
