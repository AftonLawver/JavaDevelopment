import java.rmi.*;

public interface StudentServerInterface extends Remote {
    public double findScore(String name) throws RemoteException;

    public String isTopStudent() throws RemoteException;
}