import java.util.*;

public class p46 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }


    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int v:nums){
            map.put(v,map.getOrDefault(v,0)+1);
        }
        for (Map.Entry<Integer,Integer> g:map.entrySet()){
            if(g.getValue()!=1){
                return true;
            }
        }
        return false;
    }
}
