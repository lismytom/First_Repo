package accessmodifier2;

import accessmodifier.AccessModifier1;

public class AccessModifier3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier1 obj=new AccessModifier1();// creating an object to class AccessModifier1 in the class AccessModifier3 (Both classes are in different packages)
		obj.display1();
		}
}

//only public access modifier is accessible outside the class
