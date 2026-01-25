public class p31 {
    public static void main(String[] args) {
        /*
        11.) Java program to print even indexed
characters
         */
//        String n="Automation";
//        for (int i = 0; i < n.length(); i++) {
//            if(i%2==0)
//                System.out.println(n.charAt(i));
//        }

        /*
        12.) Java program to remove space from a
given string
         */
        String sentence="Welcome to Java World";
        sentence=sentence.trim().replaceAll("\\s+","");
        System.out.println(sentence);
    }
}
