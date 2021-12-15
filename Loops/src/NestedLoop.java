public class NestedLoop {
	
	public static void main(String[] args) {
		
		/* outer for loop (to print each row)
		for (int i = 0; i < 5; i++)
		{
			// inner loop
			for (int j = 0; j < 5; j++)
			{
				System.out.print("+ ");
			}
			
			System.out.println();
		}
		
		System.out.println(); 
		*/
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("+ ");
			}
			System.out.println();
		}
	}

}
