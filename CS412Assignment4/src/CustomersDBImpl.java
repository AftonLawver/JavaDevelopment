import java.sql.*;
import java.util.*;
// Implementing the remote interface
public class CustomersDBImpl implements CustomersDBInterface {
    // Implementing the interface method
    public List<Customer> getCustomers() throws Exception {
        List<Customer> list = new ArrayList<Customer>();
// JDBC driver name and database URL
        String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/aftondb";
// Database credentials
        String USER = "root";
        String PASS = "102992";
        Connection conn = null;
        Statement stmt = null;
//Register JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
//Open a connection
        System.out.println("Connecting to a selected database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("Connected database successfully...");
//Execute a query
        System.out.println("Creating statement...");
        stmt = conn.createStatement();
        String sql = "SELECT * FROM CUSTOMERS";
        ResultSet rs = stmt.executeQuery(sql);
        //Extract data from result set
        while(rs.next()) {
// Retrieve by column name
            int id = rs.getInt("CustomerID");
            String firstname = rs.getString("FirstName");
            String lasttname = rs.getString("LastName");
// Setting the values
            Customer customer = new Customer();
            customer.setID(id);
            customer.setfName(firstname);
            customer.setlName(lasttname);
            list.add(customer); // Add customer record to the list
        }
        rs.close();
        return list;
    }
}
