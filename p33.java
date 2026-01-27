import java.util.*;

public class p33 {
    public static void main(String[] args) {
        /*
        15.) Java program to gives Output: a2b2c3d2
for the Input String Str = “aabbcccdd”
         */
            String n="aabbcccdd";
            Map<Character,Integer> map=new LinkedHashMap<>();
            for(char ch:n.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }

            for(Map.Entry<Character,Integer> g:map.entrySet()){
                System.out.print(g.getKey()+""+g.getValue());
            }
    }
}
