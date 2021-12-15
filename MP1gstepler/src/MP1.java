// Griffin Stepler, Mini Project 1, CIS 340 1:30pm T TH

import java.util.Scanner;

public class MP1 {
	
	static Scanner scnr = new Scanner(System.in);	// initializing Scanner object in class block to be used throughout methods
	static String names[] = new String[3];	// static array, storing names, in parallel with scores[i]
	static double scores[][] = new double[3][];	// static 2D array, storing scores

	public static void main(String[] args) {
		
		System.out.println("\t\tMini Project 1");
		System.out.println("\nThis program will allow you to calculate various averages.\n");
		
		formatScores();	// invokes formatScores() to format the array based on user input
		fillArrays();	// invokes fillArrays() to prompt user input of students/scores
		menu();			// invokes menu() to begin main program, menu() invokes the three average methods
		
	} // main()
	
	
	// formats 2nd Dimension of scores[][] based on user input
	private static void formatScores()
	{
		System.out.print("How many scores per student? ");
		int input = Integer.parseInt(scnr.nextLine());
		
		scores = new double[3][input];
		
	} // formatScores()
	
	
	// method to fill names[] and scores[][]
	private static void fillArrays()
	{
		for (int i = 0; i < scores.length; i++)
		{
			System.out.printf("\nEnter name for student %d: ", i + 1);
			names[i] = scnr.nextLine();
			
			System.out.printf("\nEntering scores for %s\n", names[i].toUpperCase());
			
			for (int j = 0; j < scores[i].length; j++)
			{
				System.out.printf("Quiz %d: ", j + 1);
				scores[i][j] = Double.parseDouble(scnr.nextLine());
			}
		} // outer for loop
		
	} // fillArrays()
	
	
	// method that creates and displays options menu, executes user input, then loops
	private static void menu()
	{
		Boolean loopBool = true; 	// used as a LCV
		String loopInput = ""; 		// user input menu selection, before integer parsing
		String studentName = "";	// used as argument for studentAverage()
		int quizNumber = 0;			// used as argument for quizAverage()
		
		do
		{
			// Menu options
			System.out.println("\t\tMenu");
			System.out.println("1. Class Average");
			System.out.println("2. Student Average");
			System.out.println("3. Quiz Average");
			
			// gets user input, assigns to loopInput variable
			System.out.print("\nEnter choice number, or x to exit: ");
			loopInput = scnr.nextLine();
			
			// checks if loopInput is "x" - the exit code
			// then checks option the user input, defaults to error message
			if (loopInput.equalsIgnoreCase("x"))
				break;
			else if (loopInput.equals("1"))
			{
				classAverage();
			}
			else if (loopInput.equals("2"))
			{
				System.out.print("\nEnter student name: ");
				studentName = scnr.nextLine();
				studentAverage(studentName);
			}
			else if (loopInput.equals("3"))
			{
				System.out.print("\nEnter quiz number: ");
				quizNumber = Integer.parseInt(scnr.nextLine()) - 1;
				quizAverage(quizNumber);
			}
			else
				System.out.println("Error, incorrect input");
			
			System.out.println("\nPress ENTER to continue\n\n\n\n");
			scnr.nextLine();
			
		} while (loopBool == true); // only break from menu() is to enter "x"
		
	} // menu()
	
	
	// calculates class average, prints average
	private static void classAverage()
	{
		int counter = 0;	// used to count the number of scores in calculation
		double total = 0;		// used to sum the scores in calculation
		double avg = 0.0;	// quotient of total (dividend) and counter (divisor)
		
		// loops through scores[], sums all entries and counts entries
		for (int i = 0; i < scores.length; i++)
		{
			for (int j = 0; j < scores[i].length; j++)
			{
				total += scores[i][j];
				counter++;
			}
		} // outer for loop
		
		avg = total / counter;
		
		System.out.printf("\nThe class average is: %.2f\n", avg);
	} // classAverage()
	
	
	// calculates student average, returns avg value
	private static void studentAverage(String name)
	{
		int counter = 0;	// used to count the number of scores in calculation
		double total = 0;		// used to sum the scores in calculation
		double avg = 0.0;	// quotient of total (dividend) and counter (divisor)
		int index = -1;		// used to catalog the index of requested student
		
		// finds student name in names[]
		// if student is not found, index = -1
		for (int i = 0; i < names.length; i++)
		{
			if (names[i].equalsIgnoreCase(name))
			{
				index = i;
				break;
			}
		} // outer for loop
		
		// if student was not found in names[], prints error and returns to menu()
		if (index == -1)
		{
			System.out.println("\nError: student not found");
			return;
		}
		
		// calculates total by looping through scores[name]
		for (int i = 0; i < scores.length; i++)
		{
			for (int j = 0; j < scores[index].length; j++)
			{
				total += scores[index][j];
				counter++;
			}
		} // outer for loop
		
		avg = total / counter;
		
		// prints out student scores by looping through scores[index]
		System.out.printf("%s's scores are ", name);
		for (double i : scores[index])
			System.out.printf("%.2f ", i);
		
		// prints out student average
		System.out.printf("\n%s's average is %.2f\n", name, avg);
		
	} // studentAverage()
	
	
	// calculates quiz average, returns avg value
	private static void quizAverage(int quiz)
	{
		int counter = 0;	// used to count the number of scores in calculation
		double total = 0;		// used to sum the scores in calculation
		double avg = 0.0;	// quotient of total (dividend) and counter (divisor)
		
		// loops through array to total all quiz scores for input quiz number
		for (int i = 0; i < scores.length; i++)
		{
			for (int j = 0; j < scores[i].length; j++)
			{
				total += scores[i][quiz];
				counter++;
			}
		} // outer for loop
		
		avg = total / counter;
		
		//prints out quiz number and average
		System.out.printf("Quiz %d average is %.2f\n", quiz + 1, avg);
		
	} // quizAverage

} // class
