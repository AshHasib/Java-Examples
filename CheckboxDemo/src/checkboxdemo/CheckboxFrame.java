
package checkboxdemo;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author hasib
 */
public class CheckboxFrame {
    public CheckboxFrame()
    {
        JFrame frame=new JFrame();
        JCheckBox cb1,cb2;
        cb1=new JCheckBox("Bangladeshi");
        cb2=new JCheckBox("Others",true);
        
        
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        cb1.setBounds(10,100,150,50);
        cb2.setBounds(10,70,150,50);
        
        frame.add(cb1);
        frame.add(cb2);
        
        frame.setVisible(true);
    }
}
