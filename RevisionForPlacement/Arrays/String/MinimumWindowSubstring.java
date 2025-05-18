package RevisionForPlacement.Arrays.String;
import java.util.*;
public class MinimumWindowSubstring {
    public static void main(String[] args) {

    }
    //Brute Force
    public String minWindow(String s, String t) {
        String res="";
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(containsAllChars(sub,t)){
                    if(sub.length()<minlen){
                        minlen=sub.length();
                        res=sub;
                    }
                }
            }
        }
        return res;
    }
    private boolean containsAllChars(String window, String t) {
        HashMap<Character, Integer> windowMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char ch : window.toCharArray()) {
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : tMap.keySet()) {
            if (windowMap.getOrDefault(ch, 0) < tMap.get(ch)) {
                return false;
            }
        }

        return true;
    }
    // Optimal Solution


}
