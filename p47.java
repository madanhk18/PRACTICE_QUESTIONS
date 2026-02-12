import java.util.*;

public class p47 {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3};

        int k = removeDuplicates(nums);
        System.out.println(k);

        // Print first k elements
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    public static int removeDuplicates(int[] nums) {
        int idx=0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]!=nums[idx]){
                nums[++idx]=nums[i];
            }
        }
        return idx+1;
    }
}
