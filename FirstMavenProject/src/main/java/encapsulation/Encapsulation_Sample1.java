package encapsulation;

public class Encapsulation_Sample1 
{
	private String name;
	private int age;
	
	public void setdetail(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void getdetail()
	{
	System.out.println(name);	
	System.out.println(age);
	}

}
