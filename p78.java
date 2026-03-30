public class p78 {
    public static void main(String[] args) {
        /*
        This is a Java Program to Increment by 1 All the Digits of a given Integer.
Enter any integer as input. After this we perform various operations like modulus and division to extract each digit and increment it by one.

Here is the source code of the Java Program to Increment by 1 All the Digits of a given Integer. The Java program is successfully compiled and run on a Windows system.The program output is also shown below.

         */
        int digit=582;
        funIncreaseBy1(digit);
    }
    public static void funIncreaseBy1(int digit){
        while (digit>0){
            int lastVal=digit%10;
            lastVal++;
        }
    }
}
