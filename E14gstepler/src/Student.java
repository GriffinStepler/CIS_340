
public class Student {
	
	private static int studentCount;	// count of all student objects created
	private String name;				// name of the student
	private String id;					// ID of the student
	
	
	// constructor method for Student object with only Name
	public Student(String name)
	{
		this.name = name;	// assigns student name to object
		studentCount++;		// increments studentCount
		System.out.printf("\nA new student, %s, has been created.", name);	// outputs name to console
		System.out.printf("\nThere are now %d student(s) in the system.", studentCount);	// outputs studentCount to console
	} // Student Constructor, name only
	
	
	// constructor method for Student object with Name and ID
	public Student(String name, String id)
	{
		this.name = name;	// assigns student name to object
		this.id = id;		// assigns student id to object
		studentCount++;		// increments studentCount
		System.out.printf("\nA new student, %s, with ID #%s has been created.", name, id);	// outputs name and id to console
		System.out.printf("\nThere are now %d student(s) in the system.", studentCount); // outputs studentCount to console
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
	
	
	// static getter method for studentCount
	public static int getStudentCount()
	{
		return studentCount;
	} // getStudentCount()
	
} // class
