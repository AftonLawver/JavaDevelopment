
public class CreditCard {
	
	private Person owner;
	
	private Money balance;
	
	private Money creditLimit;
	
	public CreditCard(Person newCardHolder, Money limit) {
		owner = newCardHolder;
		creditLimit = new Money(limit);
		balance = new Money(0);
		
	}
	
	public Money getBalance() {
		return new Money(balance);
	}
	
	public Money getCreditLimit() {
		
		return new Money(creditLimit);
	}
	
	public String getPersonals(){
		String ownerAsString = owner.toString();
		return ownerAsString; 
	}
	
	public void charge(Money amount) {
		Money temporaryBalance = new Money(balance.add(amount));
		if(creditLimit.compareTo(temporaryBalance) > 0) {
			balance = balance.add(amount);
			System.out.println("Charge: " + amount);
		} 
		else {
			System.out.println("Exceeds credit limit.");
		}
	}
	public void payment(Money amount) {
		balance = balance.subtract(amount);
		System.out.println("Payment: " + amount );
	}
}
