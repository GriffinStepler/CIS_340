// Griffin Stepler, CIS 340 T TH 1:30pm

public class Apple {
	
	// instance variables
	private int peelThickness;
	private double percentLeft;
	private double radius;
	
	
	// constructor 1
	public Apple()
	{
		this.percentLeft = 100;	// initializes percentLeft to 100%; a full apple
	} // Apple()
	
	
	// constructor 2
	public Apple(double radius)
	{
		this.percentLeft = 100;	// initializes percentLeft to 100%; a full apple
		this.radius = radius;	// assigns parameter value to instance variable radius
	} // Apple(radius)
	
	
	// getter for peelThickness
	public int getPeelThickness()
	{
		return this.peelThickness;
	} // getPeelThickness()
	
	
	// setter for peelThickness
	public void setPeelThickness(int value)
	{
		this.peelThickness = value;
	} // setPeelThickness()
	
	
	// getter for percentLeft
	public double getPercentLeft()
	{
		return this.percentLeft;
	} // getPercentLeft()
	
	
	// getter for radius
	public double getRadius()
	{
		return this.radius;
	} // getRadius()
	
	
	// setter for radius
	public void setRadius(double value)
	{
		this.radius = value;
	} // setRadius()
	
	
	// eat method
	public void eat(double eatenAmount)
	{
		this.percentLeft -= eatenAmount;
	} // eat()

} // class
