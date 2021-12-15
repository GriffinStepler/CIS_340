// A5, Griffin Stepler, CIS 340 T TH 1:30pm

import java.util.Scanner;

public class GradeSystem {
	
	static int scoreArray[];	// static array to store scores, in parallel line 8
	static String nameArray[];	// static array to store names, in parallel line 7
	static Scanner scnr = new Scanner(System.in); 	// static Scanner object
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initializing nameArray and scoreArray
		scoreArray = new int[5];
		nameArray = new String[5];
		
		// welcome message
		System.out.println("\t\tStudent Grade System");
		System.out.println("\nThis program will store student grades and look them up for you.\n");
		
		// populating nameArray and scoreArray with user input
		// done by invoking respective methods
		populateNameArray();
		System.out.println("\n");
		populateScoreArray();
		
		// user input for what student they want to search
		System.out.print("\n\nEnter name of student whose score you want to find: ");
		
		// invoke findStudentPosition and store output
		int studentPosition = findStudentPosition(scnr.nextLine());
		
		// check if student was found in array (-1 indicates no match)
		if (studentPosition == -1)
			System.out.println("\nSorry, there is no student by that name.");
		else
			System.out.printf("%s's score is %d", nameArray[studentPosition], scoreArray[studentPosition]);
		
		// exit code
		String contCode = "";		// used to check if user input ENTER
		Boolean loopBool = true;	// controls do loop
		
		System.out.println();
		do
		{
			System.out.print("\nPress Enter to Quit...");
			if (scnr.nextLine().equals(contCode))
				System.exit(0);
		} while (loopBool);
		
		scnr.close();
	} // main()
	
	
	public static void populateNameArray()
	{
		// prompts user for input
		System.out.println("******************************");
		System.out.printf("Enter the names of %d students.\n", nameArray.length);
		System.out.println("******************************\n");
		
		// loops through array and get user input
		for (int i = 0; i < nameArray.length; i++)
		{
			nameArray[i] = scnr.nextLine(); // assigns user input to nameArray[i]
		}
		
	} // populateNameArray()
	
	
	public static void populateScoreArray()
	{
		// prompts user for input
		System.out.println("*********************************");
		System.out.println("Enter scores. One score per line.");
		System.out.println("*********************************\n");
			
		// loops through array and get user input
		for (int i = 0; i < nameArray.length; i++)
		{
			System.out.printf("Enter score for %s: ", nameArray[i]);
			scoreArray[i] = Integer.parseInt(scnr.nextLine()); // assigns user input to scoreArray[i]
		}
		
	}// populateScoreArray()
	
	
	public static int findStudentPosition(String nameOfStudent)
	{
		int index = -1;
		
		// loops through array and search for match
		for(int i = 0; i < nameArray.length; i++)
		{
			// checks if nameArray[i] matches user input
			if (nameOfStudent.equalsIgnoreCase(nameArray[i]))
			{
				index = i;	// notes index for return value
				break; 		// breaks from loop
			}
		}
		
		return(index);
		
	} // findStudentPosition()
	
} // class()
