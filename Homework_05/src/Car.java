
public class Car {

	private int yearModel;
	private String make;
	private int speed;
	
public Car(int y, String m) {
	yearModel = y;
	make = m;
	speed = 0;
}

// Accessor methods
// This method returns the current year of the car as an integer value
public int getyearModel() {
	return yearModel;
}
// This method gets the make of the car and returns it as a string.
public String getmake() {
	return make;
}
// This method gets the current speed of the car and returns it as an integer.
public int getspeed() {
	return speed;
}

// Mutator methods

public void accelerate() {
	speed += 5;
}

public void brake() {
	speed -= 5;
}


}
