// E6; G. Stepler; CIS 340 T/Th 1:30pm

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		// declaring arrays
		int[] scores;
		String[] names;
		
		// initializing arrays
		names = new String[5];
		scores = new int[5];
		
		// declaring column header variables
		String nHeader = "Name";
		String sHeader = "Score";
		
		// header and prompting input for names
		System.out.println("\t\tStudent Grade System");
		System.out.println("\nThis program will store student grades and look them up for you.\n");
		System.out.println("*******************************");
		System.out.println("Enter names. One name per line.");
		System.out.println("*******************************");
		
		for (int i = 0; i < names.length; i++) // for loop getting input for student names
		{
			System.out.print("Enter name: ");
			names[i] = scnr.nextLine();
		}
		
		// header and prompting input for scores
		System.out.println("\n*********************************");
		System.out.println("Enter scores. One score per line.");
		System.out.println("*********************************");
		
		for (int i = 0; i < scores.length; i++) // for loop getting input for student scores
		{
			System.out.printf("Enter score for %s: ", names[i]);
			scores[i] = Integer.parseInt(scnr.nextLine());
		}
		
		// headers for returning formatted input to user
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("You entered the following data:\n");
		System.out.printf("%-10s %10s\n", nHeader, sHeader);
		
		for (int i = 0; i < names.length; i++) // for loop returning formatted user input
		{
			System.out.printf("%-10s %10d\n", names[i], scores[i]);
		}
		
		scnr.close();
	}

}
