// StudentManagementSystem Griffin Stepler, CIS 340, T TH 1:30pm

public class Student {
	
	private String name;				// name of the student
	private String id;					// ID of the student
	
	
	// constructor method for Student with no arguments
	public Student()
	{
		System.out.println("\nA student has been created.\n");
	} // Student constructor, no args
	
	// constructor method for Student object with only Name
	public Student(String name)
	{
		this.name = name;	// assigns student name to object
		System.out.printf("\nA new student, %s, has been created.\n", name);	// outputs name to console
	} // Student Constructor, name only
	
	
	// constructor method for Student object with Name and ID
	public Student(String name, String id)
	{
		this.name = name;	// assigns student name to object
		this.id = id;		// assigns student id to object
		System.out.printf("\nA new student, %s, with ID #%s has been created.\n", name, id);	// outputs name and id to console
	} // Student constructor, name AND id
	
	
	// standard getter method for name
	public String getName()
	{
		return this.name;
	} // getName()
	
	
	// standard setter method for name
	public void setName(String name)
	{
		this.name = name;
	} // setName()
	
	
	// standard getter method for ID
	public String getID()
	{
		return this.id;
	} // getID()
	
	
	// standard setter method for ID
	public void setID(String id)
	{
		this.id = id;
	} // setID()
	
	
	// prints student name and id
	public void printInformation()
	{
		System.out.printf("%-20s %-20s", name, id);
	} // printInformation()
	
} // class
