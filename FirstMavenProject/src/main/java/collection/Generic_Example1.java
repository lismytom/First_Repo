package collection;

import java.util.ArrayList;
import java.util.List;

public class Generic_Example1 
{
	public static void main(String[] args) 
	{
	 List <String> s = new ArrayList<String>();
	 s.add("Blue");// add method in List
	 s.add("Green");
	 s.add("Blue");
	 s.add("Rose");
	 System.out.println(s);	
	 s.set(1, "Black");// set method in List - to replace existing value based on the list position
	 System.out.println(s);	
	 System.out.println(s.indexOf("Blue"));
	 System.out.println(s.lastIndexOf("Blue"));
	 s.remove(2);// remove() method in list - To remove object from the list
	 s.remove("Rose");
	 System.out.println(s);
	 System.out.println(s.get(1));// get()-To get the object based on index position
	 System.out.println(s.contains("Black"));//contains()-To check whether the value exist in the list
	 System.out.println(s.contains("Red"));
	}
}
