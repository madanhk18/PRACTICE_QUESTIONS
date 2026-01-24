public class p29 {
    public static void main(String[] args) {
        /*
        8.) Java program to determine if Two Strings are
Anagrams
public class Main {
public static void main(String[] args) {
String str1 = "listen";
String str2 = "silent";
System.out.println(areAna
         */
        String str1 = "listen";
        String str2 = "silent";
        checkAnagrams(str1,str2);
    }
    public static void checkAnagrams(String str1,String str2){
        if(str1.length()!=str2.length()) System.out.println("Not anagrams");
        str1.toLowerCase();
        str2.toLowerCase();

        int arr[]=new int[26];
        for (char ch:str1.toCharArray()){
            arr[ch-'a']++;
        }
        for (char ch:str2.toCharArray()){
            arr[ch-'a']--;
        }
        for(int v:arr){
            if(v!=0) {
                System.out.println("It's not Anagram");
                return;
            }
        }
        System.out.println("Both are anagrams");
    }
}
