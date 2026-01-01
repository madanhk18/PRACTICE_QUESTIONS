public class p12 {
    public static void main(String[] args) {
        //prime number
        int n=12;
        checkPrime(n);
    }
    public static void checkPrime(int num){
        if (num==0 ||  num==1)
            System.out.println("Not a prime");

        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if(num%i==0) {
                System.out.println("not a prime");
                return;
            }
        }
        System.out.println("It is prime number");
    }
}
