
package inheritencetest;


public class InheritenceTest{

    
    public static void main(String[] args) {
        Employee emp=new Employee("Hasib", 54);
        
        System.out.println(emp.getDetails());
        
         Manager mgr=new Manager("John",23,"CSE");
         //mgr.showDetails();
         System.out.println(mgr.getDetails());
    }
}
