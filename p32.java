public class p32 {
    public static void main(String[] args) {
        /*
        13.) Java program to print each letter twice
from a given string
         */
        String val="hello";
        StringBuilder sb=new StringBuilder();
        for (char ch:val.toCharArray()){
            sb.append(ch).append(ch);
        }
        System.out.println(sb.toString());
    }
}
