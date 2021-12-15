// E12 Griffin Stepler, CIS 340, 1:30pm M W

import java.util.Scanner;
import java.util.ArrayList;

public class References {
	
	
	static Scanner scnr = new Scanner(System.in);

	
	public static void main(String[] args) 
	{
		// introduction
		System.out.println("\t**** Passing References - Reading 5 Names ****\n");
		
		// passing an array by value
		System.out.println("Main Method: Passing an Array, nameArray, by-value");
		// initializing and storing array values
		String[] nameArray = new String[5];
		readStudentsNames(nameArray);
		// printing array values
		System.out.println("\nMain Method: the contents of nameArray are: ");
		for (String s : nameArray)	// this could be done with a for loop, but it would be longer
			System.out.println(s);
		
		// passing an ArrayList by value
		System.out.println("\nMain Method: Passing an ArrayList, nameArrayList, by-value");
		// initializing and storing ArrayList values
		ArrayList<String> nameArrayList = new ArrayList<>();
		readStudentsNames(nameArrayList);
		// printing array values
		System.out.println("\nMain Method: the contents of nameArrayList are: ");
		for (String s : nameArrayList)
			System.out.println(s);
	} // main()
	
	
	private static void readStudentsNames(String[] stringArray)
	{
		System.out.println("readStudentsNames Method: Putting values inside stringArray parameter");
		
		// loops through stringArray, names input at index i
		for (int i = 0; i < stringArray.length; i++)
		{
			System.out.printf("Enter name %d: ", i + 1);
			stringArray[i] = scnr.nextLine();
		}
	} // readStudentsNames(String[])
	
	
	private static void readStudentsNames(ArrayList<String> stringList)
	{
		System.out.println("readStudentsNames Method: Putting values inside stringList parameter");
		
		// loops through stringList, names input at next available index
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("Enter name %d: ", i + 1);
			stringList.add(scnr.nextLine());
		}
	} // readStudentsNames(ArrayList)

}
