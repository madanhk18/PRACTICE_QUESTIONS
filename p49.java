import java.util.*;

public class p49 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElement(nums);
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new TreeMap<>();
        for (int v:nums){
            map.put(v,map.getOrDefault(v,0)+1);
        }
        int n=nums.length;
        n=n/2;
        for(Map.Entry<Integer,Integer> g:map.entrySet()){
            if(g.getValue()>n)
                return g.getKey();
        }
        return -1;
    }
}
