
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
//		// declaring and initializing variables
//		int scoreTotal = 0;
//		double classAverage = 0.0;
//		int scoreCount = 0;
//		
//		// declaring and initializing arrays
//		Integer[][] scores = new Integer[3][];			// this array stores scores by student
//		Integer[] scoresPerStudent = new Integer[3];	// this array stores the number of scores per student
//		
//		// getting scores for each student
//		for (int i = 0; i < scores.length; i++)
//		{
//			System.out.printf("\nHow many scores for Student %d? ", i + 1);
//			scoresPerStudent[i] = Integer.parseInt(scnr.nextLine()); // assigns number of scores to secondary array
//			
//			System.out.printf("\nEnter scores for student %d\n", i + 1);
//			
//			for (int j = 0; j < scoresPerStudent[i]; j++)
//			{
//				System.out.printf("Score %d: ", j + 1);	// asks for score input for test 1 through scoresPerStudent[i]
//				scoreTotal = scoreTotal + Integer.parseInt(scnr.nextLine()); // accumulates score total 
//			}
//		}
//		
//		// for loop determining total number of scores
//		for (int i = 0; i < scores.length; i++)
//		{
//			scoreCount = scoreCount + scoresPerStudent[i];
//		}
//		
//		classAverage = (double) scoreTotal / scoreCount;
//		System.out.printf("\nThere were %d scores.", scoreCount);
//		System.out.printf("\nThe class average for all tests is %.2f", classAverage);
		
//		int[][] scores = { {78, 45, 76, 56, 85}, 
//							{34, 45, 78},
//							{98, 67, 90, 97} };
//							
//		int[] scoresPerStudent = new int[3];
//		
//		
//		// CHALLENGE CODE BELOW
//		// finding the average for any student
//		int inputStudent = 0;	// chosen student to average scores for
//		double sAverage = 0.0; 	// student's average score
//		int sTotal = 0; 		// sum of the student's scores
//		
//		System.out.print("\n\nWhat student would you like to find the average for? ");
//		inputStudent = Integer.parseInt(scnr.nextLine());
//		
//		for (int i = 0; i < scores[inputStudent].length; i++)
//		{
//			sTotal = sTotal + scores[inputStudent][i];
//		}
//		
//		sAverage = (double) sTotal / scores[inputStudent].length;
//		System.out.printf("\nThe average score for Student %d is %f", inputStudent, sAverage);
//		
//		// finding the average for any test
//		int inputTest = 0;		// chosen test to average scores for
//		double tAverage = 0.0;	// test's average score
//		int tTotal = 0; 		// sum of all scores for the test
//		int tCount = 0; 		// number of students who took the chosen test
//		
//		System.out.print("\nWhat test would you like to find the average for? ");
//		inputTest = Integer.parseInt(scnr.nextLine());
//		
//		for (int i = 0; i < scores.length; i++)
//		{
//			tTotal = tTotal + scores[i][inputTest];
//		}
//		
//		for (int i = 0; i < scores.length; i++)
//		{
//			if (scoresPerStudent[i] >= inputTest)
//				tCount++;
//		}
//		
//		tAverage = (double) tTotal / tCount;
//		System.out.printf("The average score for test %d is %.2f", inputTest, tAverage);
//		
//		scnr.close();
		
//		int[][] scores;
//		int scoreTotal = 0;
//		double avg = 0.0;
//		int scoresPerStudent = 0;
//		int totalScores = 0;
//		
//		scores = new int[3][];
//		
//		System.out.println("\t\tTest Average Calculator");
//		
//		for (int i = 0; i < scores.length; i++)
//		{
//			System.out.printf("\nHow many scores for Student %d? ", i + 1);
//			scoresPerStudent = Integer.parseInt(scnr.nextLine());
//			scores[i] = new int[scoresPerStudent];
//			
//			System.out.printf("\nEnter scores for Student %d\n", i + 1);
//			
//			for (int j = 0; j < scores[i].length; j++)
//			{
//				System.out.printf("Score %d: ", j + 1);
//				scores[i][j] = Integer.parseInt(scnr.nextLine());
//				totalScores++;
//			}
//		}
//		
//		for (int i = 0; i < scores.length; i++)
//		{
//			for (int j = 0; j < scores[i].length; j++)
//			{
//				scoreTotal = scoreTotal + scores[i][j];
//			}
//		}
//		
//		avg = (double) scoreTotal / totalScores;
//		System.out.printf("\nThere were %d scores.", totalScores);
//		System.out.printf("\nThe class average for all tests is %.2f", avg);
//		
		scnr.close();
	}

}
