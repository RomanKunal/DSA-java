package Strings;

import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String [] arr={"flower","flow","flight"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(output(arr));
    }
    static String output(String[] str){
        Arrays.sort(str);
        String s1=str[0];
        String s2=str[str.length-1];
        int index=0;
        while(index<s1.length() && index<s2.length()){
            if(s1.charAt(index) == s2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,index);
    }

}
