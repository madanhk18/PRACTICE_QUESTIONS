import java.util.*;

public class p51 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int v:nums){
            map.put(v,map.getOrDefault(v,0)+1);
        }

//        Iterator<Integer> it=map.values().iterator();
//        while (it.hasNext()){
//        }
        for(Map.Entry<Integer,Integer> g:map.entrySet()){
            if(g.getValue()>=2){
                return true;
            }
        }
        return false;
    }
}
