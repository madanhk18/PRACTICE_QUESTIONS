public class p75 {
    public static void main(String[] args) {
        /*
        📅 Day 1 Question
🟡 Problem: First Non-Repeating Substring Character

You are given a string s.

Return the first character (from left to right) whose frequency is exactly 1 and whose index is even.

If no such character exists, return '#'.
Input: "leetcode"
Output: 'l'
         */
        String s="aabbccd";
        System.out.println(nonRepeatingString(s));

    }
    public static char nonRepeatingString(String s){
        int arr[]=new int[26];

        for (char c:s.toCharArray()){
            arr[c-'a']++;
        }

        for (int i = 0; i <s.length() ; i++) {
            if(arr[s.charAt(i)-'a']==1 && i%2==0)
                return s.charAt(i);
        }
        return '#';
    }
}
