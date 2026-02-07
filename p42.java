public class p42 {
    public static void main(String[] args) {
        int n = 5;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <n ; i++) {
//            for (int j = 1; j <(n-i+1) ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//
//        for (int i = n; i >=1 ; i--) {
//            for (int j = n; j >=i; j--) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                if(i==n||i==1||j==1||j==n)
//                    System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=(n-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i =n-1; i >=1 ; i--) {
//            for (int j = 1; j <=(n-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n-i+1) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}
