public class p62 {
    public static void main(String[] args) {
        //fibo until 6
//        int n=6;
//        int f=0,s=1;
//        for(int i=0;i<=n;i++){
//            System.out.println(f);
//            int sum=f+s;
//            f=s;
//            s=sum;
//        }
//        int num=2635;
//        int count=0;
//        while (num>0){
//            count++;
//            num=num/10;
//        }
//        System.out.println(count);

        int num=121;
        int original=num;
        int rev=0;
        while (num>0){
            int lastVal=num%10;
            rev=rev*10+lastVal;
            num/=10;
        }
        if (original==rev)
            System.out.println("Palindrome bro");
        else
            System.out.println("No bro not palindrome");
    }
//    public static int fibo(int n){
//        if(n<=1)
//            return n;
//
//        return fibo(n-1)+fibo(n-2);
//    }
}
