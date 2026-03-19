import java.util.LinkedHashMap;
import java.util.Map;

public class p69 {
    public static void main(String[] args) {
        /*
        🧠 Problem: First Non-Repeating Character
Problem Statement

Given a string s, return the index of the first non-repeating character.

If all characters repeat, return -1.
         */
        String s = "leetclode";
        fun(s);
    }
    public static void fun(String s){
        Map<Character,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
//        for (Character e:map.keySet()){
//            System.out.println(e);
//        }
        for (Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                return;
            }
        }
    }
}
