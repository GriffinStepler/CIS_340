
public class Formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstNameA = "Bill";
		String lastNameA = "Richardson";
		
		String firstNameB = "Elizabeth";
		String lastNameB = "Ray";
		
		// positive values give leading spaces, negative values give trailing spaces
		System.out.printf("%-10s %-10s\n", firstNameA, lastNameA);
		System.out.printf("%-10s %-10s\n", firstNameB, lastNameB);

	}

}
