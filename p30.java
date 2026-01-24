public class p30 {
    public static void main(String[] args) {
        /*
        9.) Java program to Count Vowels and Consonants
in a given string
         */
        String input="mynameisMadan";
        countVowelsConsonents(input);
    }
    public static void countVowelsConsonents(String input){
        int vowels=0,cons=0;
        input=input.toLowerCase().replaceAll("\\s+","");
        for (char c:input.toCharArray()){
            if(c>='a' && c<='z'){
                if("aeiou".indexOf(c)!=-1)
                    vowels++;
                else
                    cons++;
            }
        }
        System.out.println("Vowels ="+vowels+" Consonents = "+cons);
    }
}
