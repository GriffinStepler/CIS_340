// A3; G. Stepler; CIS 340 T/Th 1:30pm

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		// Part 1 - for loop
		System.out.println("Part 1 - Odd Numbers");
		
		// for loop, counter starts at 1, increments by 2 each loop
		for (int i = 1; i < 20; i = i + 2)
		{
			System.out.print(i + " ");
		}
		
		
		// Part 2 - while loop
		System.out.println("\n\nPart 2 - Even Numbers");
		
		// while loop, loops 20 times
		int j = 1;
		
		while (j < 21)
		{
			// checks if value of j is even, if it is, prints value of j
			if (j % 2 == 0)
				System.out.print(j + " ");
			j++;
		}
		
		
		// Part 3 - Factorial calculator
		String input = "";
		int factorial = 1;
		
		System.out.println("\n\nPart 3 - Factorial");
		System.out.print("Enter a number for the factorial: ");
		input = scnr.nextLine();
		
		// this does not work past 12 --> would need to import java.math and convert to BigInteger
		for (int fCounter = Integer.parseInt(input); fCounter > 1; fCounter--)
		{
			// self referencing value; similar to accumulated score formula
			factorial = factorial * fCounter;
		}
		
		System.out.printf("The factorial is %d", factorial);
		
		
		// Part 4 - Inverted Triangle
		System.out.println("\n\nPart 4 - Triangle");
		
		// outer loop, loops 10 times
		for (int k = 0; k < 10; k++)
		{
			// inner loop, loops 10 - k times, printing an asterisk each loop
			for (int m = 10; m > k; m--)
			{	
				System.out.print("*");
			}
			// prints new line and then loops
			System.out.println();
		}
		
		
		// Enter to continue...
		String contCode = "";
		Boolean loopBool = true;
		
		// do loop asks user to hit enter to continue, checks to see if user input an empty character, if not it loops
		System.out.println("\n");
		do 
		{
			System.out.print("Press Enter to Continue...");
			if (scnr.nextLine().equals(contCode))
				break;
		} while (loopBool);
		
		
		// Part 5 - score averaging
		int sCounter = 1; // "student x" counter
		int qCounter = 1; // "score x" counter (stands for quiz)
		int tCounter = 0; // total scores entered counter
		int sTotal = 0; // score total 
		int sInput = 0; // score input value
		double sAverage = 0.0; // score average
		
		System.out.println("\nPart 5 - Average Calculator");
		System.out.println("\nThis program will ask you to enter 2 scores each for 3 students\n");
		
		// outer loop, loops 3 times
		for (int g = 0; g < 3; g++)
		{
			// inner loop, loops 2 times
			for (int h = 0; h < 2; h++)
			{
				// gets user input, accumulates total
				System.out.printf("Student %d, score %d: ", sCounter, qCounter);
				sInput = Integer.parseInt(scnr.nextLine());
				sTotal = sTotal + sInput;
				// increments the "score x" counter and the total scores counter
				qCounter++;
				tCounter++;
			}
			// sets the "score x" value back to 1
			qCounter = 1;
			// increments the "student x" value by 1
			sCounter++;
		}
		
		// calculate average and print to console
		sAverage = (double) sTotal / tCounter;
		System.out.printf("\nThe average of all scores is %.2f", sAverage);
		
		
		// Enter to continue... again
		System.out.println("\n");
		do 
		{
			System.out.print("Press Enter to Continue...");
			if (scnr.nextLine().equals(contCode))
				break;
		} while (loopBool);
		
		
		// Part 6 - Multiplication tables
		int product = 0;
		
		System.out.println("\nPart 6 - Multiplication Tables");
		
		for (int r = 5; r < 11; r++)
		{
			for (int q = 10; q < 51; q = q + 10)
			{
				product = r * q;
				System.out.printf("\n%2d * %2d = %2d", r, q, product);
			}
			System.out.println();
		}
		
		
		// Enter to exit
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
