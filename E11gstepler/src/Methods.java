// E11 Griffin Stepler, CIS 340 1:30pm T TH

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int input = 0;
		
		// invoking and outputting product() (2 integers)
		System.out.println("*** Testing Product method with 2 arguments: 5 and 2 ***");
		System.out.printf("The product is %d\n", product(5, 2));
		
		// invoking and outputting product() (3 integers)
		System.out.println("\n*** Testing the Product method with 3 arguments: 2, 3, and 5 ***");
		System.out.printf("The product is %d\n", product(2, 3, 5));
		
		// invoking and outputting product() (3 integers)
		System.out.println("\n*** Testing the Product method with 3 arguments: 10, 20, and 30 ***");
		System.out.printf("The product is %d\n", product(10, 20, 30));
		
		// invoking and outputting calculateAverage()
		System.out.println("\n*** Testing Average method with integer argument ***");
		System.out.println("This method will calculate the average of all numbers from 1 to n");
		System.out.print("Enter n: ");
		input = Integer.parseInt(scnr.nextLine());
		System.out.printf("The average from 1 to %d is %.2f", input, calculateAverage(input));
		
		scnr.close();
		
	} // main

	
	// returns the product of two integers
	private static int product(int param1, int param2)
	{
		int result = 0;
		
		result = param1 * param2;
		
		return result;
		
	} // product, 2 integers
	
	
	// returns the product of 3 integers
	private static int product(int param1, int param2, int param3)
	{
		int result = 0;
		
		result = param1 * param2 * param3;
		
		return result;
		
	} // product, 3 integers
	
	
	// calculates the average of numbers 1 to n, which n is the argument
	private static double calculateAverage(int param1)
	{
		int counter = 0;
		int avgTotal = 0;
		double result = 0;
		
		for (int i = 1; i <= param1; i++)
		{
			avgTotal = avgTotal + i;
			counter++;
		}
		
		result = (double) avgTotal / counter;
		
		return result;
		
	} // calculateAverage
	
} // class
