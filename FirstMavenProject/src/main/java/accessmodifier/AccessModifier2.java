package accessmodifier;

public class AccessModifier2 {

	public static void main(String[] args) {
		AccessModifier1 obj=new AccessModifier1(); // creating an object to the class Accessmodifier1 in the main method of another class AccessModifier2 (Both classes are in same package)
		obj.display1();
		obj.display3();
		obj.display4();
		// TODO Auto-generated method stub

	}

}

//public, protected and default access specifiers are accessible outside the class in same package