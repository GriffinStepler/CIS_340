// E8, Griffin Stepler, CIS 340, TTH 1:30pm

import java.util.ArrayList;

public class Methods {
	
	// declare ArrayList listOfNumbers, initialized in addTestData() method
	static ArrayList<Integer> listOfNumbers;

	public static void main(String[] args)
	{
		int prodResult; // assigned to output of product()
		
		printGreetings();
		
		// invoking product() method
		System.out.println("\n*** Testing Product and return values ***");
		prodResult = product(5, 2); 
		System.out.println("The product of 5 and 2 is " + prodResult); // print return value of product()
		
		
		// invoking concatenate() method
		System.out.println("\n*** Testing Concatenate and nested method calls ***");
		System.out.printf("The return value is \"%s\"", concatenate("Hello", "World"));
		
		
		// invoking listContains() using value of 4
		Boolean numberFound = false;
		addTestData(); // calling addTestData() to populate listOfNumbers
		System.out.println("\n\n*** Testing ArrayList search ***");
		System.out.println("Testing if the number 4 is in the ArrayList...");
		numberFound = listContains(4); // calling listContains() with 4 as argument
		
		if (numberFound) // if numberFound is true, prints confirmation message
			System.out.println("The number 4 was found in the list!");
		else // if numberFound is false, prints failure message
			System.out.print("The number 4 was not found in the list!");
		
		
		// invoking listContains() with value of 56
		numberFound = false; // reset boolean
		System.out.println("\n\nTesting if the number 56 is in the ArrayList...");
		numberFound = listContains(56);
		
		if (numberFound)
			System.out.println("The number 56 was found in the list!");
		else
			System.out.println("The number 56 was not found in the list");
		
		
		// invoking divide() method
		double quotient = divide(7, 6);
		System.out.println("\n***Testing Divide and return values ***");
		System.out.printf("The result of dividing 7 by 6 is %.4f ", quotient);
		
	} // main
	
	
	// Method: prints "Hello"
	private static void printGreetings()
	{
		System.out.println("Hello");
	} // printGreetings
	
	
	// Method: multiplies inputs
	private static int product(int param1, int param2)
	{
		return(param1 * param2);
	} // product 
	
	
	// Method: concatenates inputs
	private static String concatenate(String param1, String param2)
	{
		return(param1 + param2);
	} // concatenate
	
	
	// Method: divides inputs
	private static double divide(int param1, int param2) 
	{
		double quotient;
		quotient = (double) param1 / param2;
		return(quotient);
	} // divide
	
	
	// Method: adds data to listOfNumbers
	private static void addTestData()
	{
		listOfNumbers = new ArrayList<>();
		listOfNumbers.add(23);
		listOfNumbers.add(34);
		listOfNumbers.add(45);
		listOfNumbers.add(56);
	} // addTestData
	
	
	// Method: checks listOfNumbers to see if it contains input
	private static boolean listContains(int param1)
	{
		Boolean found  = false;
		int currentPosition = 0; // used to get index of current element in ArrayList
		
		for(int i : listOfNumbers)
		{
			if (param1 == listOfNumbers.get(currentPosition))
			{
				found = true;
				break;
			}
			
			currentPosition++;
		}
		
		return(found);
	} // listContains

} // class
