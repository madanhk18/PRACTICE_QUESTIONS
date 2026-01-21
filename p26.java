import java.util.Arrays;

public class p26 {
    public static void main(String[] args) {
        /*
        2.) Java program to reverse each word of a given
string
public static void main(String[] args) {
reverseEachWordOfString("Java is good programming langauges");
         */
        String sen="Java is good    programming langauges";
        revEachWord(sen);
    }
    public static void revEachWord(String sen){
        String arr[]=sen.replaceAll("\\s+"," ").split(" ");
//
        for (int i = 0; i < arr.length; i++) {
            String value=arr[i];
            String reversed=new StringBuilder(value).reverse().toString();
            arr[i]=reversed;
        }

        for (String v:arr){
            System.out.print(v+" ");
        }
    }
}
