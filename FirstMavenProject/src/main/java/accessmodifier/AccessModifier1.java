package accessmodifier;
public class AccessModifier1 
{
    public void display1()
	{
		System.out.println("This is a public method");
	}
	private void display2()
	{
		System.out.println("This is a private method");
	}
	protected void display3()
	{
		System.out.println("This is a protected method");
	}
	void display4()
	{
		System.out.println("This is a default method");
	}
	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
		AccessModifier1 obj=new AccessModifier1 ();// create an object to the class AccessModifier1 
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}
}

// public, private, protected and default access specifiers have visibility in same package and same class