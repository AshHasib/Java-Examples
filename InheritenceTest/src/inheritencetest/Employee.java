
package inheritencetest;


public class Employee {
    int id;
    String name;
    
    public Employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    
    public Employee()
    {
        this.name="default";
        this.id=1;
    }
    
    String getDetails()
    {
        return "Name:"+this.name+"\n"+"ID:"+this.id+
                "\n";
    }
}
