import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class p72 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,5,7,2,1,4,6,8,10);
//        System.out.println(list);

        list.stream()
                .forEach(n->System.out.print(n+" "));

    }
}
