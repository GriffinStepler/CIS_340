// E0; G. Stepler; CIS 340 T/Th 1:30pm

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		String userName = "";
		
		System.out.println("Hello World!");
		
		System.out.print("What's your name? ");
		
		Scanner scnr = new Scanner(System.in);
		
		userName = scnr.nextLine();
		
		System.out.println("Hi " + userName + ". See you around!");
		
		scnr.close();
		

	}

}
