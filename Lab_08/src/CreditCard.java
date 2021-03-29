
public class CreditCard {
	// Fields that are used in the credit card class. 
	// Made these private to ensure encapsulation (only access variables 
	// through public methods).
	private Person owner;
	private Money balance;
	private Money creditLimit;
	
	// Constructor that has two parameters, a Person object and a Money object
	// The constructor sets the Person object to the variable owner
	// It also creates a new Money object from the Money object limit and 
	// sets that to the variable creditLimit
	// Lastly, it sets the balance to a new Money object with 0 dollars and cents.
	public CreditCard(Person newCardHolder, Money limit) {
		owner = newCardHolder;
		creditLimit = new Money(limit);
		balance = new Money(0);
		
	}
	// Accessor methods
	// This method returns the current balance as a new money object.
	public Money getBalance() {
		return new Money(balance);
	}
	// This method returns the creditLimit as a new money object.
	public Money getCreditLimit() {
		return new Money(creditLimit);
	}
	// This method returns the owners first name, last name, and address 
	// as a string.
	public String getPersonals(){
		String ownerAsString = owner.toString();
		return ownerAsString; 
	}
	
	// Method that charges an amount to the balance, as long as the charge does not 
	// take the current balance over the credit limit. 
	// Pass in a money object to this method called amount.
	// Make a new money object called temporary balance, which is the balance 
	// plus the amount passed in the method. 
	// Then, this value is compared to the creditLimit using the compareTo method.
	// This method returns a positive integer if the creditLimit is greater than or 
	// equal to the temporary balance. 
	// This will allow the amount to be added to the balance, and 
	// a message will be displayed showing that the amount was charged. 
	// If the if statement is not true, which really means that the Temporary balance
	// is greater than the creditLimit, then there will be a printed message
	// stating that the amount exceeds the credit limit. 
	public void charge(Money amount) {
		Money temporaryBalance = new Money(balance.add(amount));
		if(creditLimit.compareTo(temporaryBalance) >= 0) {
			balance = balance.add(amount);
			System.out.println("Charge: " + amount);
		} 
		else {
			System.out.println("Exceeds credit limit.");
		}
	}
	// Method that makes a payment to the current balance.
	// it takes the Money object in as an argument, which is called amount.
	// Then, the balance is set to the balance minus that amount. 
	// Print out that the Payment was for amount passed in as argument. 
	public void payment(Money amount) {
		balance = balance.subtract(amount);
		System.out.println("Payment: " + amount );
	}
}
