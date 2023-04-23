import java.rmi.Remote;
import java.util.*;
// Creating Remote interface for the application
public interface CustomersDBInterface extends Remote {
    // Remote Method
    public List<Customer> getCustomers() throws Exception; }