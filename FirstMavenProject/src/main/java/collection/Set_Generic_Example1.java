package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Generic_Example1 
{
	public static void main(String[] args) 
	{
		 Set<String> s1 = new HashSet<>();
		 s1.add("Mango");
		 s1.add("Grapes");
		 s1.add("Orange");
		 s1.add("Apple");
		 System.out.println(s1);
		 Set<String> s2 = new HashSet<>();
		 s2.add("Yellow");
		 s2.add("Wine");
		 s2.add("Orange");
		 s2.add("Red");
		 System.out.println(s2);
		 //s1.addAll(s2);// Union of 2 sets
		 //System.out.println(s1);
		 
		 //s1.retainAll(s2);
		 //System.out.println(s1);//Intersection of 2 sets
		 
		 //s1.removeAll(s2);
		 //System.out.println(s1);// Removing from S1 the same value occur in both sets
		 //s1.remove("Mango");
		 
		 //System.out.println(s1);
		 //s1.iterator();// To get the elements of the set in sequential order
		 //System.out.println(s1);
		 
		 //System.out.println(s1.size());// To get the size of the set
		 
		 System.out.println(s1.contains("Orange"));// To check whether the value available in the list
		 
		 System.out.println(s1.contains(s2));// To check all values in S2 are available in S1
		 
		 System.out.println(s1.hashCode());//The method returns an integer value which is the hashCode value for this instance of the Set.
		 
		 Object arr[] = s1.toArray();
		 for (int i = 0; i < arr.length; i++)
	     System.out.println(arr[i]);
	}
}