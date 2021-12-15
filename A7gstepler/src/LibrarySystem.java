// Griffin Stepler, CIS 340, T TH 1:30pm

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
	
	//////////////////////////////////////////
	//				Class Variables			//
	/////////////////////////////////////////
	
	private ArrayList<Book> bookList;
	private static Scanner scnr = new Scanner(System.in);	// static scanner object
	
	
	
	//////////////////////////////////////////
	//				Constructors			//
	/////////////////////////////////////////
	
	// creates an instance of LibrarySystem class
	public LibrarySystem()
	{
//		System.out.println("An instance of LibrarySystem has been created.");
	} // constructor
	
	
	
	//////////////////////////////////////////
	//				Methods					//
	/////////////////////////////////////////
	
	public static void main(String args[])
	{
		LibrarySystem myLibrarySys = new LibrarySystem();	// instantiates LibrarySystem class
		
		myLibrarySys.displayHeader();	// display program header to user
		
		myLibrarySys.loadLibrarySys(); 	// invoke loadLibrarySys to begin core program functionality
	} // main
	
	
	// gets user input for name/title
	// instantiates a temporary Book object and adds it to the bookList<>
	private void addBook()
	{
		// variables - values input by user below
		String inputTitle = "";
		int inputYear = 0;
		
		// prompt user input for inputTitle
		System.out.print("Enter Book Title: ");
		inputTitle = scnr.nextLine();
		
		// prompt user input for inputYear
		System.out.print("Enter Book Year: ");
		inputYear = Integer.parseInt(scnr.nextLine());
		
		// instantiate a temporary Book object using input values
		// add temporary Book object to bookList<>
		Book tempBook = new Book(inputTitle, inputYear);
		bookList.add(tempBook);
	} // addBook()
	
	
	// loops through bookList and prints each book's details to the console
	private void displayBookList()
	{
		// header for book list
		System.out.printf("%-60s %-4s\n", "Title", "Year");
		
		// for-each loop reads and prints each entry of the bookList<>
		for (Book b : bookList)
		{
			b.printInformation();	// invokes the printInformation() method to print each book
			System.out.println();	// moves to next line
		}
		
	} // displayBookList()
	
	
	// displays the program header; run once to print title
	private void displayHeader()
	{
		System.out.println("\t\tNew Library System");
		System.out.println("\n");	// creates additional whitespace
	} // displayHeader()
	
	
	// overall Library System logic
	// gets user input for books, adds to bookList<>, and prints bookList<> contents back to user
	private void loadLibrarySys()
	{
		// variables
		bookList = new ArrayList<>();	// instantiates bookList 
		int bookCount = 0;				// instantiates the number of books to be added (LCV)
		
		// prompt user to input number of books to be added
		System.out.print("How many books do you want to add to the library? ");
		bookCount = Integer.parseInt(scnr.nextLine());
		System.out.println(); 	// creates whitespace
		
		// loop through book addition
		// bookCount used to limit the number of loops based on user input
		for (int i = 0; i < bookCount; i++)
		{
			addBook();
		}
		
		// inform user that book adding is complete, wait for user to hit ENTER
		System.out.print("\nAdding books complete. Press ENTER to continue...");
		scnr.nextLine();
		
		// Prints bookList<> contents to console
		System.out.println("\n\n");	// creates whitespace
		displayHeader();			// displays header again
		displayBookList();			// prints list of books in system
		
	} // loadLibrarySys()

} // class
