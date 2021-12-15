// Griffin Stepler, CIS 340 T TH 1:30pm

public class PicnicSystem {

	public static void main(String[] args) 
	{
		PicnicSystem myPicnicSystem = new PicnicSystem();
		myPicnicSystem.makeFruitBaskets();
	} // main()
	
	
	// this method creates fruit basket objects
	private void makeFruitBaskets()
	{
		// declaring and instantiating 2 FruitBasket objects
		FruitBasket basket1 = new FruitBasket();
		FruitBasket basket2 = new FruitBasket();
		
		// setting values for basket1 and basket2
		basket1.setBasketName("Weekend");
		basket2.setBasketName("Weekday");
		
		// creating fruit objects for each basket
		basket1.makeFruits();
		basket2.makeFruits();
		basket1.eatFruits();
		basket2.eatFruits();
	} // makeFruitBaskets()

} // class
