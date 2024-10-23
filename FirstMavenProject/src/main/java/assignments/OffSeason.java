package assignments;
public class OffSeason extends OnSeason
{
	public void discount(double mrp)
	{
		super.discount(200.00);
		double offseason_disc=15/mrp*100;
		System.out.println("Discount during off Season is: "+offseason_disc);
	}
	public static void main(String args[])
	{
		OffSeason obj=new OffSeason();
		obj.discount(100.00);
	}
}
