public class p3 {
    public static void main(String[] args) {
        /*
        11.) Java program to count Odd and
Even number from given array
Input: {1,2,3,4,5,6,7,8,9}
         */

        int arr[]={1,2,3,4,5,6,7,8,9};
        countOddorEven(arr);
    }
    public static void countOddorEven(int []arr){
        int oddCount=0,evenCount=0;
        for (int i = 0; i < arr.length; i++) {
            int a=arr[i];
            if((a & 1)==0){
                evenCount++;
            } else if ((a&1)==1) {
                oddCount++;
            }
        }
        System.out.println("Odd Count="+oddCount+" Even Count="+evenCount);
    }
}
