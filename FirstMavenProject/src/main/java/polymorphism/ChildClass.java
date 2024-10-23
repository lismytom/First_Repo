package polymorphism;

public class ChildClass extends ParentClass1{

	public static void main(String[] args) 
	{
		ChildClass obj=new ChildClass();
		obj.display(25, 5);
	}
	
	public void display(int a, int b)
	{
	 super.display(25, 15);
	 int c = a-b;	
	 System.out.println("Difference is"+c);
	}

}
