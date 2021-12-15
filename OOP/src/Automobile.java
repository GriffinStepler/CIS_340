
public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring variables of type Car (class)
		Car auto1; 
		Car auto2;
		Car auto3;
		
		// initialize/instantiate objects
		// Car() is the constructor method
		// an object is an instance of a class
		auto1 = new Car();
		auto2 = new Car();
		auto3 = new Car();
		
		auto1.setColor("White");
		
		System.out.printf("The color of auto1 is %s", auto1.getColor());
		
		auto1.drive();
		
		auto1.honk();

	}

}
