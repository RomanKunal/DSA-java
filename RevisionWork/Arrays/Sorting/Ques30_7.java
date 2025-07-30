package RevisionWork.Arrays.Sorting;

import java.nio.file.StandardWatchEventKinds;
import java.util.Arrays;
import java.util.Stack;

public class Ques30_7 {
    public static void main(String[] args) {
        String str="1337c0d3";
        System.out.println(convertAtoi(str));
        String str1="babad";
        System.out.println(longestPalindromic(str1));
        String str2="the sky is blue";
        System.out.println(reverseWord(str2));

    }
    // Convert Atoi
    static int convertAtoi(String str){
        str=str.trim();
        int sign=1,i=0;
        long res=0;
        if(str.length()==0){
            return 0;
        }
        if(str.charAt(0)=='-'){
            sign=-1;
            i++;
        }else if(str.charAt(0)=='+'){
            i++;
        }
        while(i<str.length()){
            char ch=str.charAt(i);
            if(ch<'0'||ch>'9') break;
            res=res*10+(ch-'0');
            i++;
        }
        return (int)(sign*res);
    }
    // Longest Palindromic Substring
    static String longestPalindromic(String str){
        String longest="";
        int maxlength=0;
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i; j <str.length() ; j++) {
                String sub=str.substring(i,j+1);
                if(palindrome(sub) && sub.length()>maxlength){
                    longest=sub;
                    maxlength=sub.length();
                }
            }
        }
        return longest;
    }
    static boolean palindrome(String str){
        int left=0;
        int right=str.length()-1;
        char [] ch=str.toCharArray();
        while(left<right){
            if(ch[left]!=ch[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // Sum of beauty of all substring maxFrequency-MinFreq
    static int beautySubstring(String str) {
        int totalBeauty = 0;
        for (int i = 0; i < str.length(); i++) {
            int[] freq = new int[26];
            for (int j = i; j < str.length(); j++) {
                freq[str.charAt(j) - 'a']++;
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }
                totalBeauty += (maxFreq - minFreq);
            }
        }
        return totalBeauty;
    }
    // Reverse word of each string
    static String reverseWord(String str) {
        String[] arr = str.trim().split("\\s+");
        String res = "";
        Stack<String> st = new Stack<>();
        for (String s : arr) {
            st.push(s);
        }
        while (!st.isEmpty()) {
            String item = st.pop();
            res = res + item + " ";
        }
        return res.trim();
    }
    // integer to roman conversion
    public static String intToRoman(int num) {
        // Arrays of values and corresponding Roman symbols
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10,  9,   5,  4,   1};
        String[] symbols ={"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        // Loop through each value-symbol pair
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
    //Excel sheet column number
    static int excelColumn(String str){
        int res=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int val=ch-'A'+1;
            res=res*26+val;
        }
        return res;
    }
    //Excel Column title
    static String columnTitle(int num){
        StringBuilder sb=new StringBuilder();
        while (num>0){
            num--;
            int rem=num%26;
            sb.append((char)('A'+rem));
            num/=26;
        }
        return sb.reverse().toString();
    }
    // Largest Number from a string
    static String largestNumber(int[] arr){
        String[] res=new String[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            res[i]=String.valueOf(arr[i]);
        }
        Arrays.sort(res,(a,b)->(b+a).compareTo(a+b));
        if(res[0].equals("0")) return "0";
        StringBuilder ans=new StringBuilder();
        for (String str:res) {
            ans.append(str);
        }
        return ans.toString();
    }
}
