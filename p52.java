import java.util.*;

public class p52 {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};

        int[] result = plusOne(digits);

        for (int v : result) {
            System.out.print(v + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i=digits.length-1; i >=0 ; i--) {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int arr[]=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}
