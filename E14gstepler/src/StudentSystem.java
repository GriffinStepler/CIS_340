// E14 Griffin Stepler, CIS 340 T TH 1:30pm

import java.util.Scanner;
import java.util.ArrayList;

public class StudentSystem {
	
//	private static Scanner sncr = new Scanner(System.in);
	private static ArrayList<Student> studentRoster;	// declaring private, static ArrayList studentRoster

	public static void main(String[] args)
	{
		loadStudents();
	} // main()
	
	
	private static void loadStudents()
	{
		Scanner scnr = new Scanner(System.in);	// declaring and initializing local Scanner object
		
		studentRoster = new ArrayList<>();	// instantiating ArrayList studentRoster
		Boolean continueLoop;	// declaring and instantiating LCV
		String name;			// studentName
		String id;				// studentID
		
		// Introduction
		System.out.println("\t\tStudent Roster");
		System.out.println("This program will allow you to store and see Student Names and IDs.");
		
		do 
		{
			continueLoop = false;	// LCV; assigns FALSE each loop (needed for the if structure below to function)
			
			// get user input for Student Name and ID
			System.out.print("\nEnter Student Name: ");
			name = scnr.nextLine();
			System.out.print("Enter Student ID: ");
			id = scnr.nextLine();
			
			// use user input to create new Student object, add object to studentRoster ArrayList
			Student tempStudent = new Student(name, id);
			studentRoster.add(tempStudent);
			
			// ask user if they would like to create another Student object
			System.out.println("\n\nWould you like to create another student?");
			System.out.print("Enter \"Y\" for Yes. Any other key for No. ");
			String input = scnr.nextLine();
			
			// if user inputs "y" or "Y", continue the loop
			if (input.equalsIgnoreCase("Y"))
			{
				continueLoop = true;
			}
			
		} while (continueLoop);
		
		// prints out the studentRoster ArrayList
		System.out.printf("\n%-25s %s", "Name", "ID"); // prints column headers for Name/ID output
		for (Student s : studentRoster)
		{
			System.out.printf("\n%-25s %s", s.getName(), s.getID());
		}
		
		scnr.close();
		
	} // loadStudents()
	
} // class