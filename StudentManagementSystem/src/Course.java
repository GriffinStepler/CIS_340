// StudentManagementSystem Griffin Stepler, CIS 340, T TH 1:30pm

import java.util.ArrayList;

public class Course {
	
	// class instance and static variables
	private String coursePrefix;
	private int courseNumber;
	private static String collegeName;			
	private double classAverage = 0.0;			// per course average
	private ArrayList<Student> studentRoster;	// per course student roster
	private int studentCount;					// per course student count
	
	
	// course constructor
	public Course()
	{
		studentRoster = new ArrayList<>();
	} // course constructor
	
	
	// displays a "welcome to course" message
	public void displayMessage()
	{
		System.out.printf("Welcome to %s %d!", coursePrefix, courseNumber);
	} // displayMessage()
	
	
	public String getCoursePrefix()
	{
		return coursePrefix.toUpperCase();
	} // getCoursePrefix()
	
	
	public void setCoursePrefix(String coursePrefix)
	{
		this.coursePrefix = coursePrefix;	// this keyword refers to the current object
	} // setCoursePrefix()
	
	
	public int getCourseNumber()
	{
		return courseNumber;
	} // getCourseNumber()
	
	
	public void setCourseNumber(int courseNumber)
	{
		this.courseNumber = courseNumber;
	} // setCourseNumber()
	
	
	public String getCollegeName()
	{
		return collegeName;
	} // getCollegeName
	
	
	public static void setCollegeName(String collegeName)
	{
		Course.collegeName = collegeName;	// fully qualified variable name, this. would be used for non-static variables
	} // setCollegeName()
	
	
	public double getClassAverage()	// this is read-only; it has no setter method
	{
		return classAverage;
	} //getClassAverage()
	
	
	public ArrayList<Student> getStudentRoster()
	{
		return studentRoster;
	} // getStudentRoster()
	
	
	public int getStudentCount()
	{
		return studentCount;
	}
	
	
	// adds a student to the course
	// creates a Student object and returns it for attribute configuration
	public Student add()
	{
		Student tmpStudent = new Student();
		studentRoster.add(tmpStudent);
		studentCount++;
		return tmpStudent;
	} // add()
	
	
	// *OVERLOAD* adds a student to the course
	// requires Student object to be supplied as an argument
	public void add(Student student)
	{
		studentRoster.add(student);	// adds parameter to ArrayList
		studentCount++;
	} // add()
	
	
	// prints the entire roster of a Course
	public void printRoster()
	{
		for (Student s : studentRoster)
		{
			s.printInformation();	// invokes the Student printInformation() method to print
			System.out.println();
		}
	} // printRoster()

} // class
