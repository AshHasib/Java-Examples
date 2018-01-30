
package staticimporttest;

import static java.lang.Math.sqrt;


public class StaticImportTest {

    
    public static void main(String[] args) {
        System.out.println(sqrt(9)); //static import, no need the class name to call
        System.out.println(Math.PI); // no need to import
    }
    
}
