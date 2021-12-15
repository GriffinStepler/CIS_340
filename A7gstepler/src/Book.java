// Griffin Stepler, CIS 340, T TH 1:30pm

public class Book {
	
	
	//////////////////////////////////////////
	//				Class Variables			//
	/////////////////////////////////////////
	
	private String title;	// title of the book
	private int year;		// publishing year of the book
	
	
	
	//////////////////////////////////////////
	//				Constructors			//
	/////////////////////////////////////////
	
	// 0 arguments
	// prints a creation confirmation statement
	public Book()
	{
		System.out.println("\nA new Book has been created.\n");
	} // Book()
	
	
	// 1 argument: title
	// prints a creation confirmation statement, includes book title
	public Book(String title)
	{
		// set title based on argument
		this.title = title;
		
		System.out.printf("A new Book \"%s\" has been created.\n", title);
	} // Book()
	
	
	// 2 arguments: title, year
	// prints a creation confirmation statement, includes book title and year
	public Book(String title, int year)
	{
		// set year and title based on arguments
		this.title = title;
		this.year = year;
		checkYear();
		
		System.out.printf("A new Book \"%s\" published in %d has been created.\n", title, year);
	} // Book()
	
	
	
	//////////////////////////////////////////
	//			Getters and Setters			//
	/////////////////////////////////////////
	
	// title getter
	public String getTitle()
	{
		return title;
	} // getTitle
	
	
	// year getter
	public int getYear()
	{
		return year;
	} // getYear()
	
	
	// title setter
	// prints confirmation message, includes title
	public void setTitle(String title)
	{
		this.title = title;
		System.out.printf("\nTitle set to \"%s\"", title);
	} // setTitle()
	
	
	// year setter
	// prints confirmation message, includes title
	public void setYear(int year)
	{
		if (year >= 1100 && year <= 2021)
		{
			this.year = year;
			System.out.printf("\nYear set to %d \n", year);
		}
		else
		{
			this.year = 1900;
			System.out.printf("\nInput Year invalid. Year set to %d \n", year);
		}
		
	} // setYear()
	
	
	
	//////////////////////////////////////////
	//			Additional Methods			//
	/////////////////////////////////////////
	
	// checks for valid year value 
	// invoked by Book(title, year) constructor
	// can be used for debugging/verification outside of being called in Book(title, year)
	public void checkYear()
	{
		if (year > 2021 || year < 1100)
			year = 1900;
	} // checkYear()
	
	
	// prints Book title and year
	// allows space for up to 60 title characters (adjustable)
	public void printInformation()
	{
		System.out.printf("%-60s %-4d", title, year);
	} // printInformation()

} // Book Class
