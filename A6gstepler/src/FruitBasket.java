// Griffin Stepler, CIS 340 T TH 1:30pm

import java.util.Scanner;

public class FruitBasket {
	
	// instance variables
	private Apple apple;
	private Banana banana;
	private String basketName;
	
	Scanner scnr = new Scanner(System.in);
	
	// this method returns the basket name to the user
	public String getBasketName()
	{
		return this.basketName;
	} // getBasketName()
	
	
	// setter for basketName
	public void setBasketName(String basketName)
	{
		this.basketName = basketName;
	} // setBasketName()
	
	
	// this method creates fruit objects
	public void makeFruits()
	{
		// instantiating apple and banana objects
		apple = new Apple(1.5);		// radius 1.5
		banana = new Banana(3.5); 	// length 3.5
		
		// setting peelThickness for both objects
		apple.setPeelThickness(1);
		banana.setPeelThickness(4);
	} // makeFruits
	
	
	// this method eats fruits
	public void eatFruits()
	{
		double amountToEat;
		
		// print basket name to console
		System.out.printf("\n\t\t***%s***\n", this.basketName.toUpperCase());
		System.out.printf("You have an apple and banana in your %s basket.", this.basketName);
		
		// user input for apple.eat()
		System.out.print("\nWhat percentage of the apple would you like to eat? ");
		amountToEat = Double.parseDouble(scnr.nextLine());
		apple.eat(amountToEat);
		
		// user input for banana.eat()
		System.out.print("What percentage of the banana would you like to eat? ");
		amountToEat = Double.parseDouble(scnr.nextLine());
		banana.eat(amountToEat);
		
		// output to users how much fruit remains
		System.out.printf("\nYou have %.2f of your apple and %.2f of your banana left in your %s basket\n", apple.getPercentLeft(), banana.getPercentLeft(), basketName);
	} // eatFruits

} // class
