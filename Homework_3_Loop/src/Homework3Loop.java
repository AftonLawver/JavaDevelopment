
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Homework3Loop {

	public static void main(String[] args) {
		// Create an ArrayList that will hold the values the user inputs
		// Using an ArrayList because it contains methods like add(), min(), and max()
		// which will be used later in the program.
		// Create an ArrayList object that will be composed of integer objects called numbers.
		// The ArrayList class does not take values like int.
		List<Integer> numbers = new ArrayList();
		int largest;
		int number;
		int smallest;
		int counter = 0;
		
		do {
			// if the counter is greater or equal to 1, then ask prompt the user to enter another number.
			if (counter >= 1) {
				Scanner myScanner = new Scanner(System.in);
				System.out.println("Enter another number or -1 to exit: ");
				number = myScanner.nextInt();
				if (number == -1) {
					break;
					}
				else {
					// Create an Integer object from the int user input by using the integer class
					Integer x = Integer.valueOf(number);
					// Use the method add() from the ArrayList class to add the Integer object to the ArrayList
					numbers.add(x);
					counter ++;
				}
			}
			else {
				Scanner myScanner = new Scanner(System.in);
				System.out.println("Enter a number or -1 to exit: ");
				number = myScanner.nextInt();
					if (number == -1) {
						break;
						}
					else {
						// Create an Integer object from the int user input by using the integer class
						Integer x = Integer.valueOf(number);
						// Use the method add() from the ArrayList class to add the Integer object to the ArrayList
						numbers.add(number);
						counter ++;
					}
				}
		}		
		while (number != -1);
		// use the size method from the ArrayList class to get the size
		// if there are no values in the ArrayList, then print no numbers provided.
		// This will avoid getting a NullPointerException by not allowing a null ArrayList to be passed to the min and max methods.
		if (numbers.size() == 0) {
			System.out.println("No numbers provided. Please try again.");
		}
		else {
			// Use the Collections class, which comes from the java.util package.
			// This class consists of static methods that operate on or return collections.
			// https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html
			// Find the largest value in the list
			largest = Collections.max(numbers); 
			//Find the smallest value in the list
			smallest = Collections.min(numbers);
			// Display the largest and smallest to the user
			System.out.println("The largest number you entered is: " + largest);
			System.out.println("The smallest number you entered is: " + smallest);
		
		}
		
	}
}

		
	

	
	
		

		
		
		
		
		
		
		
		
		
		
		
		


