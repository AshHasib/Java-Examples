
package fieldvariabletest;

import java.util.Date;
//three ways to initialize field variables

public class FieldVariableTest {
    double D; //initialization using default value
    Date date=new Date(); //initialization using explicit value 
    //init. by the current date of the system
    String s; //initialization using constructor
   
    public FieldVariableTest(String s)
    {
        this.s=s;
    }
    
    public static void main(String[] args) {
        FieldVariableTest newVar=new FieldVariableTest("Sample String");
        System.out.println(newVar.D);
        System.out.println(newVar.date);
        System.out.println(newVar.s);
    }
    
}
