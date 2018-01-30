
package buttonclosedemo;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hasib
 */
public class ButtonFrame {
    JFrame frame=new JFrame();
    JButton button1,button2;
    
    public ButtonFrame()
    {
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        
        button1=new JButton("Click here!!!");
        button2=new JButton("EXIT");
        button1.setBounds(50, 50, 130, 60);
        button2.setBounds(50,150,100,60);
        button1.addActionListener((ActionEvent e) ->{
            JOptionPane.showMessageDialog(null, "This is working");
        });
        button2.addActionListener((ActionEvent e) ->{
           // frame.dispose();
           System.exit(0);
        
        });
        
        
        frame.add(button1);
        frame.add(button2);
        
        frame.setVisible(true);
    }
    
}
