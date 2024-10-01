package Strings;

import java.util.Hashtable;

public class ConvertingRomanToInteger {
    public static void main(String[] args) {
        String str="LVIII";
        System.out.println(convert(str));
    }
    static int convert(String str){
        Hashtable<Character,Integer> roman=new Hashtable<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int result=0;
        for (int i = 0; i <str.length() ; i++) {
            if(i+1<str.length() && roman.get(str.charAt(i))<roman.get(str.charAt(i+1))){
                result-=roman.get(str.charAt(i));
            }else{
                result+=roman.get(str.charAt(i));
            }
        }
        return result;
    }
}
