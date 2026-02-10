import java.util.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class p45 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,9,1,3,2);

//       int sum= list.stream()
//                .filter(x->x>2)
//                .map(n->n*2)
//                .reduce(0,(a,b)->a+b);
//        System.out.println(sum);

        //Change the code to:
        //👉 Find the product of numbers greater than 2 after multiplying by 2

//        System.out.println(
//                list.stream()
//                .filter(x->x>2)
//                .map(n->n*2)
//                .reduce(1,(a,b)->a*b)
//        );
        int n =5;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=(n-i+1) ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=(n-i+1) ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        int sum=1;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(sum +"  ");
//                sum++;
//            }
//            System.out.println();
//        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
