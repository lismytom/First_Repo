package aggregation;

public class Aggregation_Class2 
{
    String hobby;
    int roll_no;
    Aggregation_Class1 ref;   //aggregation-> creating reference of class1 in class2
	
	public Aggregation_Class2(String hobby,int roll_no,Aggregation_Class1 ref)
	{
		this.hobby=hobby;
		this.roll_no=roll_no;
		this.ref=ref;
	}
    public void display()
    {
    	System.out.println(ref.name+" "+ref.age);
    	System.out.println(hobby+" "+roll_no);
    }
    public static void main(String[] args) 
	{
		Aggregation_Class1 obj=new Aggregation_Class1("Kavya",15);
		Aggregation_Class2 obj1=new Aggregation_Class2("Reading",12,obj);
        obj1.display();
	}
}

