import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		// store test scores for three students
		// each student will have 2 test scores
		
		int[][] testScores = new int[3][2];
		
		for (int i = 0; i < testScores.length; i++) // loops through all 3 students 
		{
			for (int j = 0; j < testScores[i].length; j++) // loops through 2 test scores
			{
				System.out.print("Enter a test score [Student = " + i + "] [Test = " + j + "]: ");
				testScores[i][j] = Integer.parseInt(scnr.nextLine());
			}
		}
		
		System.out.println("\nOutput all test scores");
		
		for (int i = 0; i < testScores.length; i++)
		{
			for (int j = 0; j < testScores[i].length; j++)
			{
				System.out.printf("Test score %d for student %d: %d\n", j + 1, i + 1, testScores[i][j]);
			}
		}
		
		scnr.close();
	}

}
