package collection;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) 
	{
		ArrayList <String> s= new ArrayList<String>();
		s.add("Red");
		s.add("Blue");
		s.add("Rose");
		s.add("Green");
		System.out.println(s);
		ArrayList <String> s2= new ArrayList<String>();
		s2.add("Apple");
		s2.add("Orange");
		s2.add("Mango");
		System.out.println(s2);
		s.addAll(s2);
		System.out.println(s);
		System.out.println(s.contains("Rose"));
		System.out.println(s.contains("Black"));
		System.out.println(s.get(1));
		System.out.println(s.isEmpty());
		s.remove(2);
		System.out.println(s);
		System.out.println(s.size());
	}
	

}
