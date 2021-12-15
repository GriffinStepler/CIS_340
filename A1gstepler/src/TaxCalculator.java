// A1; G. Stepler; CIS 340 T/Th 1:30pm

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring and initializing income variables
		double grossIncome = 0.0;
		double deduction = 0.0;
		double netIncome = 0.0;
		
		// declaring and initializing tax variables
		double federalTax = 0.0;
		double stateTax = 0.0;
		double incomeTax = 0.0;
		
		//declaring and initializing filingStatus variable
		String filingStatus = "";
		
		// declaring and initializing scanner
		Scanner scnr = new Scanner(System.in);
		
		// header and introduction lines
		System.out.println("\t\t\tIncome Tax Calculator");
		System.out.println("\nThis program will calculate your income tax.");
		
		// prompt user input grossIncome, store grossIncome
		System.out.print("\nWhat is your gross income? ");
		grossIncome = Double.parseDouble(scnr.nextLine());
		
		// filing status header
		System.out.println("\nFiling Status:");
		// filing status selections
		System.out.println("Single - SG \nMarried Joint - MJ \nMarried Separately - MS \nHead of Household - HH ");
		System.out.print("\nEnter the two letter code corresponding with your status: ");
		filingStatus = scnr.nextLine();
		
		// calculate deduction based on filingStatus, switch used because each filing status is a specific value
		switch(filingStatus) 
		{
		case "SG":
			deduction = 5950;
			break;
		case "MJ":
			deduction = 11900;
			break;
		case "MS":
			deduction = 5950;
			break;
		case "HH":
			deduction = 8700;
			break;
		default:
			deduction = 0;
		}
		
		// calculate netIncome
		netIncome = grossIncome - deduction;
		
		// calculate federalTax, if else used because tax brackets are ranges of income
		if (netIncome < 30000)
		{
			federalTax = 0 * netIncome;
		}
		else if (30000 <= netIncome && netIncome < 60000)
		{
			federalTax = 0.1 * netIncome;
		}
		else if (60000 <= netIncome && netIncome < 100000)
		{
			federalTax = 0.2 * netIncome;
		}
		else if (100000 <= netIncome && netIncome < 250000)
		{
			federalTax = 0.3 * netIncome;
		}
		else if (250000 <= netIncome)
		{
			federalTax = 0.4 * netIncome;
		}
		
		// calculate stateTax and final incomeTax
		stateTax = netIncome * 0.025;
		incomeTax = stateTax + federalTax;
		
		// output grossIncome and incomeTax amounts
		System.out.printf("\nYour stated income was $%.2f", grossIncome);
		System.out.printf("\nYour total income tax liability is $%.2f", incomeTax);
		
		// close scanner
		scnr.close();
	}

}