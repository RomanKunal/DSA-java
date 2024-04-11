package Recurssion;

import java.util.ArrayList;

public class Mobilenum {
    public static void main(String[] args) {
       // mobile(" ","12");
        System.out.println(call(" ","12"));
    }
//    static void mobile(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        int digit=up.charAt(0)-'0';
//        for (int i = (digit-1)*3; i < digit*3 ; i++) {
//            char ch=(char)('a'+i);
//            mobile(ch+p,up.substring(1));
//        }
//    }

    static ArrayList<String> call(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch=(char)('a'+i);
            ans.addAll(call(p+ch,up.substring(1)));
       }
        return ans;
    }
}
