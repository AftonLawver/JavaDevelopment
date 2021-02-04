

// Write a program to calculate the total number of eggs in 
// baskets with knowing the number of eggs per basket and the 
// number of baskets. 
// To do the calculation , collect the inputs 
// numberOfBaskets and eggsPerBasket from the user. Then, recalculate 
// the total number of eggs knowing that two eggs have been taken out of each basket.
//Follow the instruction for the case, and when you're ready, please submit one file: EggBasket.java
//The code should be tested  and run errors-free (no bugs).

import java.util.Scanner;

public class EggBasket {

	public static void main(String[] args) {
		int total;
		
		Scanner myScanner = new Scanner(System.in);
		
		// Prompt the user with how many baskets they want
		System.out.println("How many baskets will there be? ");
		
		// Collect input for numberOfBaskets 
		int numberOfBaskets = myScanner.nextInt();
		
		// Prompt the user with how many eggs per basket they want
		System.out.println("How many eggs will be in each basket? ");
		
		// Collect input for eggsPerBasket
		int eggsPerBasket = myScanner.nextInt();
		
		if (eggsPerBasket <=2) {
			total = 0;
		}
		
		else {
			total = (eggsPerBasket - 2) * numberOfBaskets;
		}
		
		System.out.println("The total number of eggs is: " + total);
		
		myScanner.close();
		

	}

}
