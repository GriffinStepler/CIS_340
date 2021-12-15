// MP2 Griffin Stepler, CIS 340, 1:30pm

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	
	//////////////////////////////////////
	//			Variables				//
	//////////////////////////////////////
	
	private ArrayList<Device> deviceList;
	private Scanner scnr = new Scanner(System.in);
	
	//////////////////////////////////////
	//			Constructors			//
	//////////////////////////////////////
	
	public Library()
	{
		deviceList = new ArrayList<>(10);	// initializes ArrayList to a default size of 10
	}
	
	
	//////////////////////////////////////
	//				Methods				//
	//////////////////////////////////////
	
	// adds a Device object to deviceList<> and returns it for modification
	public Device add()
	{
		Device tempDevice = new Device();
		deviceList.add(tempDevice);
		return tempDevice;
	}
	
	
	// adds an already created Device object to deviceList<>
	public void add(Device device)
	{
		deviceList.add(device);
	}
	
	
	// used to fill the array with 5 default Device objects
	public void fillArray()
	{
		Device d1 = new Device("iPhone X", "AIP245");
		Device d2 = new Device("iPhone 8", "AIP288");
		Device d3 = new Device("iMac", "AIM111");
		Device d4 = new Device("Google Home", "GOOG12");
		Device d5 = new Device("Google Pixel", "GOOGP2");
		
		deviceList.add(d1);
		deviceList.add(d2);
		deviceList.add(d3);
		deviceList.add(d4);
		deviceList.add(d5);
	}
	
	
	// prints the contents of deviceList<> in numbered columns
	public void printList()
	{
		Utilities.deviceHeader();
		
		for (Device d : deviceList)
		{
			System.out.print(deviceList.indexOf(d) + 1);
			d.printInformation();
			System.out.println();
		}
		
		Utilities.enterToCont();
	}
	
	
	// overloaded version of the method: include a modifier for no enterToCont();
	// FIXME: this is somewhat hacky... maybe remove or change how this works
	public void printList(int modifier)
	{
		Utilities.deviceHeader();
		
		for (Device d : deviceList)
		{
			System.out.print(deviceList.indexOf(d) + 1);
			d.printInformation();
			System.out.println();
		}

	}
	
	
	public void printHeader(int screen)
	{
		Utilities.createWhitespace(6);
		System.out.print("\t\tLibrary Device Checkout System");
		
		switch (screen)
		{
		case (1):
			System.out.println(" - List of Devices");
			break;
		case (2):
			System.out.println(" - Add Device");
			break;
		case (3):
			System.out.println(" - Edit Device");
			break;
		case (4):
			System.out.println(" - Search Device");
			break;
		case (5):
			System.out.println(" - Check Out Devices");
			break;
		case (6):
			System.out.println(" - Check In Devices");
			break;
		default:
			System.out.println();
		}
		
		System.out.println("\n");
	}
	
	
	public void createAddDevice()
	{
		String inputName = " ";
		String inputSku = " ";
		
		System.out.print("Sku: ");
		inputSku = scnr.nextLine();
		
		System.out.print("Name: ");
		inputName = scnr.nextLine();
		
		Device tempDevice = new Device(inputName, inputSku);
		add(tempDevice);
		
		Utilities.enterToCont();
	}
	
	
	public void editDevice()
	{
		String inputSku = " ";
		String inputName = " ";
		int indexNumber = -1;
		
		printList(0);
		
		try
		{
			System.out.print("\nEnter the Device Number to Edit: ");
			indexNumber = Integer.parseInt(scnr.nextLine()) - 1;
		
			deviceList.get(indexNumber);
			System.out.print("Name: ");
			inputName = scnr.nextLine();
			
			System.out.print("Sku: ");
			inputSku = scnr.nextLine();
			
			deviceList.get(indexNumber).setName(inputName);
			deviceList.get(indexNumber).setSku(inputSku);
		}
		catch (IndexOutOfBoundsException error)
		{
			System.out.println("Invalid number: Device Does Not Exist");
		}
		catch (Exception error)
		{
			System.out.println("Invalid Number");
		}
		
		Utilities.enterToCont();
	}
	
	
	public void searchList()
	{
		String searchTerm = " ";
		
		System.out.print("\nEnter Device to search for: ");
		searchTerm = scnr.nextLine();
		
		Utilities.deviceHeader();
		
		for (Device d : deviceList)
		{
			if (d.getName().toUpperCase().contains(searchTerm.toUpperCase()))
			{
				System.out.print(deviceList.indexOf(d) + 1);
				d.printInformation();
				System.out.println();
			} // if
			
		} // for
		
		Utilities.enterToCont();
	}
	
	
	public void checkOut()
	{
		int indexNumber;
		
		System.out.println("Available Devices\n");
		Utilities.deviceHeader();
		
		for (Device d : deviceList)
		{
			if (d.getStatus().equals("Available"))
			{
				System.out.print(deviceList.indexOf(d) + 1);
				d.printInformation();
				System.out.println();
			}
		} // for
		
		try
		{
		System.out.print("\nEnter device number: ");
		indexNumber = Integer.parseInt(scnr.nextLine()) - 1;
		
		// verifies that item is available
				if (deviceList.get(indexNumber).getStatus().equals("Available"))
				{
					deviceList.get(indexNumber).toggleStatus();
					System.out.println("Device checked out.");
				}
				else
					System.out.println("This device is not available to be checked out.");
		}
		catch (IndexOutOfBoundsException error)
		{
			System.out.println("Invalid Number: Device Does Not Exist");
		}
		catch (Exception error)
		{
			System.out.println("Invalid Number");
		}
		
		Utilities.enterToCont();
	}
	
	
	public void checkIn()
	{
		int indexNumber;
		
		System.out.println("Checked Out Devices\n");
		Utilities.deviceHeader();
		
		for (Device d : deviceList)
		{
			if (d.getStatus().equals("Checked Out"))
			{
				System.out.print(deviceList.indexOf(d) + 1);
				d.printInformation();
				System.out.println();
			}
		}
		
		try
		{
			System.out.print("\nEnter device number: ");
			indexNumber = Integer.parseInt(scnr.nextLine()) - 1;
			
			// verifies that item is currently checked out
			if (deviceList.get(indexNumber).getStatus().equals("Checked Out"))
			{
				deviceList.get(indexNumber).toggleStatus();
				System.out.println("Device checked in.");
			}
			else 
				System.out.println("This device is already checked in.");
		}
		catch (IndexOutOfBoundsException error)
		{
			System.out.println("Invalid Number: Device Does Not Exist");
		}
		catch (Exception error)
		{
			System.out.println("Invalid Number");
		}
		
		Utilities.enterToCont();
	}
	
}
