public class p37 {
    public static void main(String[] args) {
        //check if it's power of two or not
        int num=16;
        if((num&(num-1))==0)
            System.out.println("It's power of 2");
        else System.out.println("Its not power of 2");

        //check if kth bit is set or not
        int n=10;
        int k=3;
        if((n&(1<<k))==0)
            System.out.println("Not set");
        else
            System.out.println("Set");

        //toggle kth bit
        int m=13;int z=2;
//        int ans=(m^(1<<z));
//        System.out.println(ans);
        int res=m;
        int len=Integer.toBinaryString(m).length();
        for (int i = 0; i < len; i++) {
            if(i%2==0){
               res=(res^(1<<i)); //toggle even bit only
            }
        }
        System.out.println(res);

        //set the kth bit
        int val=9;int q=2;
        val=(val| (1<<q));
        System.out.println(val);

        //clear the kth bit
        int value=10;
        int qq=2;
        value=(value &~(1<<qq));
        System.out.println(value);

        //Remove the last set bit
        int A=10;
        A=(A&(A-1));
        System.out.println(A);

        //count Number of set bits
        int count=0;
        int Z=10;
        while (Z!=0){
            Z=(Z&(Z-1));
            count++;
        }
        System.out.println(count);
    }
}
