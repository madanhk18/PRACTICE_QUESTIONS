import java.util.*;

public class p73 {
    public static void main(String[] args) {
        List<Integer> bulbs=Arrays.asList(100,100);

        fun(bulbs);
    }
    public static void fun(List<Integer> bulbs){
        List<Integer> list=new ArrayList<>();
        int arr[]=new int[101];

        for(Integer l:bulbs){
            arr[l]++;
        }

        for(int i=0;i<bulbs.size();i++){
            if(arr[bulbs.get(i)]==1)
                list.add(bulbs.get(i));
        }
        System.out.println(list);

    }
}
