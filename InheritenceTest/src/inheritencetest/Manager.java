
package inheritencetest;


public class Manager extends Employee{
    String department;
    
    public Manager(String name,int id, String department)
    {
        super(name,id);
        this.department=department;
    }
    
    /*public void showDetails()
    {
        System.out.println("Name:"+this.name);
        System.out.println("ID:"+this.id);
        System.out.println("Department:"+this.department);
    }*/
    @Override
    String getDetails()
    {
        return "Name:"+this.name+"\n"+"ID:"+this.id+"\n"
                +"Department:"+this.department+"\n";
    }
            
}
