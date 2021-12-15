// E5; G. Stepler; CIS 340 T/Th 1:30pm

import java.util.Scanner;

public class GPACalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		String grade = ""; // user input grade value
		int credits = 0; // user input credits per class
		int gValue = 0; // switch grade math value
		int cValue = 0; // end GPA value per class
		int totalGVal = 0; // accumulated class GPA value - numerator for end division
		int totalCred = 0; // accumulated credit hours - denominator for end division
		double gpa = 0.0; // end calculated GPA 
		
		System.out.println("\t\tGPA Calculator");
		System.out.println("\nThis program will calculate GPAs based on course grades.");
		
		for (int i = 0; i < 4; i++) // loops 4 times 
		{
			System.out.print("Enter a grade: ");
			grade = scnr.nextLine();
			grade = grade.toUpperCase(); // converts input to upper case for comparison
			
			switch (grade) // assigning gValue based on input grade
			{
			case "A":
				gValue = 4;
				break;
			case "B":
				gValue = 3;
				break;
			case "C":
				gValue = 2;
				break;
			case "D":
				gValue = 1;
				break;
			default:
				gValue = 0;
			}
			
			System.out.print("Enter a number of credits for grade: ");
			credits = Integer.parseInt(scnr.nextLine());
			System.out.println();
			totalCred = totalCred + credits; // accumulating total credits
			cValue = gValue * credits; // calculating credit value per class
			totalGVal = totalGVal + cValue; // accumulating total grade value
		}
		
		gpa = (double) totalGVal / totalCred;
		
		System.out.printf("The GPA is: %.2f", gpa); // print GPA, rounded to 2 decimals
		
		scnr.close();
	}

}