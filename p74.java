import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class p74 {
    public static void main(String[] args) {
        int nums[]={20,10,30,30};
        fun(nums);
    }
    public static void fun(int []nums){
//        System.out.println(Arrays.toString(arr));
        Map<Integer,Integer> map=new HashMap<>();
        for (int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        Map<Integer,Integer> freqMap=new HashMap<>();
        for(Integer v:map.values()){
            freqMap.put(v,freqMap.getOrDefault(v,0)+1);
        }

        for(Integer g:nums){
            if(freqMap.get(map.get(g))==1)
                System.out.println(g);
        }
    }
}
