// E4; G. Stepler; CIS 340 T/Th 1:30pm

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		// Part 1: Do Loop
		String response = "";
		int score = 0;
		int total = 0;
		int count = 0;
		boolean loopBool = true;
		double average = 0.0;
		
		// introductory lines, these match the sample output exactly, 
		// including the extra \n between line 23 and 24
		System.out.println("\t\tIn-class: Logic and Looping Exercises");
		System.out.println("\n\nAverage Demo using Do Loop");
		System.out.println("\nCalcualtes an average of all numbers entered. Enter \"x\" when finished entering numbers.");
		
		// do loop
		do
		{
			// getting user input
			System.out.print("Enter a number: ");
			response = scnr.nextLine();
			
			// checking if user input an x; if they did, break from the loop
			if (response.equalsIgnoreCase("x"))
				break;
			
			// parsing score value, accumulating total, incrementing counter 
			score = Integer.parseInt(response);
			total = total + score;
			count++;
			
		} while (loopBool == true); // ensures the loop continues; only break condition is if a user enters an x
		
		// calculating and outputting average score, score is rounded to two decimals to match sample output
		average = (double) total / count;
		System.out.printf("The average of all numbers is %.2f \n", average);
		
		
		// Part 2: While Loop
		response = "";
		score = 0;
		total = 0;
		count = 0;
		average = 0.0;
		
		// introductory lines
		System.out.println("\nAverage Demo using While Loop");
		System.out.println("Calculates an average of all numbers entered. Enter \"x\" when finished entering numbers.");
		
		// while loop
		while (loopBool)
		{
			// getting user input
			System.out.print("Enter a number: ");
			response = scnr.nextLine();
			
			// check if user input an x; if they did, break from the loop
			if (response.equalsIgnoreCase("x"))
				break;
			
			// parse score value, accumulate total, increment count
			score = Integer.parseInt(response);
			total = total + score;
			count++;
		}
		
		// calculate and output the average score, score is rounded to 2 decimals to match sample output
		average = (double) total / count;
		System.out.printf("The average of all numbers is %.2f \n", average);
		
		// tell user to check and see if values are the same (appeared in the sample output)
		System.out.println("Check to see that the average produced while using while and do is identical.");
		System.out.println();
		
		// Part 3: Nested for loops
		for (int i = 0; i < 10; i ++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		scnr.close();
	}

}
