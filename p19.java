public class p19 {
    public static void main(String[] args) {
        /*Java program to Find Factorial on given Number

         */
        int num=4;
        fact(num);
    }
    public static void fact(int num){
        int sum=1;
        for (int i = num; i >=1 ; i--) {
            sum*=i;
        }
        System.out.println(sum);
    }
}
