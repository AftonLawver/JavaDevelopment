import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int testScores;  // number of test scores
		int[] tests;  // declaring an array called tests that will hold the scores
		
		// Create a new scanner object that will take user input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many tests do you have? ");
		testScores = keyboard.nextInt();
		
		tests = new int[testScores];
		
		for(int i = 0; i < tests.length; i++) {
			System.out.print("Enter test score " + (i+1) + ": ");
			tests[i] = keyboard.nextInt();
		}
		
		for(int i = 0; i < tests.length; i++) {
			System.out.println("Test " + (i+1) + " score is: " + tests[i]);
		}
		// Find the minimum test score
		int minimumScore = tests[0];
		for(int i = 0; i < tests.length; i++) {
			if (tests[i] < minimumScore) {
				minimumScore = tests[i];
			}
		}
		System.out.println("The minimum test score is: " + minimumScore);
		
		// Find the maximum test score
		int maximumScore = tests[0];
		for(int i = 0; i<tests.length; i++) {
			if(tests[i] > maximumScore) {
				maximumScore = tests[i];
			}
		}
		System.out.println("The maximum test score is: " + maximumScore);
		
		// Find the average of the test scores entered
		int total = 0;
		for(int i = 0; i < tests.length; i++) {
			total = total + tests[i];
		}
		int average = total / tests.length;
		System.out.println("The average test score is: " + average);
		System.out.println("Thank you for using the automated Test Score Service!");
	}

}
