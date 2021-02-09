import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScoresAndGrades {

	public static void main(String[] args) {
		Scanner myScanner; 
		double average;
		char grade;
		double score1 = -1;
		double score2 = -1;
		double score3 = -1;
		boolean sentinel = false;
		
		myScanner = new Scanner(System.in);
		try {
			System.out.println("Enter the value for score 1: ");
			score1 = myScanner.nextDouble(); 
					
			System.out.println("Enter the value for score 2: ");
			score2 = myScanner.nextDouble(); 
			
			System.out.println("Enter the value for score 3: ");
			score3 = myScanner.nextDouble();
			sentinel = true;
		}
		catch (InputMismatchException e) {
			System.out.println("Please provide a valid number.");
		}
		 
		if (sentinel == true) {
			average = (score1 + score2 + score3)/3;
			System.out.println("The average percentage for the three tests is " + average);
			
			if (average >= 90) {
				grade = 'A';
			}
			
			else if (average >= 80 && average < 90) {
				grade = 'B';
			}
			
			else if (average >= 70 && average < 80) {
				grade = 'C';
			}
			
			else if (average >= 60 && average < 70) {
				grade = 'D';
			}
			
			else {
				grade = 'F';
			}
			
			System.out.println("Your average grade for the three exams is " + grade);
			
		}
		else {
			System.out.println("Try again.\nProgram Exiting...");
		}
		
		myScanner.close();
		
	}

}
