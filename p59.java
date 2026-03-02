public class p59 {
    public static void main(String[] args) {
        int n=10;
//        1️⃣ Check whether the k-th bit of n is set or not.
//        2️⃣ If it is set, clear it.
//        3️⃣ If it is not set, set it.
//        4️⃣ Print the final value of n.
        int k = 1;
        if((n&(1<<k))>0) {
            System.out.println("Its set");
            //clear it
            n=(n&~(1<<k));
            System.out.println(n);
        }
        else {
            System.out.println("Its not set");
            n=(n|(1<<k));
            System.out.println(n);

        }
    }
}
