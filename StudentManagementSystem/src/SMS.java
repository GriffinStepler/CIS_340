

import java.util.Scanner;

public class SMS {
	
	static Course my340Course;		// accessible from any method
	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String args[]) {
		loadSMS();
	}
	
	
	public static void loadSMS()
	{
		///////////////////////////////////////
		//			Test Code				//
		//////////////////////////////////////
		
//		// creating course and adding student
//		Course my340Course = new Course();
//		Student tempStudent = my340Course.add();
//		
//		// updates the value in the ArrayList even though we are modifying the tempStudent value
//		// the ArrayList and tempStudent both hold references to the same Student object
//		tempStudent.setName("John Smith");
//		
//		// The Course object contains a getter (getStudentRoster), which gives access to the ArrayList
//		// The ArrayList has a getter (get) which gives access to the Student Object at an index
//		// The Student object has a setter (setName) which allows you to set the name
//		my340Course.getStudentRoster().get(0).setName("Jonathan Smith");
//		
//		System.out.print("The first student in the roster is ");
//		System.out.print(my340Course.getStudentRoster().get(0).getName());
//		
//		System.out.println();
//		my340Course.getStudentRoster().get(0).printInformation();
		
		///////////////////////////////////////
		//			Working Code			//
		//////////////////////////////////////
		
		my340Course = new Course();
		SMS mySMS = new SMS();
		mySMS.showMenu();
	} // loadSMS()
	
	
	public static void addNewStudent()
	{
		String inputName = "";
		String inputID = "";
		
		System.out.print("Name: ");
		inputName = scnr.nextLine();
		
		System.out.print("ID: ");
		inputID = scnr.nextLine();
		
		Student tempStudent = new Student(inputName, inputID);
		my340Course.add(tempStudent);
	} // addNewStudent()
	
	
	public void showMenu()
	{
		int menuInput = -1;			// stores user input to menu prompt
		
		do 
		{
			System.out.println("\n\t\tStudent Management System\n");
			System.out.println("\n1. Add Student");
			System.out.println("2. Print Roster");
			System.out.println("3. Exit");
			
			System.out.print("\nEnter Choice: ");
			menuInput = Integer.parseInt(scnr.nextLine());
			
			switch (menuInput)
			{
			case 1:
				addNewStudent();
				break;
			case 2: 
				my340Course.printRoster();
				System.out.print("\nPress ENTER to Continue...");
				scnr.nextLine();
				break;
			}
			
		} while (menuInput != 3);
	} // showMenu()
	
} // class
