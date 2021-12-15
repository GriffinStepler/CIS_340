
import java.util.Scanner;


public class BasicIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName = "";
		final double PI = 3.141592;
		int userAge = 0;
		double userGPA = 0.0;
		String userStuff = "";
		
		// create a Scanner object for reading input
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("What's your name? ");
		userName = scnr.nextLine();
		System.out.println("Hello " + userName + ". Welcome!");
		
		System.out.print("How old are you? ");
		//userAge = scnr.nextInt();
		userAge = Integer.parseInt( scnr.nextLine() );
		System.out.println("You're " + userAge + " years old? I'm not even a year old!");
		
		System.out.print("What about your GPA?? ");
		//userGPA = scnr.nextDouble();
		userGPA = Double.parseDouble( scnr.nextLine() );
		System.out.println("Your GPA is " + userGPA);
		
		/*
		System.out.print("Type anything I guess... ");
		userStuff = scnr.nextLine();
		// Because we used parse lines, we avoided the Enter buffer issue
		// If we didn't, we would have to add another nextLine to yoink the buffering Enter
		System.out.println("You typed " + userStuff);
		*/
		
		System.out.printf("%s, \nyou are %d years old and your GPA is %.2f!", userName, userAge, userGPA);
		
		scnr.close();

	}

}
