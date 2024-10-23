package assignments;

public class Abstract_Contractor extends Abstract_Employee
{
	public void calculate_salary()
	{
		double payment = 1000.00;
		System.out.println("Payment per hour: "+payment);
		System.out.println("Number of working hours: 8");
		double total_pay=payment*8;
		System.out.println("Total Payment per day: "+total_pay);
		
	}
	
	
	public static void main(String[] args) 
	{
		Abstract_Contractor obj=new Abstract_Contractor();
		obj.display();
		obj.calculate_salary();
		
	}

}
