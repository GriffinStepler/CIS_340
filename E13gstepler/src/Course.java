// E13 Griffin Stepler, CIS 340, T TH 1:30pm

public class Course {
	
	private String coursePrefix;
	private int courseNumber;
	private static String collegeName;
	private double classAverage = 0.0;
	
	
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
		Course.collegeName = collegeName;	// fully qualified variable name
	} // setCollegeName
	
	
	public double getClassAverage()	// this is read-only; it has no setter method
	{
		return classAverage;
	} //getClassAverage

} // class
