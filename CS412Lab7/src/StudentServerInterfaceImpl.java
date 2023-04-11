import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class StudentServerInterfaceImpl extends UnicastRemoteObject
    implements StudentServerInterface {
    private HashMap<String, Double> scores = new HashMap<>();

    public StudentServerInterfaceImpl() throws RemoteException {
        initializeStudent();
    }

    protected void initializeStudent() {
        scores.put("John", 90.5);
        scores.put("Michael", 100.0);
        scores.put("Michelle", 98.5);
        scores.put("David", 77.25);
        scores.put("Mark", 81.75);
    }

    public double findScore(String name) throws RemoteException {
        Double d = scores.get(name);

        if (d == null) {
            System.out.println("Student " + name + " is not found ");
            return -1;
        } else {
            System.out.println("Student " + name + "\'s score is " + d);
            return d;
        }
    }

    public String isTopStudent() throws RemoteException {
        String topStudent = "";
        double topScore = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : scores.entrySet()) {
            if (entry.getValue() > topScore) {
                topStudent = entry.getKey();
                topScore = entry.getValue();
            }
        }
        return topStudent + " is the top student.";
    }
}