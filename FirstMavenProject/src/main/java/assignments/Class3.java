package assignments;

public class Class3 extends Inheritance_Class2{
   double total;
	public static void main(String[] args) 
	{
		Class3 obj=new Class3();
		obj.basesalary();
	    obj.calc();
		obj.total();
		obj.display();
	}
	public void total()
	{
		total=basic+hra-pf-ded+bonus;
		System.out.println("Total Salary: "+total);
	}
	public void display()
	{
		System.out.println("***Salary Slip***");
		System.out.println("Base Salary is:"+basic);
		System.out.println("HRA: "+hra);
		System.out.println("PF: "+pf);
		System.out.println("Bonus: "+bonus);
		System.out.println("Deductions: "+ded);
		System.out.println("Salary in Hand: "+total);
	}
}
