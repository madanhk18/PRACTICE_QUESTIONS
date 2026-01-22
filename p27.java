import java.util.HashMap;
import java.util.*;
public class p27 {
    public static void main(String[] args) {
        /*
        3.) Java program to find duplicate characters in a
string
         */
//        String line="Learn Java Programming";
//        findDuplicates(line);
//    }
//    public static void findDuplicates(String line){
//        line=line.replaceAll("\\s+","");
//        HashMap<Character,Integer> map=new HashMap<>();
//        for (char s:line.toCharArray()){
//            map.put(s,map.getOrDefault(s,0)+1);
//        }
//
//        for (Map.Entry<Character,Integer> g:map.entrySet()){
//            if(g.getValue()>1)
//                System.out.println(g.getKey() +" "+g.getValue()+" times");
//        }
//    }
        /*
        4.) Java program to count Occurrences of Each
Character in String
         */
        String input="Test Automation Java Automation";
        countOccurences(input);
    }
    public static void countOccurences(String line){
        line=line.replaceAll("\\s+","");
        HashMap<Character,Integer> map=new HashMap<>();
        for (char s:line.toCharArray()){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for (Map.Entry<Character,Integer> g:map.entrySet()){
                System.out.println(g.getKey() +" "+g.getValue()+" times");
        }
    }
}
