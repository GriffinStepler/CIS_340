
import java.util.Scanner;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		/*
		// declare an array of strings
		String[] names = new String[5];
		
		names[0] = "John";
		names[1] = "Jane";
		
		int[] numbers = new int[10];
		
		numbers[6] = 100;
		
		// loop through or traverse the array
		for (int i = 0; i < names.length; i++)
		{
			System.out.print("Enter Name: ");
			names[i] = scnr.nextLine();
		}
		
		System.out.println("You entered the following names: ");
		
		for (int i = 0; i < names.length; i++)
		{
			System.out.printf("Name %d is %s \n", i + 1, names[i]);
		}
		*/
		
		String[] studentNames = {"Ethan", "Tyler", "Riley", "Kennedi"};
		String[] regCourses = {"CIS 360", "CIS 401", "CIS 425", "CIS 365"};
		
		for (int i = 0; i < regCourses.length; i++)
		{
			System.out.printf("%s is also registered for %s\n", studentNames[i], regCourses[i]);
		}
		
		scnr.close();
	}

}
