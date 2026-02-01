public class p36 {
    public static void main(String[] args) {
        //binary to decimal

//        String bi="1010";
//        int res=0;
//        for (int i = 0; i < bi.length(); i++) {
//            res=res<<1;
//            res=res+bi.charAt(i)-'0';
//        }
//        System.out.println(res);

        //decimal to binary

        int deci=10;
        int place=1;
        int binary=0;

        while (deci>0){
            int lastBit=deci&1;
            binary=lastBit*place+binary;
            place*=10;
            deci=deci>>1;
        }
        System.out.println(binary);

        //number to check odd or even
        int num=4;
        if((num&1)==0)
            System.out.println("Its Even");
        else
            System.out.println("It's Odd");
    }
}
