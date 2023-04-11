import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {

    public static void main(String args[]) {

        try {
            System.out.print(" Server is ready ...");
            Adder stub = new AdderRemote();
            Registry Naming = LocateRegistry.getRegistry(5000);

            Naming.rebind("Adder", stub);
            // Naming.rebind("rmi://localhost:5000/Calc",stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}