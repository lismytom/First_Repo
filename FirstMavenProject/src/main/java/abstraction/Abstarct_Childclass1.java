package abstraction;

public class Abstarct_Childclass1 extends Abstract_Sample1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Abstarct_Childclass1 obj = new Abstarct_Childclass1();
		obj.display();
		obj.display1();
	}

	@Override
	public void display1() 
	{
		System.out.println("Welcome");	
		
	}

}
