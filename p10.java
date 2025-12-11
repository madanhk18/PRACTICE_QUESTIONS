import java.util.*;

public class p10 {
    public static void main(String[] args) {
        /*
        👉 Input

nums = [2, 7, 11, 15]
target = 9


👉 Expected Output

[0, 1]
         */
        int arr[]={2,7,11,15};
        int tar=9;
        fun(arr,tar);
    }
    public static int[] fun(int []arr,int tar){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff=tar-arr[i];
            if(map.containsKey(diff))
                return new int[]{map.get(diff),i};

            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
