import java.util.*;

public class p80 {
    public static void main(String[] args) {
        //To print the binary format of any given number is
        int num=5;
        String binaryVal=Integer.toBinaryString(num);
        System.out.println(binaryVal);
        System.out.println();
        Stack<Integer> st=new Stack<>();
        int n=10;
        while (n>0){
            int lbit=n&1;
            st.add(lbit);
            n=n>>1;
        }
        while (!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }

        System.out.println();
        //using StringBuilder
        StringBuilder sb=new StringBuilder();
        int num1=10;
        while (num1>0){
            int lastDigit=num1&1;
            sb.append(lastDigit);
            num1=num1>>1; // divide by two
        }
        System.out.println(sb.reverse().toString());
    }
}
