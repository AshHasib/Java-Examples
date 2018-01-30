
package bitwisetest;


public class BitwiseTest {

    
    public static void main(String[] args) {
        int a=60; //11100 in binary
        int b=13; // 1101 in binary
        int c=0;
        
        c=a&b; //1100
        
        System.out.println("a&b = "+c+" in binary "+Integer.toBinaryString(c));
        
        c=a|b;
        
        System.out.println("a|b = "+c+" in binary "+Integer.toBinaryString(c));
        
        c=a^b;
        
        System.out.println("a^b = "+c+" in binary "+Integer.toBinaryString(c));
        
        System.out.println("~a = "+~a+" in binary "+Integer.toBinaryString(~a));
        c=a<<2;
        System.out.println("a<<2 = "+c+" in binary "+Integer.toBinaryString(c));
        
        c=a>>2;
        System.out.println("a>>2 = "+c+" in binary "+Integer.toBinaryString(c));
    
    }
    
}
