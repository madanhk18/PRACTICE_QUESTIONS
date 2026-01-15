public class p23 {
    public static void main(String[] args) {
        /*
        10.) Java program to calculate the sum of digits of
a number
         */
        int n=2452;
        sumOfDigit(n);
    }
    public static void sumOfDigit(int n){
        int sum=0;
        while (n>0){
            sum+=(n%10);
            n/=10;
        }
        System.out.println(sum);
    }
}
