
import java.util.Scanner;
public class Learn_Java {

	public static void main(String[] args)
	{
		printNumbers();
	}
	
	public static void isNegative()
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a valid integer: ");
		int number = myScanner.nextInt();		
		if (number < 0) {
			System.out.println("Number is negative.");
		}
		else if (number > 0) {
			System.out.println("Number is positive.");
		}
		else {
			System.out.println("Number is zero.");

		}
	}
	
	public static void printNumbers()
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = myScanner.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
		}
	}
}
