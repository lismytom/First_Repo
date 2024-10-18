package collection;
import java.util.LinkedList;

public class LinkedList1 
{
	public static void main(String[] args) 
	{
		{
			LinkedList <String> s= new LinkedList <String>();
			s.add("Lion");
			s.add("Tiger");
			s.add("Elephant");
			s.add("Deer");
			System.out.println(s);
			LinkedList <String> s2= new LinkedList <String>();
			s2.add("Parrot");
			s2.add("Crow");
			s2.add("Owl");
			s2.add("Duck");
			System.out.println(s2);
			s.addAll(s2);
			System.out.println(s);
			System.out.println(s.contains("Cow"));
			System.out.println(s.contains("Deer"));
			System.out.println(s.get(1));
			System.out.println(s.isEmpty());
			s.remove(2);
			System.out.println(s);
			System.out.println(s.size());
		}
	}
}