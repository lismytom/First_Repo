package superkeyword;

public class ChildClass2 extends ParentClass2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass2 obj=new ChildClass2();
		obj.display2();

	}
public void display2()
{
	super.display1();
	System.out.println("Child CLass2");
	
}
}
