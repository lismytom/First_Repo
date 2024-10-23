package assignments;

public class Inheritance_Class2 extends Inheritance_ParentClass1 
{
	double hra;
	double pf;
	public void calc()
	{
		 hra = 0.05*basic;
		 System.out.println("HRA: "+hra);
		 pf= 0.20* basic;
		 System.out.println("PF: "+pf);
	}
}
