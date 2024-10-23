package assignments;

public class Encapsulation_User {

	public static void main(String[] args) 
	{
		Encapsulation_Bank obj=new Encapsulation_Bank();
		obj.set_pin(1234);	
		obj.get_pin();
		obj.validate_pin();
	}

}
