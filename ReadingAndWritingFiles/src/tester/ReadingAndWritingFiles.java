package tester;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.JOptionPane;
import java.io.IOException;

public class ReadingAndWritingFiles {

	public static void main(String[] args) {
		// Create a blank txt file named names.txt
		// ask the user for 5 names to add to the file
		// once the user inputs 5 names, add these names to the file
		// after adding them, ask the user to enter his/her name
		// change the 3rd name to his/her name
		// save the file.
		
		// Create the text file if it does not already exist
		try {
			File fileName = new File("names.txt");
		
		if (fileName.createNewFile()) {
			System.out.println("File Created: " + fileName.getName());
			
		}
		else {
			System.out.println("File already exists.");
		}
		
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		// Ask the user for input of five names
		// Another idea for this part is to create a method
		// that loops through 5 times asking for a name. (for loop).
		Scanner myScanner = new Scanner(System.in);
		List names = new ArrayList();
		do {
			System.out.println("Enter a name: ");
			String name = myScanner.nextLine();
			names.add(name);
		}while (names.size() < 5);
		
		// take the list of names and write them to the newly created file
		try {
			Path out = Paths.get("names.txt");
			FileWriter myWriter = new FileWriter("names.txt");
			Files.write(out, names, Charset.defaultCharset());
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		System.out.println("Enter your name: ");
		String userName = myScanner.nextLine();
		try {
			Path out = Paths.get("names.txt");
			Scanner s = new Scanner(new File("names.txt"));
			ArrayList<String> list = new ArrayList<String>();
			while (s.hasNext()) {
				list.add(s.next());
			}
			s.close();
			list.set(2, userName);
			Files.write(out, list, Charset.defaultCharset());
			System.out.println("Successfully wrote the new file.");
		} catch (IOException ex) {
			System.out.println("An error occurred.");
			ex.printStackTrace();
		}
		
		
		
		
		
		
}
}

		
		
		
		
		




