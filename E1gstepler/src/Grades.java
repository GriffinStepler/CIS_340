
// Importing Scanner utility 
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		// Declaring and Initializing variables
		String studentName = "";
		int score = 0;
		char grade = 'Z';
		
		// Declaring Scanner
		Scanner scnr = new Scanner(System.in);
		
		// Introduction and getting studentName
		System.out.println("\t\t\tLetter Grade Calculator");
		System.out.print("\nWhat's your name? ");
		studentName = scnr.nextLine();
		
		// Getting score
		System.out.printf("Enter score for %s: ", studentName);
		score = Integer.parseInt( scnr.nextLine() );
		
		// Letter grade assignment
		if (score >= 90) 
		{
			grade = 'A';
		}
		else if (score < 90 && score >= 80) 
		{
			grade = 'B';
		}
		else if (score < 80 && score >= 70) 
		{
			grade = 'C';
		}
		else if (score < 70 && score >= 60) 
		{
			grade = 'D';
		}
		else if (score < 60) {
			grade = 'F';
		}
		
		System.out.printf("Your grade: %s. ", grade);
		
		// Letter Grade feedback
		if (grade == 'A') 
		{
			System.out.print("Awesome! ");
		}
		else if (grade == 'B')
		{
			System.out.print("Beautiful! " );
		}
		else if (grade == 'C')
		{
			System.out.print("Not bad! ");
		}
		else if (grade == 'D')
		{
			System.out.print("Not horrible. ");
		}
		else if (grade == 'F')
		{
			System.out.print("Yikes... ");
		}
		
		// Pass or Fail response
		if (grade != 'F')
		{
			System.out.println("You passed. ");
		}
		else 
		{
			System.out.println("You failed. ");
		}
		
		// Pass only encouragement
		if (grade == 'A' || grade == 'B')
		{
			System.out.print("Keep doing what you're doing!");
		}
		else if (grade == 'C' || grade == 'D')
		{
			System.out.print("Do better next semester!");
		}
		
		
		scnr.close();
	}

}
