package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Sample1 
{

	public static void main(String[] args) 
	{
		ArrayList <String> s1= new ArrayList<String>();
		s1.add("Red");
		s1.add("Blue");
		s1.add("Rose");
		s1.add("Green");
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	    it.remove();
	    System.out.println(s1);
	}
}
