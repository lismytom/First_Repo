package superkeyword;
public class ChildConstructor extends ParentConstructor
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChildConstructor obj=new ChildConstructor();
	}
   public ChildConstructor()
    {
	    super(25);
		System.out.println("Parent Constructor");
	}

}

