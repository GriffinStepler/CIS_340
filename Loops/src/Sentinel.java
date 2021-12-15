import java.util.Scanner;

public class Sentinel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** indefinite loop, user inputs indefinite amount of scores, program averages scores
				Scanner scnr = new Scanner(System.in);
				int score = 0;
				String response = "";
				int total = 0;
				int scoreCount = 0;
				
				do {
					System.out.print("Enter test score: ");
					score = Integer.parseInt(scnr.nextLine());
					
					// accumulate scores
					total = total + score;
					scoreCount++;
					
					System.out.print("Do you have another score to enter? (Y/N): ");
					response = scnr.nextLine();
					
				} while (response.equalsIgnoreCase("Y")); // Strings cannot be measured with ==, must use the .equals() method
				
				double scoreAvg = (double)total / (double)scoreCount;
				
				System.out.println("\nYour score average is: " + scoreAvg);
				System.out.println("End of indefinite loop.");
				
				scnr.close();
		**/
		
		// modified to use a sentinel
				Scanner scnr = new Scanner(System.in);
				int score = 0;
				String response = "";
				int total = 0;
				int scoreCount = 0;
				/*
				do {
					System.out.print("Enter test score (or -1 to Quit): ");
					score = Integer.parseInt(scnr.nextLine());
					
					if (score != -1)
					{
						total = total + score;
						scoreCount++;
					}

					// keep repeating while user does not enter -1 (Sentinel value)
				} while (score != -1);
				
				double scoreAvg = (double)total / (double)scoreCount;
				
				System.out.println("\nYour score average is: " + scoreAvg);
				System.out.println("End of indefinite loop.");
				*/
				do
				{
					System.out.print("Enter a number: ");
					response = scnr.nextLine();
					
					if (!response.equalsIgnoreCase("x"))
					{
						score = Integer.parseInt(response);
						total = total + score;
						scoreCount++;
					}
					else 
						break;
				} while (!response.equalsIgnoreCase("x"));
				
				double average = (double) total / scoreCount;
				System.out.print(average);
				
				
				scnr.close();

	}

}
