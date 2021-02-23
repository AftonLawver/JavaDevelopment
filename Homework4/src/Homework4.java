import java.util.Random;

public class Homework4 {

	public static void main(String[] args) {
		// declare variable i for for loop
		int i;
		// declare and initialize variables for evens and odds
		int evens = 0;
		int odds = 0; 
		
		// Make an object called random from the random class
		Random random = new Random();
		
		// Create a for loop that will loop 100 times through the block of code
		// will loop through generating random number, checking if it is even
		// or odd through calling the isEven method, and counting it as 
		// either even or odd. 
		for (i=1; i<=100; i++) {
			int num = random.nextInt();
			if (isEven(num)) {
				evens = evens +1;
			}
			else {
				odds = odds + 1;
			}
			
			
		}
		// print out the total number of even and odd numbers generated
		System.out.println("The total number of even numbers is: " + evens );
		System.out.println("The total number of odd numbers is: " + odds );

	}
	// Method that checks if a number is even or odd
	public static boolean isEven(int num) {
		
		// if the number divided by two has a remainder of zero, it is even.
		if (num % 2 == 0) {
			return true;
		} 
		else {
			return false;
		}
		
		
	}

}
