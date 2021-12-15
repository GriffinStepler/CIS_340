
public class ReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if calling methods from the SAME class
		// invoke methods by specifying their "simple" name
		// methodName();
		printHello();
		
		addNumbers(2, 6);
		
		isPositive(20);
		
		// if calling methods from another class
		// invoke methods using their fully qualified name
		// ClassName.methodName();
		Integer.parseInt("100");
	} // main
	
	
	public static void printHello()
	{
		System.out.println("Hello World!");
	}
	
	
	public static int addNumbers(int param1, int param2)
	{
		int sum = param1 + param2;
		return(sum);
	}
	
	public static Boolean isPositive(int param1)
	{
		if (param1 > 0)
			return true;
		else
			return false;
	}

} // class
