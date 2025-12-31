public class p11 {
    public static void main(String[] args) {
        /*
        nums = [-2,1,-3,4,-1,2,1,-5,4]
         */
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArrays(arr);
    }
    public static void maxSubArrays(int []arr){
        int currentSum=arr[0],overallSum=arr[0];
        for (int i = 0; i <arr.length ; i++) {
        currentSum=Math.max(arr[i],currentSum+arr[i]);
        overallSum=Math.max(currentSum,overallSum);
        }
        System.out.println(overallSum);
    }
}
