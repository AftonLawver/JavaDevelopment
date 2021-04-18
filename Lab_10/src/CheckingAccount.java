
public class CheckingAccount extends BankAccount{
	static double FEE = 0.15;
	
	// Constructor
	public CheckingAccount(String name, int initialAmount) {
		super(name, initialAmount); // invokes the parent class constructor 
		String actnum = this.getAccountNumber();
		String newAccountNumber = actnum + "-10";
		this.setAccountNumber(newAccountNumber);
		
	}

	public boolean withdraw(double amount) {
		FEE = FEE + amount;
		boolean x = super.withdraw(FEE);
		return x;
	}
	
}
