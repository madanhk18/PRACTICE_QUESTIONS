public class p24 {
    public static void main(String[] args) {
        int a=12,b=24;

        lcm(a,b);
       int ans= hcf(a,b);
        System.out.println("HCF="+ans);
    }
    public static int hcf(int a,int b){
        //HCF == GCD
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void lcm(int a,int b){
        int lcm=Math.max(a,b);
        while (true){
            if(lcm%a==0 && lcm%b==0)
                break;
            else
                lcm++;
        }
        System.out.println("LCM="+lcm);
    }
}
