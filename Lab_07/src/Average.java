import java.util.Scanner;

public class Average {
	// Private attributes
	private int data[]; // the array that will contain the scores
	private double mean; // the arithmetic average of the scores
	
	/**
	 * Constructor
	 */
	public Average() {
		Scanner myScanner = new Scanner(System.in); // Create a Scanner Object
		data = new int[5]; // allocating memory to the array
		int score = 1;
		for(int i=0; i<5; i++) {
			System.out.println("Enter score " + score + ": ");
			score++;
			int num = myScanner.nextInt(); // Read User Input
			data[i] = num; 
		}
		selectionSort();
		calculateMean();
		
	}
	
	// Public Methods
	
	/**
	 * Method that will add up all of the scores in the array and 
	 * find the average of those scores.
	 */
	public void calculateMean() {
		int total = 0;
		for(int i=0; i < data.length; i++) {
			int number = data[i];
			total = total + number;
		}
		int mean = total/data.length; // calculate the mean
	}
	
	/**
	 * Method that returns a string containing data in descending order
	 * and the mean.
	 */
	public String toString() {
		
			
		}
		
	}
	
	/**
	 * Method uses the selection sort algorithm to rearrange
	 * the data set from highest to lowest.
	 */
	public void selectionSort() {
		int n = data.length;
		
		for (int i = 0; i < n-1; i++) {
			// Find the minimum element in the unsorted array
			int minimum = i;
			for (int j = i + 1; j<n; j++) {
				if(data[j]<data[minimum]) {
					minimum = j;
				}
				
			// Swap the found minimum element with the first element
			int temp = data[minimum];
			data[minimum] = data[i];
			data[i] = temp;
					
			}
		}
	}
	
}
