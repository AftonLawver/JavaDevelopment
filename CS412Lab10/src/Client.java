import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry; 
import java.util.*;  

public class Client {  
   private Client() {}  
   public static void main(String[] args)throws Exception {
      try { 
         System.out.println("Client : "+ args[0]);
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry("localhost",2000); 
    
         // Looking up the registry for the remote object 
         StudentsDBInterface stub = (StudentsDBInterface) registry.lookup("StudentsDBInterface"); 
    
         // Calling the remote method using the obtained object 
         List<Student> list = (List)stub.getStudents(); 
         for (Student s:list) { 
            
            // System.out.println("bc "+s.getBranch()); 
            System.out.println("ID: " + s.getId()); 
            System.out.println("first name: " + s.getfName()); 
            System.out.println("Lastname: " + s.getlName());
            System.out.println("Branch: " + s.getBranch()); 
            System.out.println("Score: " + s.getScore()); 
            System.out.println("email: " + s.getEmail()); 
            System.out.println(" ===============================================");
         }  
      // System.out.println(list); 
      } catch (Exception e) { 
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}