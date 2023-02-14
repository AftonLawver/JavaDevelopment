// Afton Lawver
// siu851463587

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

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountFirstName(String accountFirstName) {
        this.accountFirstName = accountFirstName;
    }

    public void setAccountLastName(String accountLastName) {
        this.accountLastName = accountLastName;
    }

    public void setAccountBalance(float accountBalance) throws MyException {
        if (accountBalance < 500) {
            String message= "Cannot create account! " + accountFirstName + " " + accountLastName
                    +": Your balance $"+ accountBalance
                    + " is less than threshold value $500";
                    MyException low = new MyException (message);
            throw low;
        }
        else {
            this.accountBalance = accountBalance;
        }
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountFirstName() {
        return this.accountFirstName;
    }

    public String getAccountLastName() {
        return this.accountLastName;
    }

    public float getAccountBalance() {
        return this.accountBalance;
    }

    public void withdraw(float amountToWithdraw) throws MyException {
        if(amountToWithdraw > this.accountBalance) {
            String message= "Attention: " + this.accountFirstName
                    + " " + this.accountLastName + ". The amount of $" + amountToWithdraw
                    + " that you have requested to withdraw is greater than your " +
                    "current balance of $" + this.accountBalance;
            MyException cannotWithdraw = new MyException (message);
            throw cannotWithdraw;
        }
        else {
            this.accountBalance -= amountToWithdraw;
        }
    }
}
