public class p25 {
    public static void main(String[] args) {
        /*
        1.) Java program to reverse a string
         */
        String name="MohammadSufyan";
        reverseString(name);
    }
    public static void reverseString(String s){
        //option 1
        String result="";
        for (int i = s.length()-1; i >=0 ; i--) {
            char ch=s.charAt(i);
            result+=ch;
        }
        System.out.println("OPtion 1");
        System.out.println(result);

        //option 2
        StringBuilder sb=new StringBuilder(s);
        String aans=sb.reverse().toString();
        System.out.println("Option 2");
        System.out.println(aans);
    }
}
