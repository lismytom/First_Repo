package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGeneric_Example1 
{

	public static void main(String[] args) 
	{
		List s=new ArrayList();
		s.add("Lismy");
		s.add('A');
		s.add(10);
		s.add(15.5);
		System.out.println(s);
	}

}
