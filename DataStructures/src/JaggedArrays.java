import java.util.Scanner;

public class JaggedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);		
		int[][] jaggedArray;
		
		// to initialize, we specify row size, but not column size
		jaggedArray = new int[3][];
		
		jaggedArray[0] = new int[5]; // student 0 now has 5 test scores
		jaggedArray[1] = new int[3]; // student 1 now has 3 test scores
		jaggedArray[2] = new int[7]; // student 2 now has 7 test scores
		
		for (int i = 0; i < jaggedArray.length; i++)
		{
			System.out.printf("\nHow many test scores for student %d?", i + 1);
			int columns = Integer.parseInt(scnr.nextLine()); // allows us to format the i row of jaggedArray
			jaggedArray[i] = new int[columns];
			
			for (int j = 0; j < jaggedArray[i].length; j++) // the inner loop refers to the [i] row of the array, allowing it to change size
			{
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
