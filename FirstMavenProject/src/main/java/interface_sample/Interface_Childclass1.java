package interface_sample;

public class Interface_Childclass1 implements Interface1
{

	public static void main(String[] args) 
	{
		Interface_Childclass1 obj=new Interface_Childclass1();
		obj.display();


	}

	@Override
	public void display() 
	{
	System.out.println("Hello");
	}

}
