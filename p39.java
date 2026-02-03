public class p39 {
    public static void main(String[] args) {
        int n=10;
        int len=Integer.toBinaryString(n).length();
        int c=0;
        for (int i = 0; i < len; i++) {
                if((n&(1<<i))>0)
                    c++;

        }
        if(c==1)
            System.out.println("YES");
        else
            System.out.println("NO");

        //Q2️⃣ Check if the 2nd bit is set in a number
        //
        //Example:
        //
        //Input: n = 10 (1010), k = 1
        //Output: YES
        int m=10;
        if((m&(1<<2))>0){
            System.out.println("Yes 2nd bit is set");
        }
        else
            System.out.println("No its not set");
    }
}
