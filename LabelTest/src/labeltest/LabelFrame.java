
package labeltest;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author hasib
 */
public class LabelFrame {
    public LabelFrame()
    {
        JFrame frame=new JFrame("Welcome");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JLabel l1=new JLabel("This is label 1");
        JLabel l2=new JLabel("This is label 2");
        l1.setBounds(10, 50, 100, 50);
        l2.setBounds(10,70,100,50);
        frame.add(l1);
        frame.add(l2);
        
        
        frame.setVisible(true);
       
    }
}
