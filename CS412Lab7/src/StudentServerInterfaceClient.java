
import java.rmi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StudentServerInterfaceClient extends JApplet {
    // Declare a Student instance
    private StudentServerInterface student;

    private boolean isStandalone; // Is applet or application

    private JButton jbtGetScore = new JButton("Get Score");
    private JTextField jtfName = new JTextField();
    private JTextField jtfScore = new JTextField();
    private JButton jbtTopStudent = new JButton("Top Student");
    private JTextField jtfTopStudent = new JTextField();

    public void init() {
        // Initialize RMI
        initializeRMI();

        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(3, 2));
        jPanel1.add(new JLabel("Name"));
        jPanel1.add(jtfName);
        jPanel1.add(new JLabel("Score"));
        jPanel1.add(jtfScore);
        jPanel1.add(new JLabel("Top Student"));
        jPanel1.add(jtfTopStudent);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(jbtGetScore);
        buttonPanel.add(jbtTopStudent);

        add(buttonPanel, BorderLayout.SOUTH);
        add(jPanel1, BorderLayout.CENTER);

        jbtGetScore.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                getScore();
            }
        });

        jbtTopStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                getTopStudent();
            }
        });
    }

    private void getScore() {
        try {
            // Get student score
            double score = student.findScore(jtfName.getText().trim());

            // Display the result
            if (score < 0)
                jtfScore.setText("Not found");
            else
                jtfScore.setText(new Double(score).toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void getTopStudent() {
        try {
            String topStudentMessage = student.isTopStudent();
            jtfTopStudent.setText(topStudentMessage);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /** Initialize RMI */
    protected void initializeRMI() {
        String host = "10.88.206.155";
//        if (!isStandalone)
//            host = getCodeBase().getHost();
//        else
//            host = "localhost";
        System.out.println("The host name is " + host);
        try {
            Registry registry = LocateRegistry.getRegistry(host, 6000);
            student = (StudentServerInterface) registry.lookup("StudentServerInterfaceImpl");
            System.out.println("Server object " + student + " found");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /** Main method */
    public static void main(String[] args) {
        StudentServerInterfaceClient applet = new StudentServerInterfaceClient();
        applet.isStandalone = true;
        JFrame frame = new JFrame();
        frame.setTitle("StudentServerInterfaceClient");
        frame.add(applet, BorderLayout.CENTER);
        frame.setSize(250, 150);
        applet.init();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}
