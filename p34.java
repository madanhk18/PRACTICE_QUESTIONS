public class p34 {
    public static void main(String[] args) {
        /*
        9.) Array consists of integers and special
characters,sum only integers
public class Main {
public static void main(String[] args) {
String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
         */
//        int v=Integer.parseInt("#");
//        System.out.println(v);

//        char ch= (char) Integer.parseInt("4");
//        if(Character.isDigit(ch))
//            System.out.println(ch-'0');
        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
        int sum=0;
        for (String val:array){
            try{
                sum=sum+Integer.parseInt(val);
            }catch (Exception e){

            }
        }
        System.out.println(sum);
    }
}
