import java.util.*;
import java.util.stream.*;

public class p58 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,6,7,8,9);

//        Stream<Integer> st=list.stream();
//        System.out.println(Arrays.toString(st.toArray()));
////        System.out.println(st.count());
        int sum=list.stream()
                .filter(x->x%2==0)
                .map(x->(x*2))
                .reduce(0,(a,b)->(a+b));
        System.out.println(sum);
    }
}
