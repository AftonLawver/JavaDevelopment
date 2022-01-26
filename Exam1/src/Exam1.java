import java.util.Scanner;

/**
 * @author Afton Lawver
 */

public class Exam1 {

	public static void main(String[] args) {
		int year;
		// Create a new scanner object called myScanner 
		// to take user input for the year
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		// Try block for exception handling in case user does not
		// give a valid integer as input
		try {
			year = myScanner.nextInt();
		// If method isLeapYear returns true, then print out 
		// the year is a leap year.
			if (isLeapYear(year)) {
				System.out.println(year + " is a leap year.");
				}
			else {
				System.out.println(year + " is not a leap year.");
				}
		}
		// Catch the exception and prompt the user to provide valid integer
		catch (Exception e) {
			System.out.println("Please provide valid integer.");
		}
	}
	
	// Method that check if a year is a leap year or not
	// Made method private because it only needs to be accessible by 
	// this class. 
	private static boolean isLeapYear(int year) {
		// Initialize variables needed
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		else {
			return false;
		}		
	}
}
