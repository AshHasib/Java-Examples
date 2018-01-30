
package covarianttest;


class A
{
    int x=1;
}
class bSub extends A
{
    int y=2;
}

class Base
{
    A getObject()
    {
        System.out.println("Base");
        return new A();
    }
}
public class CovariantTest extends Base{

   @Override
   A getObject()
    {
        System.out.println("Covarient Return");
        return new bSub();
    }
    public static void main(String[] args) {
        Base base=new CovariantTest();
        System.out.println(base.getObject() instanceof bSub);
        System.out.println(base.getObject().x);
    }
    
}
