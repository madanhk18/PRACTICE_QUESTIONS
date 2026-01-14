public class p22 {
    public static void main(String[] args) {

        /*
        ✅ Problem Statement – Number of Digits in a Given Number

8.) Java Program to Find Number of Digits in a Given Number

Write a Java program to count the total number of digits present in a given integer number.

🔹 Input:

An integer number n

🔹 Output:

An integer representing the count of digits in n

🔹 Example 1:
Input: 12345
Output: 5
         */
        int digit=7;
        countDigit(digit);
    }
    public static void countDigit(int digit){
        int count=0;
        if (digit==0) System.out.println(++count);
        digit=Math.abs(digit);
        while (digit>0){
            count++;
            digit/=10;
        }
        System.out.println(count);
    }
}
