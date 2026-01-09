public class p18 {
    public static void main(String[] args) {
        /*
        4.) Java program to swap two numbers without
using third variable
         */
        int a=10,b=20;

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println( "a ="+a+" b ="+b);
    }
}
