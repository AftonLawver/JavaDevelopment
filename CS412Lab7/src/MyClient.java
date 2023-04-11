import java.rmi.*;
import java.util.*;
import java.rmi.registry.*;

public class MyClient {

    public static void main(String args[]) {
        try {
            System.out.print(" Client is ready ...");
            Scanner console = new Scanner(System.in);

            System.out.print("The number : ");
            int number = console.nextInt();
            System.setProperty("java.rmi.server.hostname", "192.168.56.1");
            Registry registry = LocateRegistry.getRegistry(5000);
            Adder stub = (Adder) registry.lookup("Adder");
            // Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/Calc");
            System.out.println("The result of addition with 4 is " + stub.add(number, 4));
            System.out.println("The result of multiplication with 4 is " + stub.mul(number, 4));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
