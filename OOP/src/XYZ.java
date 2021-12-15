
public class XYZ {

	public static void main(String[] args)
	{
		XYZ myXYZObj = new XYZ();
		
		// invoke the loadData() method
		// but main() is static, 
		// loadData cannot be called unless it's associated with a specific object
		myXYZObj.loadData();
		
		XYZ my2ndXYZObj = new XYZ();
		my2ndXYZObj.loadData();
	} // main()
	
	
	// a fictitious data loading method
	// this is an instance method; it lacks the static keyword
	public void loadData()
	{
		
	} // loadData()

}
