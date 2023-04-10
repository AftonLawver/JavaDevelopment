

import java.rmi.registry.*;

public class RegisterWithRMIServer {
  /** Main method */
  public static void main(String[] args) {
    try {
      StudentServerInterface obj = new StudentServerInterfaceImpl();
      Registry registry = LocateRegistry.getRegistry(6000);
      registry.rebind("StudentServerInterfaceImpl", obj);
      System.out.println("Student server " + obj + " registered");
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
