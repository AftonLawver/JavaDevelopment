public class BankAccount {
    private int accountNumber;
    private String accountFirstName;
    private String accountLastName;
    private float accountBalance;

    public BankAccount() {

    }

    public BankAccount(int accountNumber, String accountFirstName,
                       String accountLastName, float accountBalance) {
        this.accountBalance = accountBalance;
        this.accountFirstName = accountFirstName;
        this.accountNumber = accountNumber;
        this.accountLastName = accountLastName;
    }

    public void setAccountBalance(float accountBalance) throws MyException {
        if (accountBalance < 500) {
            String message= accountFirstName + " " + accountLastName
                    +": Your balance $"+ accountBalance
                    + " is less than threshold value $500";
                    MyException low = new MyException (message);
            throw low;
        }
        else {
            this.accountBalance = accountBalance;
        }
    }
}
