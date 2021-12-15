
public class Car {
	
	// all attributes are also known as 'fields' of the class
	// any variable declared in the class-block is considered a 'field'
	// multiple instance variables, 1 static variable
	
	// properties are private by convention because the properties should be only controlled by the
	// object that they were specified during creation of
	
	private String color;
	private long mileage;
	private static String manufacturer;
	private String model;
	private int modelYear;
	private short doors;
	private String type;
	private Boolean electric;
	
	
	// methods are public by convention so they can be accessed by another class
	
	public void drive()
	{
		System.out.print("Vroom!");
	} // drive()
	
	
	public void honk()
	{
		System.out.print("HONK!");
	} // honk()
	
	
	public void brake()
	{
		
	} // brake()
	
	
	public void steer(String direction)
	{
		
	} // steer()
	
	
	public void drive(short speed)
	{
		System.out.printf("Not so fast... speed is set to %d", speed);
	} // drive()
	
	
	// setter methods, they set the value of the properties
	public void setColor(String setColor)
	{
		color = setColor;
	}
	
	
	// getter method, returns the value of properties
	public String getColor()
	{
		return color;
	}
	
} // Car class
