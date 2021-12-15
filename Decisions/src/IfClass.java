
import java.util.Scanner;

public class IfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// under 18, can't drive
		// at 18, can drive
		// at 25, can rent
		
		int age = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		age = Integer.parseInt(scnr.nextLine());
		
		if (age < 18) {
			System.out.printf("You are %d; you can't drive a car yet.", age);
			System.out.println("Perhaps you will be able to soon.");
		}
		else if (age >= 18) & (age < 25);
		
		scnr.close();
	}

}
