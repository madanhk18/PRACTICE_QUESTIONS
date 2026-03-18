public class p67 {


        public static int checkReturn() {
            try {
                return 5;
            } catch (Exception e) {
                return 4;
            } finally {
                return 7;
            }
        }


    public static void main(String[] args) {

        System.out.println(checkReturn());


        String m="A man, a plan, a canal: Panama";

        int left=0,right=m.length()-1;

        while (left<right){
            while (left<right && !Character.isLetterOrDigit(m.charAt(left))){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(m.charAt(right))){
                right--;
            }
            if (Character.toLowerCase(m.charAt(left))!=Character.toLowerCase(m.charAt(right))) {
                System.out.println("Not a palindrome");
                return;
            }

            left++;right--;
        }
        System.out.println("It's an Palindrome");
    }


}




