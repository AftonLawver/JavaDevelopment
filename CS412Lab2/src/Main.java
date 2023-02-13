public class Main {
    public static void main(String[] args) throws MyException {
        // Create an array that holds BankAccount objects
        BankAccount[] bankAccountObjects = new BankAccount[4];
//        bankAccountObjects[0] = new BankAccount(72342, "John", "Smith",7000);
//        bankAccountObjects[1] = new BankAccount(75676, "Tom", "Jones",400);
//        bankAccountObjects[2] = new BankAccount(45632, "Caleb", "Miller",20000);
//        bankAccountObjects[3] = new BankAccount(28599, "Megan", "Halstead",1400);
        // create some objects and use setter methods to set the fields of the objects within the array
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountBalance(600);


    }


}