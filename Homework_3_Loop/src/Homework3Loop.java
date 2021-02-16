import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;


public class Homework3Loop {

	public static void main(String[] args) {
		List numbers = new ArrayList();
		int largest;
		int number;
		int smallest;
		int counter = 0;
		
		do {
			if (counter >= 1) {
				Scanner myScanner = new Scanner(System.in);
				System.out.println("Enter another number or -1 to exit: ");
				number = myScanner.nextInt();
				if (number == -1) {
					break;
				}
				numbers.add(number);
				counter ++;
			}
		
			else {
			
					
				Scanner myScanner = new Scanner(System.in);
				System.out.println("Enter a number or -1 to exit: ");
				number = myScanner.nextInt();
				
					if (number == -1) {
					break;
					}

				}
				numbers.add(number);
				counter ++;

		}		
		while (number != -1);
		
		//Sort the list
		Collections.sort(numbers); 
		if (numbers.size() == 0) {
			System.out.println("No numbers provided. Please try again.");
		}
		else {
			// Find the largest of the list
			largest = (int) numbers.get(numbers.size() - 1); 
			
			//Find the smallest of the list
			smallest = (int) numbers.get(0);
			
			// Display the largest and smallest to the user
			System.out.println("The largest number you entered is: " + largest);
			System.out.println("The smallest number you entered is: " + smallest);
		
		}
		
	}
}

		
	

	
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List <Integer> numbers = new ArrayList<>();
//		int input;
//		
//		do {
//			Scanner myScanner = new Scanner(System.in);
//			if (numbers.size() >= 1) {
//				System.out.println("Enter another number: ");
//				input = myScanner.nextInt();
//				numbers.add(input);
//			}
//			System.out.println("Enter a number or enter -1 to exit: ");
//			input = myScanner.nextInt();
//			numbers.add(input);
//			
//			 
//		}
//		while (input != -1);
		
		
		//System.out.println("The total is: " + total);

	

