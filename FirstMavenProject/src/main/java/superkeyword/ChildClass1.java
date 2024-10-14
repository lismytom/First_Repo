package superkeyword;

public class ChildClass1 extends ParentClass1
{
 String a ="Welcome";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass1 obj=new ChildClass1();
		obj.display();
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
}
