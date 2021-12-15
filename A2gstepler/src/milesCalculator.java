// A2; G. Stepler; CIS 340 T/Th 1:30pm

import java.util.Scanner;

public class milesCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialize variables
		String destCode = "";
		int miles = 0;
		int flierStat = 0;
		double statMult = 0.0;
		double ffMiles = 0.0;
		// failCode is used to tell the program if destCode is a valid destination
		Boolean failCode = false;
		
		//initialize scanner
		Scanner scnr = new Scanner(System.in);
		
		// introduction prompts
		System.out.println("\t\t\tMiles Calculator");
		System.out.println("\nThis program will calculate how many miles you earn on your Phoenix air flight.");
		System.out.println("\nDESTINATIONS");
		
		// getting destination from user input
		System.out.println("Los Angeles (LAX) \nSan Diego (SAN) \nLas Vegas (LAS) ");
		System.out.print("\nEnter destination airport code: ");
		destCode = scnr.nextLine();
		String exitCode = "";
		
		// destination mileage assignment, if invalid set failCode Boolean to true
		switch (destCode)
		{
		case "LAX":
			miles = 369;
			break;
		case "SAN":
			miles = 304;
			break;
		case "LAS":
			miles = 255;
			break;
		default:
			failCode = true;
		}
		
		// check validity of destination
		if (failCode)
		{
			System.out.printf("\nPhoenix Air does not fly to %s. There will be zero miles earned.", destCode);
			System.out.print("\nPress enter to quit: ");
			
			// check for keystroke to terminate program
			if (scnr.nextLine().equals(exitCode))
				System.exit(0);
		}
		
		
		// get frequent flier information
		System.out.println("\nSTATUS");
		System.out.println("1. Bronze \n2. Silver \n3. Gold \n4. Platinum");
				
		// getting frequent flier status from user input
		System.out.print("\nEnter frequent flier status option (1-4): ");
		flierStat = Integer.parseInt(scnr.nextLine());
				
				
		// assign frequent flier status multiplier
		switch (flierStat)
		{
		case 1:
			statMult = 1.0;
			break;
		case 2: 
			statMult = 1.25;
			break;
		case 3:
			statMult = 1.5;
			break;
		case 4:
			statMult = 2.0;
			break;
		default:
			statMult = 0.0;
		}
		
		
		// calculate frequent flier mileage
		ffMiles = (double)miles * statMult;
		
		
		// tell user miles earned
		System.out.printf("\nYou will earn %.2f miles flying from Phoenix to %s.", ffMiles, destCode);
		
		// close scanner
		scnr.close();

	}

}
