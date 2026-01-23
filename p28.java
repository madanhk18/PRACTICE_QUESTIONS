public class p28 {
    public static void main(String[] args) {
        /*
        5.) Java program to count the number of words in
a string
}
public class M
         */
        String sen="Welcome to Java World";
        String arr[]=sen.replaceAll("\\s+"," ").split(" ");
        System.out.println(arr.length);
    }
}
