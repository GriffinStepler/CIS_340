// E10 Griffin Stepler, CIS 340, 1:30pm T TH

import java.util.Random;
import java.util.Scanner;

public class Craps {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int dieValue1 = 0;
		int dieValue2 = 0;
		
		// introduction phrases
		System.out.println("\t\tCraps Die Roll");
		System.out.print("\nPress ENTER to roll a pair of dice...");
		scnr.nextLine(); // waits for user to hit ENTER to continue
		
		do // loops through rolling dice 
		{
			System.out.println();
			
			// rolling dice logic and outputs
			dieValue1 = generateRandomNumber();	// generates a random number and assigns to dieValue1
			System.out.printf("Rolling... You rolled a %s!\n", numberToText(dieValue1));	// converts dieValue1 to letters and outputs result
			
			// loop to slow processing and ensure randomness
			for (int i = 0; i < 50000; i++)
				System.out.print("");
			
			dieValue2 = generateRandomNumber();
			System.out.printf("Rolling... You rolled a %s!\n", numberToText(dieValue2));
			
			// Snake Eyes and Boxcars checks/messages
			if (dieValue1 == 1 && dieValue2 == 1)
				System.out.println("Snake Eyes!");
			if (dieValue1 == 6 && dieValue2 == 6)
				System.out.println("Boxcars!");
			if (dieValue1 == 3 && dieValue2 == 3)
				System.out.println("Spider Eyes??"); // this callout is not a real one, just a fun little message I wanted to add
			
			System.out.print("\nPress ENTER to roll again, or press X to exit ");
			
		} while (!scnr.nextLine().equalsIgnoreCase("x")); // breaks loop when user inputs "x"
		
		scnr.close();
		
	} // main
	
	
	// this method accepts an integer and returns a String, spelling out the integer
	public static String numberToText(int param1)
	{
		String numberText = "";
		
		// assigns value to numberText based on integer input
		// values 1-6: the faces of a standard game die
		switch (param1)
		{
			case 1:
				numberText = "ONE";
				break;
			case 2:
				numberText = "TWO";
				break;
			case 3:
				numberText = "THREE";
				break;
			case 4: 
				numberText = "FOUR";
				break;
			case 5:
				numberText = "FIVE";
				break;
			case 6:
				numberText = "SIX";
				break;
		} // switch
		
		return numberText; // returns the spelled version of the integer input
		
	} // numberToText
	
	
	// creates a random integer by calling on the imported Random Class
	public static int generateRandomNumber()
	{
		Random randomGenerator = new Random(); // creates randomGenerator object from Random Class
		
		int randomNumber = randomGenerator.nextInt(6) + 1; // creates a random integer 0-5 and adds 1 to match die faces (1-6)
		
		return randomNumber; // returns the randomly generated number 1-6
		
	} // generateRandomNumber

} // Craps Class
