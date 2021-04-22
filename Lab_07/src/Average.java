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
			System.out.print("Enter score " + score + ": ");
			score++;
			int num = myScanner.nextInt(); // Read User Input
			data[i] = num; 
		}
		
		this.selectionSort();
		this.calculateMean();
		myScanner.close();		
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
		mean = total/data.length; // calculate the mean
	}
	
	/**
	 * Method that returns a string containing data in descending order
	 * and the mean.
	 */
	public String toString() {
		
		String output;
		output = "The test scores in descending order are \n";
		
		for(int i = 0; i < data.length; i++)
		{
			output = output + data[i] + " ";
		}
		output = output + "\nThe average is " + mean;
		System.out.println(output);
		return output;
		
		}

	/**
	 * Method uses the selection sort algorithm to rearrange
	 * the data set from highest to lowest.
	 */
	public void selectionSort() {
		for (int i = 0; i < data.length - 1; i++) {
			
			
			int maxElementIndex = i;
			for (int j = i + 1; j<data.length; j++) {
				if(data[maxElementIndex] < data[j]) {
					maxElementIndex = j;
				}
			}
			
			
			if (maxElementIndex != i) {
				int temp = data[i];
				data[i] = data[maxElementIndex];
				data[maxElementIndex] = temp;
			}
		}
		
	}
	
}
