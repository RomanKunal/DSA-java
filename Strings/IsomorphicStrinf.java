package Strings;

import java.util.Hashtable;

public class IsomorphicStrinf {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        System.out.println(check(s1,s2));
    }
    static boolean check(String str,String t){
        if(str.length()!=t.length()){
            return false;
        }
        Hashtable<Character,Character> table1=new Hashtable<>();
        Hashtable<Character,Character> table2=new Hashtable<>();
        // NOW MAP ONE TABLE TO ANOTHER AND ANOTHER TO ONE

        for (int i = 0; i <str.length() ; i++) {
            char first=str.charAt(i);
            char second=t.charAt(i);

            // map
            if(table1.containsKey(first)){
                if(table1.get(first)!=second){
                    return false;
                }
            }
            else{
                table1.put(first,second);
            }

            // map second one
            if(table2.containsKey(second)){
                if(table2.get(second)!=first){
                    return false;
                }
            }
            else{
                table2.put(second,first);
            }
        }
        return true;
    }
}
