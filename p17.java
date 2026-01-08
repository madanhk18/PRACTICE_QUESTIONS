public class p17 {
    public static void main(String[] args) {
        /*
        3.) Java program to find Fibonacci series upto a
given number range
         */

        int n=5;//First 5 fibonacchi numbers

        int a=0,b=1;
        if(n>=1) System.out.println(a+" ");
        if(n>=2) System.out.println(b+" ");

        for (int i = 3; i <=n ; i++) {
            int c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    }
}
