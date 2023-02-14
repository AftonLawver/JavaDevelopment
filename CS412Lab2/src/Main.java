// Afton Lawver
// siu851463587

public class Main {
    public static void main(String[] args) throws MyException {
        BankAccount[] bankAccountObjects = new BankAccount[4];
        bankAccountObjects[0] = new BankAccount();
        bankAccountObjects[1] = new BankAccount();
        bankAccountObjects[2] = new BankAccount();
        bankAccountObjects[3] = new BankAccount();

        bankAccountObjects[0].setAccountNumber(92387);
        bankAccountObjects[0].setAccountFirstName("Afton");
        bankAccountObjects[0].setAccountLastName("Lawver");
        bankAccountObjects[0].setAccountBalance(1500);

        bankAccountObjects[1].setAccountNumber(34827);
        bankAccountObjects[1].setAccountFirstName("John");
        bankAccountObjects[1].setAccountLastName("Smith");
        bankAccountObjects[1].setAccountBalance(3000);

        bankAccountObjects[2].setAccountNumber(37886);
        bankAccountObjects[2].setAccountFirstName("Peter");
        bankAccountObjects[2].setAccountLastName("Jackson");
        bankAccountObjects[2].setAccountBalance(3400);

        bankAccountObjects[3].setAccountNumber(93882);
        bankAccountObjects[3].setAccountFirstName("Chris");
        bankAccountObjects[3].setAccountLastName("Williams");
        bankAccountObjects[3].setAccountBalance(7000);

        System.out.println("\n\n");

        System.out.println("--------------------Bank Accounts------------------");
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            System.out.println("Account number: " + bankAccountObjects[i].getAccountNumber());
            System.out.println("Account Name: " + bankAccountObjects[i].getAccountFirstName() + " " + bankAccountObjects[i].getAccountLastName());
            System.out.println("Account balance: " + bankAccountObjects[i].getAccountBalance());
            System.out.println("\n\n");
        }
    }
}