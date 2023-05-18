//Client.java
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
public class Client {
    private Client() {}
    public static void main(String[] args)throws Exception {
        try {
// Getting the registry
            Registry registry = LocateRegistry.getRegistry("localhost", 2000);
// Looking up the registry for the remote object
            CustomersDBInterface stub = (CustomersDBInterface)
                    registry.lookup("CustomersDBInterface");
// Calling the remote method using the obtained object
            List<Customer> list = (List)stub.getCustomers();
            for (Customer s:list) {
// System.out.println("bc "+s.getBranch());
                System.out.println("ID: " + s.getId());
                System.out.println("first name: " + s.getfName());
                System.out.println("Lastname: " + s.getlName());
            } } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    } }