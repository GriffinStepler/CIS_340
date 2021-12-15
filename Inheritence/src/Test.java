
public class Test {

	public static void main(String[] args)
	{
		SubClass childObject = new SubClass();
		SuperClass parentObject = new SuperClass();
		
		
		// a simple case
		if (childObject instanceof SubClass)
			System.out.println("childObject is an instance of SubClass.");
		else
			System.out.println("childObject is not an instance of SubClass.");
		
		
		// instanceof returns true for SuperClass also
		if (childObject instanceof SuperClass)
			System.out.println("childObject is an instance of SuperClass.");
		else 
			System.out.println("childObject is not an instance of SuperClass.");
		
		
		// instanceof returns true for all ancestors
		// Notes: Object is an ancestor of all classes in Java
		if (childObject instanceof Object)
			System.out.println("childObject is an instance of Object.");
		else
			System.out.println("childObject is not an instance of Object.");
		
		
		// a parent object is not an instance of a child class
		if (parentObject instanceof SubClass)
			System.out.println("parentObject is an instance of SubClass.");
		else
			System.out.println("parentObject is not an instance of SubClass.");
	}

}
