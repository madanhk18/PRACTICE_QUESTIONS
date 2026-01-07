public class p16 {
    public static void main(String[] args) {
        /*
        2.) Java program to find Prime number
         */

        int n=13;
        checkPrime(n);
    }
    public static void checkPrime(int n){
        if(n<=1) {
            System.out.println("It's not prime");
            return;
        }

            for (int i = 2; i <=Math.sqrt(n) ; i++) {
                if(n%i==0) {
                    System.out.println("It's not prime");
                    return;
                }
            }
            System.out.println("It's prime");
    }
}
