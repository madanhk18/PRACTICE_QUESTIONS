public class p1 {
    public static void main(String[] args) {
        int arr[]={1,10,13,7,6,5,4,2,1,0};
       int ans= findPeak(arr);
        System.out.println(arr[ans]);
    }
    public static int findPeak(int []arr){
        int low=0,high=arr.length-1;
        int peak=0;
        while (low<high){
            int mid=low+(high-low)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
                peak = mid;
                break;
            }
             else if (arr[mid]>arr[mid+1]) high=mid-1;
            else low=mid+1;
        }
        return peak;
    }
}
