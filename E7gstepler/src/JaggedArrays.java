// E7; G. Stepler; CIS 340 T/Th 1:30pm

// README
	// This project contains two classes: JaggedArrays.java and TestClass.java
	// TestClass.java is a non-functional class I used as a logic test bed. 
	// TestClass.java does not relate to this assignment; please ignore it. 

import java.util.Scanner;

public class JaggedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		int[][] scores;
		int scoreTotal = 0;
		double avg = 0.0;
		int scoresPerStudent = 0;
		int totalScores = 0;
		
		scores = new int[3][];
		
		System.out.println("\t\tTest Average Calculator");
		
		for (int i = 0; i < scores.length; i++)
		{
			System.out.printf("\nHow many scores for Student %d? ", i + 1);
			scoresPerStudent = Integer.parseInt(scnr.nextLine());
			scores[i] = new int[scoresPerStudent];
			
			System.out.printf("\nEnter scores for Student %d\n", i + 1);
			
			for (int j = 0; j < scores[i].length; j++)
			{
				System.out.printf("Score %d: ", j + 1);
				scores[i][j] = Integer.parseInt(scnr.nextLine());
				totalScores++;
			}
		}
		
		for (int i = 0; i < scores.length; i++)
		{
			for (int j = 0; j < scores[i].length; j++)
			{
				scoreTotal = scoreTotal + scores[i][j];
			}
		}
		
		avg = (double) scoreTotal / totalScores;
		System.out.printf("\nThere were %d scores.", totalScores);
		System.out.printf("\nThe class average for all tests is %.2f", avg);
		
		scnr.close();
	}

}
