import java.sql.*; 
import java.util.*;  

// Implementing the remote interface 
public class StudentsDBImpl implements StudentsDBInterface {  
   
   // Implementing the interface method 
   public List<Student> getStudents() throws Exception {  
      List<Student> list = new ArrayList<Student>();   
    
      // JDBC driver name and database URL 
      String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";   
      String DB_URL = "jdbc:mysql://localhost:3306/students";  
      
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
      String sql = "SELECT * FROM STUDENT";
      ResultSet rs = stmt.executeQuery(sql);  
      
      //Extract data from result set 
      while(rs.next()) { 
         // Retrieve by column name 
         int id  = rs.getInt("StudentID"); 
         String firstname = rs.getString("FirstName"); 
         String lasttname = rs.getString("LastName"); 
         String branch = rs.getString("BRANCH"); 
         
         int score = rs.getInt("SCORE"); 
         String email = rs.getString("EMAIL");  
         
         // Setting the values 
         Student student = new Student(); 
         student.setID(id); 
         student.setfName(firstname); 
         student.setlName(lasttname);
         student.setBranch(branch); 
         student.setScore(score); 
         student.setEmail(email); 
         list.add(student); 
      } 
      rs.close(); 
      return list;     
   }  
}