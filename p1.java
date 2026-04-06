public class p1 {
    public static void main(String[] args) {
        String s="Hello@123";
        /*
Uppercase: 1
Lowercase: 4
Digits: 3
Special Characters: 1
         */
        int up=0,lo=0,digi=0,spc=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i)))
                up++;
            else if(Character.isLowerCase(s.charAt(i)))
                lo++;
            else if(Character.isDigit(s.charAt(i)))
                digi++;
            else if (Character.isSpaceChar(s.charAt(i))) {
                spc++;
            }
        }
        System.out.println("Uppercase: "+up);
        System.out.println("Lowercase:"+lo);
        System.out.println("Digits:"+digi);
        System.out.println("Special Characters :"+spc);
    }
}
