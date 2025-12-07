import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class p9 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(6);
        list.add(5);

        System.out.println(list);
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (Integer g:list){
            map.put(g,map.getOrDefault(g,0)+1);
        }
        for(Map.Entry<Integer,Integer> s:map.entrySet()){
            if(s.getValue()==1)
                res.add(s.getKey());
        }
        System.out.println(res);
    }
}
