// MP2 Griffin Stepler, CIS 340, 1:30pm

import java.util.Scanner;

public class DMS {
	
	//////////////////////////////////////
	//			Variables				//
	//////////////////////////////////////
	
	private Scanner scnr = new Scanner(System.in);
	private static Library myLibrary = new Library();
	private static DMS myDMS = new DMS();
	
	
	//////////////////////////////////////
	//			Main Method				//
	//////////////////////////////////////
	
	public static void main(String[] args) {
		myLibrary.fillArray();
		myDMS.showMenu();
	}
	
	
	//////////////////////////////////////
	//			Methods					//
	//////////////////////////////////////	
	
	public void showMenu()
	{
		int menuInput = 0;
		
		do
		{
			myLibrary.printHeader(0);
			
			System.out.println("\n1. List Devices by Title");	// printList()
			System.out.println("2. Add New Devices");			// createAddDevice()
			System.out.println("3. Edit Device Information");	// editDevice();
			System.out.println("4. Search by Device Name");
			System.out.println("5. Check Out Devices");
			System.out.println("6. Check In Devices");
			System.out.println("7. Exit");
			
			System.out.print("\nSelect menu option (1-7): ");
			menuInput = Integer.parseInt(scnr.nextLine());
			
			switch (menuInput)
			{
			case (1): 
				myLibrary.printHeader(menuInput);
				myLibrary.printList();
				break;
			case (2):
				myLibrary.printHeader(menuInput);
				myLibrary.createAddDevice();
				break;
			case (3):
				myLibrary.printHeader(menuInput);
				myLibrary.editDevice();
				break;
			case (4):
				myLibrary.printHeader(menuInput);
				myLibrary.searchList();
				break;
			case (5):
				myLibrary.printHeader(menuInput);
				myLibrary.checkOut();
				break;
			case (6):
				myLibrary.printHeader(menuInput);
				myLibrary.checkIn();
				break;
			case (7):
				System.exit(0);
			}
			
		} while (menuInput != 7);
		
	}
	
}
