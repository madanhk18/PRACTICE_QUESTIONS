import java.util.*;

public class p63 {

    public static boolean hasDuplicate(String s) {
        if(s.length()==1) return false;
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()>1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicate("abcd"));        // false
        System.out.println(hasDuplicate("programming")); // true
    }
}
