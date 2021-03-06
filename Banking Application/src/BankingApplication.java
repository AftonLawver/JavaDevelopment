import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		BankAccount object1 = new BankAccount("Afton", "1234");
		object1.showMenu();
	}

}

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	// Constructor
	// Has the same name as the class
	// Has no return type
	BankAccount(String cname, String cid)
	{
		customerName = cname;
		customerId = cid;
	}
	
	// First method called deposit
	// Takes an int called an amount as parameter
	// If the amount is greater than 0, then add the amount to the balance
	// Also, set the previousTransaction to amount
	void deposit(int amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	// Second method called withdraw
	// Takes an int called amount as parameter
	// If the amount is greater than 0, then minus this amount
	// from the current balance
	// Set the previousTransaction to the amount (negated)
	void withdraw(int amount)
	{
		if(amount > 0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	// Method called getPreviousTransaction 
	// if the previous transaction is greater that 0,
	// this means that it was a deposit
	// otherwise, if the previous transaction was less than 0,
	// it means that it was a withdraw. 
	// If neither of these conditions occurred, then display that 
	// no transaction occurred.
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited: " + previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No transaction occured.");
		}
	}
	
	// Method called showMenu
	// Will occur when the program starts until the user enters E
	// This method displays different letters for options and
	// the user must input an letter based on what they are trying to do.
	void showMenu()
	{
		char option = '\0';
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is " + customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do 
		{
			System.out.println("================================================");
			System.out.println("Enter an option");
			System.out.println("================================================");
			option = myScanner.next().charAt(0);
			System.out.println("\n");
			
			// Switch case that encompasses all cases that the user can choose.
			// If the user enters A, the balance will display.
			// If the user enters B, the user will be prompted to enter an amount to deposit.
			// If the user enters C, the user will be prompted to enter an amount to withdraw.
			// If the user enters D, the most previous transaction will show.
			// The default value will fire when none of the cases are met. 
			// If the user enters E, the program will terminate.
			switch(option)
			{
			
			case 'A':
				System.out.println("--------------------------------------------");
				System.out.println("Balance = " + balance);
				System.out.println("---------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("---------------------------------------------");
				System.out.println("Enter an amount to deposit:");
				System.out.println("---------------------------------------------");
				int amount = myScanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("---------------------------------------------");
				System.out.println("Enter an amount to withdraw:");
				System.out.println("---------------------------------------------");
				int amount2 = myScanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("---------------------------------------------");
				getPreviousTransaction();
				System.out.println("---------------------------------------------");
				System.out.println("\n");
				break;
			
			default: 
				System.out.println("Invalid Option! Please enter again.");
				break;
			}	
		}
		while(option != 'E');
		
		System.out.println("Thank You for using our services.");
	}
	
	
	
	
	
	
	
	
	
	
}
