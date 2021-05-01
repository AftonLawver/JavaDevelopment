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
		
		
		
		
	}

}
