public class p20 {
    public static void main(String[] args) {
        /*
        Reverse a number

Check palindrome

Sum of digits

Fibonacci (recursive)
         */
        reverseNum(618);
        palindrome(121);
    }
    public static void reverseNum(int n){
        int res=0;
        while (n>0){
            int last=n%10;
            res=res*10+last;
            n=n/10;
        }
        System.out.println(res);
    }
    public static void palindrome(int n){
        int original=n;
        int res=0;
        while (n>0){
            int last=n%10;
            res=res*10+last;
            n=n/10;
        }
        if (original==res)
            System.out.println("It's palindrome");
        else
            System.out.println("It's not palindrome");
    }

}
