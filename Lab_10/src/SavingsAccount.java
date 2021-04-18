
public class SavingsAccount extends BankAccount  {
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	
	// Constructor
	public SavingsAccount(String name, int initialBalance) {
		super(name, initialBalance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	// Copy constructor
	public SavingsAccount(SavingsAccount originalAccount, int initialBalance) {
		super(originalAccount, initialBalance);
		int savingsNumberNew = originalAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumberNew;
	}
	
	public void postInterest() {
		double tempBalance = super.getBalance();
		double interest = tempBalance * rate;
		super.deposit(interest);
	}
	
	public String getAccountNumber()
	   {
	      return accountNumber;
	   }
}
