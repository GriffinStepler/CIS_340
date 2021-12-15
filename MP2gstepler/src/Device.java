// MP2 Griffin Stepler, CIS 340, 1:30pm

public class Device {
	
	//////////////////////////////////////
	//			Variables				//
	//////////////////////////////////////
	
	private String sku;				// device sku
	private String name;			// device name
	private String status ;			// checked in/out status
//	private static int deviceCount;	// used to count the total number of Device Objects
	
	
	//////////////////////////////////////
	//			Constructors			//
	//////////////////////////////////////
	
	// default constructor, prints construction message
	public Device()
	{
		status = "Available";
		System.out.println("A new Device has been created!");
	}
	
	
	// constructor with Name parameter, prints construction message with Name
	public Device(String name)
	{
		this.name = name;
		status = "Available";
		
		System.out.printf("A new Device called \"%s\" has been created!", name);
	}
	
	
	// sku constructor; can't be overloaded due to same input; unfortunately sku's are alphanumeric
//	public Device(String sku)
//	{
//		this.sku = sku;
//		status = "Available";
//		
//		System.out.printf("A new Device, Sku \"%s\", has been created.", sku);
//	}
	
	
	// constructor with Name and Sku parameters, prints construction message with Name and Sku
	public Device(String name, String sku)
	{
		this.name = name;
		this.sku = sku;
		status = "Available";
		
		System.out.printf("A new Device called \"%s\" with Sku \"%s\" has been created!\n", name, sku);
	}
	
	
	//////////////////////////////////////
	//			Setters/Getters			//
	//////////////////////////////////////
	
	// standard setter for Sku
	public void setSku(String sku)
	{
		this.sku = sku.toUpperCase();
	}
	
	
	// standard setter for Name
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	// used to set status of the book to status or Unstatus
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	
	// used to easily toggle the status of a Device
	// don't use without validation; otherwise a user could accidentally check out an unavailable Device
	public void toggleStatus()
	{
		if (status.equalsIgnoreCase("Available"))
			status = "Checked Out";
		else
			status = "Available";
	}
	
	
	// standard getter for Sku
	public String getSku()
	{
		return sku;
	}
	
	
	// standard getter for Name
	public String getName()
	{
		return name;
	}
	
	
	// standard getter for Status
	public String getStatus()
	{
		return status;
	}
	
	//////////////////////////////////////
	//				Methods				//
	//////////////////////////////////////
	
	// prints the Device information to the console
	public void printInformation()
	{
		System.out.printf("  %-10s %-20s %-20s", sku, name, status);
	}
	
}
