
public class Lifespan {
	
	// static variable, accessible to all methods of the class
	private static int x = 1;
		
	public static void main(String[] args)
	{
		int x = 5;
		
		System.out.printf("Local x in main(): %d \n", x);
		
		useLocalVariable();
		useStaticVariable();
		
		useLocalVariable();
		useStaticVariable();
		
		System.out.printf("Local x in main(): %d \n", x);
		
	} // main()
		
	private static void useLocalVariable()
	{
		int x = 25;
		
		System.out.println();
		System.out.printf(" Local x upon entering useLocalVariable(): %d \n", x);
		
		x = x + 1;
		
		System.out.printf(" Local x upon exiting useLocalVariable(): %d \n", x);
		
	} // useLocalVariable()
		
	private static void useStaticVariable()
	{
		// there is no local variable x here! 
		
		System.out.println();
		System.out.printf(" Static x upon entering useStaticVariable(): %d \n", x);
		
		x = x * 10;
		
		System.out.printf(" Static x upon exiting useStaticVariable(): %d \n", x);
			
	} // useStaticVariable()

} // class
