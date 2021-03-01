
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
// TASK #3 Add the file I/O import statement here
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   
   public static void main(String[] args) throws IOException
   {
	  
	  
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line;         // To hold a line from the file
      double difference;   // The value and mean difference

      
      Scanner keyboard = new Scanner (System.in);  // Create an object of type Scanner
      String filename;     // The user input file name

      // Prompt the user and read in the file name
      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();

      // ADD LINES FOR TASK #4 HERE
      // Create a FileReader object passing it the filename
      FileReader myReader = new FileReader(filename);  			
      
      // Create a BufferedReader object passing FileReader object
      BufferedReader myBuffer = new BufferedReader(myReader);  
      
      // Perform a priming read to read the first line of the file													
      String firstLine = myBuffer.readLine();        			
      

      line = myBuffer.readLine();
      // Loop until you are at the end of the file
      while (line != null) {  									
    	  // Convert the line to a double value and add the value to sum
	      sum += Double.parseDouble(line);

	      // Increment the counter
	      count++;  
	      
	      // Read a new line from the file
	      line = myBuffer.readLine(); 										
      }
      
      // Close the input file
      myBuffer.close();  										
      myReader.close();
      
      // Store the calculated mean
      mean = sum/count; 										 
     
      // ADD LINES FOR TASK #5 HERE
      // Reconnect FileReader object passing it the filename
      FileReader myReader2 = new FileReader(filename);  
      
      // Reconnect BufferedReader object passing FileReader object
      BufferedReader myBuffer2 = new BufferedReader(myReader2); 
      
      // Reinitialize the sum of the numbers
      sum = 0;   						
      
      // Reinitialize the number of numbers added
      count = 0; 	
      
      // Perform a priming read to read the first line of the file
      line = myBuffer2.readLine();  	
      
      // Loop until you are at the end of the file
      while (line != null) {  									
    	  // Convert the line into a double value and subtract the mean
    	  difference = Double.parseDouble(line) - mean;  
    	  
    	  // Add the square of the difference to the sum
    	  sum += Math.pow(difference, 2); 
    	  
    	  // Increment the counter
    	  count ++; 	
    	  
    	  // Read a new line from the file
    	  line = myBuffer2.readLine();									
    	  
      }
      // Close the input file
      myBuffer2.close();
	  myReader2.close();	
	  
	  // Store the calculated standard deviation
	  stdDev = Math.sqrt(sum/count);							
      

      // ADD LINES FOR TASK #3 HERE
      // Create a FileWriter object using "Results.txt"
	  File file = new File("Results.txt");
      FileWriter myfilewriter = new FileWriter(file);	
      
      // Create a PrintWriter object passing the FileWriter object
      PrintWriter writer = new PrintWriter(myfilewriter);	
      
      // Print the results to the output file			
      writer.print("The mean is: ");							
      writer.printf("%.3f", mean);
      writer.println();
      writer.print("The standard deviation is: ");
      writer.printf("%.3f", stdDev);
      
       // Close the output file
      myfilewriter.close();										
      writer.close();
   }
}