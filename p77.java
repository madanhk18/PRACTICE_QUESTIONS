public class p77 {
    public static void main(String[] args) {
        /*
        This is a Java Program to Extract Digits from A Given Integer.
Enter any integer as input. After that we perform several operations like modulus and division to know the number of digits in given integer and then print each of the digits of the given number.
         */
        int number=321;
        funToPrint(number);
    }
    public static void  funToPrint(int number){

        int digit=0;
        String val=String.valueOf(number);
        for(char c:val.toCharArray()){
            int value= c-'0';
            value++;
            digit=digit*10+value;
        }
        System.out.println(digit);
    }
}
