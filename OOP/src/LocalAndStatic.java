
public class LocalAndStatic {
	
	private static int x = 1;
	
	public static void scopeDemo(int param1)
	{
		for (int i = 0; i < 5; i++)
		{
			int score = param1;
			x = 45; // this can be done because x is a static (global) int
		}
	} // scopeDemo
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	} // main

} // class