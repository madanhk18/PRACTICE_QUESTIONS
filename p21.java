public class p21 {
    public static void main(String[] args) {
        /*7.) Java program to find Armstrong Number

         */
        int n=153;
        checkArmsstrong(n);

    }
    public static void checkArmsstrong(int n){
        int len=String.valueOf(n).length();
        int original=n;
        int res=0;
        while (n>0){
            int lastDigit=n%10;
            res=res+(int)Math.pow(lastDigit,len);
            n=n/10;
        }
        if(res==original)
            System.out.println("Armstrong");
        else
            System.out.println("Not armstrong");
    }
}
