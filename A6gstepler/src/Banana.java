// Griffin Stepler, CIS 340 T TH 1:30pm

public class Banana {
	
	// instance variables
	private double length;
	private int peelThickness;
	private double percentLeft;
	
	
	// constructor 1
	public Banana()
	{
		this.percentLeft = 100;
	} // Banana()
	
	
	// constructor 2
	public Banana(double length)
	{
		this.percentLeft = 100;
		this.length = length;
	} // Banana(length)
	
	
	// getter for length
	public double getLength()
	{
		return this.length;
	} // getLength()
	
	
	// setter for length
	public void setLength(double value)
	{
		this.length = value;
	} // setLength
	
	
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
	
	
	// eat method
	public void eat(double eatenAmount)
	{
		this.percentLeft -= eatenAmount;
	} // eat()

} // class
