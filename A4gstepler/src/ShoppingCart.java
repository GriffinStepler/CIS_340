// A4; G. Stepler; CIS 340 T/Th 1:30pm

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		String[] names = new String[5];		// array for input names
		String[] cats = new String[5];		// array for input categories/descriptions
		double[] prices = new double[5];	// array for input prices
		double pTotal = 0.0; 				// sum of prices per category - used in calculating averages
		int pCounter = 0;					// counts products per category - used in calculating averages
		double avg = 0.0;					// average for each product category
		
		System.out.println("\t\t\tShopping Cart");
		System.out.print("\n\nThis program maintains a list of products (name, category, price). ");
		System.out.println("It will calculate average dollars spent per category for you.");
		System.out.println();
		
		// loops to get user input to parallel arrays (names, cats, prices)
		for (int i = 0; i < names.length; i++)
		{
			System.out.print("Enter product name: ");
			names[i] = scnr.nextLine();
			
			System.out.print("Enter product category (Tech/Grocery/Office): ");
			cats[i] = scnr.nextLine();
			
			System.out.print("Enter product price: $");
			prices[i] = Double.parseDouble(scnr.nextLine());
			
			System.out.println();
		}
		
		
		
		
		// output for category TECH
		System.out.println("\nTECH PRODUCTS");
		
		for (int i = 0; i < names.length; i++) // loops 5 times to read through all data in the array
		{
			if (cats[i].equalsIgnoreCase("TECH"))	// checks to see if item belongs to TECH category
			{
				System.out.println(names[i]); 	// prints product name
				pTotal = pTotal + prices[i];	// aggregates total spent per category
				pCounter++;						// increments to count items per category
			}
		}
		
		if (pCounter == 0)	// prevents output of "NaN" by setting avg to 0 IF no prices are defined
			avg = 0.00;
		else				// if prices are defined, calculates avg as normal
			avg = pTotal / pCounter;
		
		System.out.printf("Average dollars spent: $%.2f", avg);
		System.out.println();
		
		
		
		
		// output for category GROCERY
		System.out.println("\nGROCERY PRODUCTS");
		// reset pTotal, pCounter, and avg
		pTotal = 0.0;
		pCounter = 0;
		avg = 0.0;
		
		for (int i = 0; i < names.length; i++)
		{
			if (cats[i].equalsIgnoreCase("GROCERY"))
			{
				System.out.println(names[i]);
				pTotal = pTotal + prices[i];
				pCounter++;
			}
		}
		
		if (pCounter == 0)
			avg = 0.00;
		else
			avg = pTotal / pCounter;
	
		System.out.printf("Average dollars spent: $%.2f", avg);
		System.out.println();
		
		
		
		
		// output for OFFICE
		System.out.println("\nOFFICE PRODUCTS");
		pTotal = 0.0;
		pCounter = 0;
		avg = 0.0;
		
		for (int i = 0; i < names.length; i++)
		{
			if (cats[i].equalsIgnoreCase("OFFICE"))
			{
				System.out.println(names[i]);
				pTotal = pTotal + prices[i];
				pCounter++;
			}
		}
		
		if (pCounter == 0)
			avg = 0.00;
		else
			avg = pTotal / pCounter;
		
		System.out.printf("Average dollars spent: $%.2f", avg);
		System.out.println();
		
		
		
		
		// output for OTHER
		System.out.println("\nOTHER");
		pTotal = 0.0;
		pCounter = 0;
		avg = 0.0;
		
		for (int i = 0; i < names.length; i++)
		{
			if (!cats[i].equalsIgnoreCase("TECH") && !cats[i].equalsIgnoreCase("GROCERY") 
					&& !cats[i].equalsIgnoreCase("OFFICE"))
			{
				System.out.println(names[i]);
				pTotal = pTotal + prices[i];
				pCounter++;
			}
		}
		
		if (pCounter == 0)
			avg = 0.00;
		else
			avg = pTotal / pCounter;
		
		System.out.printf("Average dollars spent: $%.2f", avg);
		
		
		
		// exit code
		String contCode = "";
		Boolean loopBool = true;
		
		System.out.println();
		do
		{
			System.out.print("\nPress Enter to Quit...");
			if (scnr.nextLine().equals(contCode))
				System.exit(0);
		} while (loopBool);
		
		scnr.close();
	}

}
