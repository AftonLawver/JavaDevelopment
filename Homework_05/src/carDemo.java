package src;

public class carDemo {

	public static void main(String[] args) {
		
		// Declare and instantiate a Car object
		Car myCar = new Car(2005, "Toyota");
		
		// Call the accelerate method 5 times
		// Get the speed of the car after each time accelerating
		myCar.accelerate();
		System.out.println("The speed of the car is: " + myCar.getspeed());
		myCar.accelerate();
		System.out.println("The speed of the car is: " + myCar.getspeed());
		myCar.accelerate();
		System.out.println("The speed of the car is: " + myCar.getspeed());
		myCar.accelerate();
		System.out.println("The speed of the car is: " + myCar.getspeed());
		myCar.accelerate();
		System.out.println("The speed of the car is: " + myCar.getspeed());
		
		// Call the brake method 5 times
		// Get the speed of the car after each time decelerating
		myCar.brake();
		System.out.println("The speed of the car is: " + myCar.getspeed());
		myCar.brake();
		System.out.println("The speed of the car is: " + myCar.getspeed());
		myCar.brake();
		System.out.println("The speed of the car is: " + myCar.getspeed());
		myCar.brake();
		System.out.println("The speed of the car is: " + myCar.getspeed());
		myCar.brake();
		System.out.println("The speed of the car is: " + myCar.getspeed());
		
	}

}
