public class p13 {
    public static void main(String[] args) {
        /*
        ava program to find Fibonacci series upto a
given number range
         */

        int range=10;
        for (int i = 0; i <=range; i++) {
            System.out.println(i+"th fibonachi is "+ fibo(i));
        }
    }
    public static int fibo(int i){
        if(i==0) return 0;
        if(i==1) return 1;
        return fibo(i-1)+fibo(i-2);
    }
}
