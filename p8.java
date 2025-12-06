public class p8 {
    public static void main(String[] args) {
        /*
        6.) Find the missing number in an Array
public class Main {
public static void main(String[] args) {
int[] array = {1, 2, 4, 5, 6}; // Missing number is 3
int missingNumber = findMissingNumber(array);
System.out.println("The missing number is: " + missingNumber);
}
The missing number is: 3
         */
        int arr[]={1, 2, 4, 5, 6};
        functions(arr);
    }
    public static void functions(int []arr){
        int n=arr.length+1;
        int arrSum=0;
        int totalSum=n*(n+1)/2;
        for(int g:arr){
            arrSum+=g;
        }
        System.out.println(totalSum-arrSum);
    }
}
