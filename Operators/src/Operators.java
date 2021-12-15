
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		int score1 = 0;
		int score2 = 0;
		int total = 0;
		
		double avg = 0.0;
		
		int modResult = 0;
		
		score1 = 5;
		score2 = 6;
		
		total = score1 + score2;
		
		avg = total / 2.0;
		// avg = (double) total / 2;
		
		System.out.printf("Average is %.2f, Total is %d.", avg, total);
		
		modResult = score1 % score2;
		// you can declare a variable with it's true value, rather than initializing first with 0
		
		System.out.printf("\nscore1 %% score2 is %d", modResult);
		
		int x = 0;
		
		x++;
		
		x = x + 5;
		
		x += 5;
		// compound operator, adds x to 5 and makes that the new value of x
		
		x -= 5;
		
		System.out.printf("\nx is %d", x);		
		**/
		
		int age = 26;
		char hasLicense = 'Y';
		boolean canRent = false;
		
		if (age < 18 || hasLicense == 'N')
		{
			canRent = false;
		}
		else 
			if (age >= 18 && age < 25)
			{
			canRent = false;
			}
			else
			{
				canRent = true;
			}
		
		if (canRent == true) 
			// can also be written as " if (canRent) " because that tests the value of canRent
		{
			System.out.print("You are eligible to rent a car!");
		}
		else 
		{
			System.out.print("You are not allowed to rent a car.");
		}
		
	}

}
