// E3; G. Stepler; CIS 340 T/Th 1:30pm

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initializing variables
		Scanner scnr = new Scanner(System.in);
		int asteriskCount = 0;
		int counter = 0;
		
		// getting user input 
		System.out.print("I can build you a line of asterisks. \n\nHow many asterisks do you want? ");
		asteriskCount = Integer.parseInt(scnr.nextLine());
		
		
		// while loop!
		System.out.println("\nPrinting a line of asterisks using a while loop");
		while (counter < asteriskCount)
		{
			System.out.print("*");
			counter++;
		} // end of while loop
		
		// creating a new line character
		System.out.println();
		
		
		//for loop
		System.out.println("\nPrinting a line of asterisks using a for loop");
		for (int i = 0; i < asteriskCount; i++)
		{
			System.out.print("*");
		} // end of for loop
		
		// creating a new line character
		System.out.println();
		
		
		// Number list!
		System.out.printf("\nList of numbers from 1 to %d\n", asteriskCount);
		for (int i = 1; i <= asteriskCount; i++)
		{
			System.out.printf("%d ", i);
		}
		
		
		// for loop for multiples of 5 up to 50
		System.out.println("\n\nList of multiples from of 5 from 1 to 50");
		for (int i = 1; i* 5 <= 50; i++)
		{
			System.out.printf("%d ", i * 5);
		}
		
		
		// multiplication table for 2
		System.out.println("\n\nMultiplication Table for 2");
		for (int i = 1; i <= 12; i++)
		{
			System.out.printf("2 * %2d = %3d\n", i, i * 2);
		}
		
		scnr.close();

	}

}
