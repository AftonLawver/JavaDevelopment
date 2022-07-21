import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TestTimer {

    private int count = 0;
    private Timer timer;
    private JLabel label1,label2;
    private JTextField text1,text2;

    private void initUI()
    {
        JFrame frame = new JFrame("Flip Flop Java GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel();
        JButton jButton = new JButton("Switch");
        label2 = new JLabel();
        text1 = new JTextField(10);
        text2 = new JTextField(10);
        text1.setEnabled(false);
        text2.setEnabled(false);
        frame.add(label1);
        frame.add(jButton);
        frame.add(text1);
        frame.add(label1);
        frame.add(text2);
        frame.pack();
        frame.setLayout(new GridLayout(4, 2));
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        jButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                count++;
                if (count % 2 == 0)
                {
                    // count++;
                    label1.setForeground(Color.BLUE);
                    label2.setForeground(Color.RED);
                    text1.setBackground(Color.RED);
                    text2.setBackground(Color.BLUE);
                    label1.setText("Flop");
                }
                else
                {
                    label1.setForeground(Color.RED);
                    label2.setForeground(Color.BLUE);
                    text1.setBackground(Color.BLUE);
                    text2.setBackground(Color.RED);
                    label1.setText("Flip");
                }
            }
        });
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new TestTimer().initUI();
            }
        });
    }

}
