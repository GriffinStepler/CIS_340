// E13 Griffin Stepler, CIS 340, T TH 1:30pm

import java.util.Scanner;

public class CourseApp {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		// declaring and instantiating two Course objects
		Course courseOne;
		Course courseTwo;
		courseOne = new Course();
		courseTwo = new Course();
		
		// setting static variable collegeName
		Course.setCollegeName("ASU");	// static method/variable; accessed through class name
		
		
		// there is no way to set the courseAverage
		// courseOne.courseAverage = 85;
		// it's a private variable without a setter method, therefore it's read-only outside of the class definition
		
		
		// setting/getting for courseOne
		System.out.print("Please enter the first course prefix: ");
		courseOne.setCoursePrefix(scnr.nextLine());
		
		System.out.print("Please Enter the course number: ");
		courseOne.setCourseNumber(Integer.parseInt(scnr.nextLine()));
		
		System.out.printf("\nA new course was created for %s %d at %s.\n", courseOne.getCoursePrefix(), courseOne.getCourseNumber(), courseOne.getCollegeName());
		courseOne.displayMessage();
		
		
		// setting/getting for courseTwo
		System.out.print("\n\nPlease enter the second course prefix: ");
		courseTwo.setCoursePrefix(scnr.nextLine());
		
		System.out.print("Please enter the course number: ");
		courseTwo.setCourseNumber(Integer.parseInt(scnr.nextLine()));
		
		System.out.printf("\nA new course was created for %s %d at %s.\n", courseTwo.getCoursePrefix(), courseTwo.getCourseNumber(), courseTwo.getCollegeName());
		courseTwo.displayMessage();
		
		
		scnr.close();
		
	} // main()

}
