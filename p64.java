public class p64 {
    public static void main(String[] args) {
        /*
        🧮 Problem: Print Prime Numbers Between Two Limits
Problem Statement

Write a Java program to print all prime numbers between two given integers (inclusive of limits if they are prime).

A number is called prime if it has exactly two distinct positive divisors: 1 and itself.

Input Format

First line: an integer lower (lower limit)

Second line: an integer upper (upper limit)

Output Format

Print all prime numbers between the given limits, each on a new line.

Sample Input
Enter the lower limit :
2
Enter the upper limit :
20
         */
        int lowLimit=2;
        int upLimit=20;
        findPrimes(lowLimit,upLimit);
    }
    public static void findPrimes(int ll,int ul){
        System.out.println("The prime numbers between "+ll+" and "+ul+" are: ");
        for (int i = ll; i <=ul ; i++) {
            if(i==1 ||i==0) continue;
            if(checkForPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static boolean checkForPrime(int i){
        for (int j = 2; j <i ; j++) {
            if(i%j==0) return false;
        }
        return true;
    }
}
