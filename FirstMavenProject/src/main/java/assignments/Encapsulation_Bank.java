package assignments;

public class Encapsulation_Bank 
{
    private long pin;
	public void set_pin(long pin)
	{
		this.pin=pin;
	}
	public void get_pin()
	{
		System.out.println("PIN is: "+pin);	
	}
	public void validate_pin()
	{
		this.pin=pin;
	    if (pin==1234)
		 {
			 System.out.println("Valid PIN");
		 }
		 else if (pin==1212)
		 {
			 System.out.println("Valid PIN");
		 }
		 else if (pin==1001)
		 {
			 System.out.println("Valid PIN");
		 }
		 else 
		 {
			 System.out.println("Invalid PIN");
		 }
	}
}
