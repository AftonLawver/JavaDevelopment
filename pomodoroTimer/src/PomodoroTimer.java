import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PomodoroTimer extends JFrame {
    private JPanel panelMain;
    private JLabel label1;
    private JTextField textName;
    private JButton btnClick;

    public PomodoroTimer() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick, textName.getText() + ", Hello!");
            }
        });
    }

    public static void main(String[] args) {
        PomodoroTimer p = new PomodoroTimer();
        p.setContentPane(p.panelMain);
        p.setTitle("Pomodoro Timer");
        p.setBounds(600, 200, 300, 200);
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


