public class p6 {
    public static void main(String[] args) {
        /*9.) Array consists of integers and special
characters,sum only integers

         */
        String[] array = {"5", "20", "9", "a", "1", "6", "#", "3"};
        sumValue(array);
    }
    public static void sumValue(String []array){
        int sum=0;
//        for (int i = 0; i < array.length; i++) {
//            char ch=array[i].charAt(0);
//            if(Character.isDigit(ch)) {
//                sum=sum+Character.getNumericValue(ch);
//            }
//        }
        for (String g:array){
            try {
                int n=Integer.parseInt(g);
                sum+=n;
            }catch (Exception r){

            }
        }
        System.out.println(sum);
    }
}