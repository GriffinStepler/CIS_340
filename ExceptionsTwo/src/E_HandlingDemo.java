import java.util.Scanner;

public class E_HandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 0;
		double result = 0.0;

		Scanner scnr = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter 1st number: ");
			a = Integer.parseInt(scnr.nextLine());
			
			System.out.print("Enter 2nd number: ");
			b = Integer.parseInt(scnr.nextLine());
			
			result = (double) a / b;
			
			System.out.printf("Result of a / b is %.3f", result);
			
		}
		catch(NumberFormatException err)
		{
			System.out.println("You entered an invalid number!");
			System.out.println( err.getMessage());
		}
		catch (Exception err)
		{
			System.out.println("An error has occurred!");
		}

		
		finally
		{
			// executes regardless of any other code
			// always runs
			System.out.println("\nThe 'finally' block....");
		}
		System.out.println("End of program.");
		
		scnr.close();
	}

}
