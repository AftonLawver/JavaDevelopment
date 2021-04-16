
public class CheckingAccount extends BankAccount{
	static double FEE = 0.15;
	
	// Constructor
	public CheckingAccount(String name, double initialAmount) {
		super(); // invokes the parent class constructor 
		String actnum = this.getAccountNumber();
		String newAccountNumber = actnum + "-10";
		this.setAccountNumber(newAccountNumber);
		
	}
	
}
