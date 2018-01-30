
package staticandinstancevariabletest;

/**
 *
 * @author hasib
 */
public class StaticAndInstanceVariableTest {
    
    
    
    static int instanceCounter; //no need to initialize.
    int counter;
    static final int ONE_DAY_IN_SEC=24*60*60;
    static 
    {
        System.out.println("This class has started loading. . .");
        System.out.println("Static Instance No." + instanceCounter); //static variables, no objects needed.
        System.out.println("Normal Instance No. "+ new StaticAndInstanceVariableTest().counter); // need object to access
    }
    static
    {
        System.out.println("One day is seconds:"+ONE_DAY_IN_SEC);
    }
    
    public StaticAndInstanceVariableTest()
    {
        System.out.println("Constructor Successfully Loaded");
        instanceCounter++;
        System.out.println("Static Instance No :" + instanceCounter);
        System.out.println("Normal Instance No. :"+counter);
    }
    public static void main(String[] args) {
        System.out.println("Starting Main Method");
        new StaticAndInstanceVariableTest(); //Anonymus Object Creation       
        StaticAndInstanceVariableTest stvr=new StaticAndInstanceVariableTest(); //Traditional object creation
        
    }
    
    static 
    {
        System.out.println("Class Ends Here. . .");
    }
    
}
