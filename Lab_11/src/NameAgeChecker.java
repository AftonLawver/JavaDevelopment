import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class NameAgeChecker {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String inputName;
		int age;
		
		inputName = scnr.next();
		
		while(!inputName.equals("-1")) {
			
			try {
			age = scnr.nextInt();
			System.out.println(inputName + " " + (age + 1));
			
			}
			catch(InputMismatchException e)
			{
				String[] myArray = inputName.split(" ");
				String firstName = myArray[0];
				
				age = 0;
				System.out.println(firstName + " " + age);
				if (scnr.hasNext()) {
					System.out.println();
					// makes scanner to discard and move to next line
					scnr.nextLine();
				}
			}
			inputName = scnr.next();
		}
	}

}
