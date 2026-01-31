import java.util.Stack;

public class p35 {
    public static void main(String[] args) {
        /*
        int[] array = {1, 2, 4, 5, 6}; // Missing number is 3
         */
//        int[] array = {1, 2, 4, 5, 6}; // Missing number is 3
//        int n= array.length+1;
//        int sum=0;
//        for (int v:array){
//            sum+=v;
//        }
//        int total=n*(n+1)/2;
//        System.out.println(total-sum);

        //decimal to binary

        int deci=10;
        Stack<Integer> st=new Stack<>();
        while (deci>0){
            int lastBit=deci&1;
            st.push(lastBit);
            deci=deci>>1;
        }

        while (!st.isEmpty()){
            System.out.print(st.peek());
            st.pop();
        }
    }
}
