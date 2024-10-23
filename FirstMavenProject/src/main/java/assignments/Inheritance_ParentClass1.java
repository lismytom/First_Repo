package assignments;
import java.util.Scanner;
public class Inheritance_ParentClass1 
{
	float basic;
	float ded;
	float bonus;
	public void basesalary()
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Basic Salary of the Employee:");
    basic = scanner.nextFloat();
    System.out.println("Enter Bonus:");
    bonus = scanner.nextFloat();
    System.out.println("Enter Deduction:");
    ded = scanner.nextFloat();
	}
 }
