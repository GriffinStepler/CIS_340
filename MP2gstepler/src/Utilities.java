// MP2 Griffin Stepler, CIS340, 1:30pm

import java.util.Scanner;

public class Utilities {
	
	private static Scanner scnr = new Scanner(System.in);
	
	public static void deviceHeader()
	{
		System.out.printf("#  %-10s %-20s %-20s", "Sku", "Name", "Number");
		System.out.println();
	}
	
	
	public static void enterToCont()
	{
		System.out.print("\nPress ENTER to Continue...");
		scnr.nextLine();
	}
	
	
	public static void miscHeader(int header)
	{
		switch (header)
		{
		case (1):
			System.out.print("Available Devices");
			break;
		}
	}
	
	
	public static void createWhitespace(int lines)
	{
		for (int i = 0; i < lines; i++)
			System.out.println("");
	}
	
	
//	public static void confMessage(int menuInput)
//	{
//		switch (menuInput)
//		{
//		case (1):
//			System.out.printf("");
//			break;
//		case (2):
//			break;
//		case (3):
//			break;
//		case (4):
//			break;
//		case (5):
//			break;
//		case (6):
//			break;
//		} // switch
//	} 
	
}
