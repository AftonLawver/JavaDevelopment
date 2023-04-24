import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 

public class Server extends StudentsDBImpl { 
   public Server() {} 
   public static void main(String args[]) { 
      try { 
         // Instantiating the implementation class 
         StudentsDBImpl obj = new StudentsDBImpl(); 
    
         // Exporting the object of implementation class (
        //    here we are exporting the remote object to the stub)
         StudentsDBInterface stub = (StudentsDBInterface) UnicastRemoteObject.exportObject(obj, 0);

         // Binding the remote object (stub) in the registry 
         Registry registry = LocateRegistry.getRegistry("localhost", 2000);

         registry.rebind("StudentsDBInterface", stub);
         System.err.println("Server ready");
      } catch (Exception e) { 
         System.err.println("Server exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}