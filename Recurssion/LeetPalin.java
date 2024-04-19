package Recurssion;

public class LeetPalin {
    public static void main(String[] args) {
        System.out.println(call("babad"));
    }
    static String call(String s){

    String newstr="";
        for(int i=0;i<s.length();i++){
        for(int j=i+1;j<=s.length();j++){
            String sub=s.substring(i,j);
            if(isPalindrome(sub) && sub.length()>newstr.length()){
                newstr=sub;
            }
        }
    }
        return newstr;
}
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
//        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
