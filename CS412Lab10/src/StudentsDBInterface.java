import java.rmi.Remote; 
import java.rmi.RemoteException; 
import java.util.*;

// Creating Remote interface for our application 
public interface StudentsDBInterface extends Remote {  
   public List<Student> getStudents() throws Exception;  
}