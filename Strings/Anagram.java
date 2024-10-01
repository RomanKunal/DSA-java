package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

    }
    static boolean check(String str,String str2){

        char[] arr1=str.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}
