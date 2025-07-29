package RevisionWork.Arrays.Sorting;
import java.util.*;

public class Ques29_7 {
    public static void main(String[] args) {
//        String str = "(()())(())";
//        String result = removeParenthesis(str);
//        System.out.println(result);
//        String str="35427";
//        System.out.println(largestOdd(str));
//        String[] arr={"flower","flow","flight"};
//        System.out.println(longestCommonPrefix(arr));
        String str1="abcde";
        String str2="cdeab";
        System.out.println(rotateString(str1,str2));
        String str="truee";
        System.out.println(frequencyString(str));

    }

    // Remove outermost parentheses
    static String removeParenthesis(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                if (count ==1) {
                    sb.append(ch);
                }
                count++;
            } else if (ch == ')') {
                count--;
                if (count ==1) {
                    sb.append(ch);
                }
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
    // Largest Odd number in the string
    static String largestOdd(String str){
        for (int i = str.length()-1; i >=0 ; i--) {
            if((str.charAt(i)-'0')%2==1){
                return str.substring(0,i+1);
            }
        }
        return "";
    }
    // Longest Common Prefix
    static String longestCommonPrefix(String[] arr){
        String prefix=arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (!arr[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    // Isomorphic String
    static boolean isomorphicString(String str1,String str2){
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> mapped=new HashSet<>();
        if(str1.length()!=str2.length()){
            return false;
        }
        for (int i = 0; i <str1.length() ; i++) {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(map.containsKey(ch1)){
                if(ch1!=ch2){
                    return false;
                }
            }else{
                if(mapped.contains(ch2)){
                    return false;
                }
                map.put(ch1,ch2);
                mapped.add(ch2);
            }
        }
        return true;
    }
    // Rotate String
    static boolean rotateString(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        return (str1+str1).contains(str2);
    }
    // Anagram String
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char [] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    // Frequency Sorting
    static String frequencyString(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch= str.toCharArray();
        for (char c:ch) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String res="";
        List<Map.Entry<Character,Integer>> lst=new ArrayList<>(map.entrySet());
        lst.sort((a,b)-> b.getValue()-a.getValue());
        for (Map.Entry<Character,Integer> e:lst){
            char c=e.getKey();
            int freq=e.getValue();
            for (int i = 0; i <freq ; i++) {
                res+=c;
            }
        }
        return res;
    }
}
