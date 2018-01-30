package frametest;
import javax.swing.JFrame;


public class myFrame {
    public myFrame()
    {
        JFrame frame=new JFrame("Welcome");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
