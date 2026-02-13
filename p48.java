public class p48 {
    public static void main(String[] args) {
        // Example input
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        // Call your function
        int k = removeElement(nums, val);

        // Print result
        System.out.println("New length: " + k);
        System.out.print("Updated array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int idx=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=val){
                nums[idx++]=nums[i];
            }
        }
        return idx;
    }
}
