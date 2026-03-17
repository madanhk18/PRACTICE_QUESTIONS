public class p66 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//        System.out.println(s);
        StringBuilder sb=new StringBuilder(s);
        if (sb.reverse().toString().equals(s))
            System.out.println("Palindrome it is");
        else
            System.out.println("Not a palindrome one");
    }
}
