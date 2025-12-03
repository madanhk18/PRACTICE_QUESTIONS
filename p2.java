public class p2 {
    public static void main(String[] args) {
        char ch='1';
        if(Character.isLetter(ch))
            System.out.println(Character.getNumericValue(ch));
        else
            System.out.println("NO NOT A NUMBER");
//            System.out.println(Character.getNumericValue((int)ch));
    }
}
