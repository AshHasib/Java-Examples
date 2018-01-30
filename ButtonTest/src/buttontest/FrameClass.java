package buttontest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FrameClass
{
    public FrameClass()
    {
        JFrame frame=new JFrame("Welcome");
        JButton ok=new JButton("OK");
        JButton test=new JButton("Click here!!");
        JTextField tf=new JTextField();
        
        
        ok.setBounds(200,500,100,50);
        ok.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null,"This is working");
        });
        test.setBounds(500, 500, 100, 50);
        test.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Yeah this is working!!!");
            }
        });
        tf.setBounds(100, 100, 300, 200);
        frame.add(ok);
        frame.add(test);
        frame.add(tf);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
