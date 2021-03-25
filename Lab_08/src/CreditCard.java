
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
		Money balance1 = new Money(balance);
		return balance1;
	}
	
	public Money getCreditLimit() {
		Money creditCardLimit = new Money(creditLimit);
		return creditCardLimit;
	}
	
	public String getPersonals(){
		String ownerAsString = owner.toString();
		return ownerAsString; 
	}
	
	public void charge(Money amount) {
		
	}
	
	public void payment(Money amount) {
		
	}
}
