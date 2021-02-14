package tester;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ReadingAndWritingFiles {

	public static void main(String[] args) {
		 
		// export that file (basically create a new file from an old file)
		
		try {

			File file = new File("names.txt");
		
			if (!file.exists()) {
				file.createNewFile();
			}
			
			else {
				Scanner myScanner = new Scanner(file);
		
				String fileContents = "This is a new file made by java" + "\n";
		
				while (myScanner.hasNextLine()) {
			
					fileContents = fileContents.concat(myScanner.nextLine() + "\n");
				}
		
				PrintWriter writer = new PrintWriter("newnames.txt");
				writer.println(fileContents);
				writer.println("Alliyah");
				writer.close();
				myScanner.close();
				System.out.println("Done");
				
			}
			 
		
		
				
		
			}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
		
		
		
		
		




