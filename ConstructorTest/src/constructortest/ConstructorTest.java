
package constructortest;

import java.util.Date;


public class ConstructorTest {
    double D;
    Date date;
    String s;
   
    public ConstructorTest()
    {
        
    }
    public ConstructorTest(double D)
    {
        this.D=D;
    }
    
    public static void main(String[] args) {
        System.out.println(new ConstructorTest(34).D);
    }
    
}
