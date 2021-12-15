import java.util.Scanner;

public class testHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int numerator, denominator;
		double result;
		
		System.out.print("Enter Numerator: ");
		numerator = Integer.parseInt(scnr.nextLine());
		
		System.out.print("Enter Denominator: ");
		denominator = Integer.parseInt(scnr.nextLine());
		
			// tries to divide the two inputs, if unsuccessful and an ArithmeticException is thrown, 
		try	// proceeds to the catch block
		{
			result = (double) numerator / denominator;
			System.out.println(numerator + " / " + denominator + " = " + result);
		}
//		catch(ArithmeticException mistake)
//		{
//			System.out.println("Arithmetic exception was thrown and caught: " + mistake);
//		}
		catch(Exception mistake)
		{
			System.out.println("Exception detected: " + mistake);
		}
		
		System.out.println("End of program");
		
		scnr.close();
	}

}
