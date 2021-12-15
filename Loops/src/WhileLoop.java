
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Three things loops need:
		// 1. Counter Variable
		// 2. Boolean Condition
		// 3. Increment/Decrement Counter
		
		
		/**
		int counter = 0;
		
		while (counter < 5)
		{
			System.out.println("This is the counter value: " + counter);
			counter++;
			// or counter = counter + 1; <-- this is just less efficient
		}
		
		
		// for loops using internally declared variables
		for (int val = 1; val < 11; ++val)
		{
			System.out.println(val);
		}
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("value of i = " + i);
		}
		
		
		// do loop, counter is reassigned to 0 for use in this loop
		counter = 0;
		
		System.out.println("\nDo loop beginning...");
		
		do {
			System.out.println("counter value: " + counter);
			counter++;
		} while (counter < 5);
		
		System.out.println("Do loop has ended.");
		
		**/
		
		
		// indefinite loop, user inputs indefinite amount of scores, program averages scores
		Scanner scnr = new Scanner(System.in);
		int score = 0;
		String response = "";
		int total = 0;
		int scoreCount = 0;
		
		do {
			System.out.print("Enter test score: ");
			score = Integer.parseInt(scnr.nextLine());
			
			// accumulate scores
			total = total + score;
			scoreCount++;
			
			System.out.print("Do you have another score to enter? (Y/N): ");
			response = scnr.nextLine();
			
		} while (response.equalsIgnoreCase("Y")); // Strings cannot be measured with ==, must use the .equals() method
		
		double scoreAvg = (double)total / (double)scoreCount;
		
		System.out.println("\nYour score average is: " + scoreAvg);
		System.out.println("End of indefinite loop.");
		
		scnr.close();

	}

}
