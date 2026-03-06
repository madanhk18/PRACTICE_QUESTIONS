public class p61 {
    public static void main(String[] args) {
        /*
        🔹 Example Inputs (Try these)
✅ Example 1
nums = [1, 3, 5, 6]
target = 5


Expected Output

2

         */
        int arr[]={1, 3, 5, 6};
        int target=5;

        fun(arr,target);
    }
    public static void fun(int []arr,int target){
        int low=0,high=arr.length-1;
        int ans=arr.length;
        while (low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]>=target){
               ans=mid;
               high=mid-1;
            }
            else
                low=mid+1;
        }
        System.out.println(ans);
    }
}
