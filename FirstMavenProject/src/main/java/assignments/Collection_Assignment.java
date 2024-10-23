package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Assignment 
{
	public static void main(String[] args) 
	{		ArrayList <String> s= new ArrayList<String>();
			s.add("Red");
			s.add("Blue");
			s.add("Orange");
			s.add("Green");
			s.add("Black");
			s.add("White");
			System.out.println(s);
			/* To  retrieve an element at specified index*/
			System.out.println(s.get(1));
			
			/*Iterate through all elements in te arraylist*/
			Iterator it=s.iterator();	
			
			/* To remove 3rd element*/
			System.out.println(s.remove(2));
			
			/*To search an element in the array*/
			System.out.println(s.contains("Rose"));
			System.out.println(s.contains("Black"));
	}
}
