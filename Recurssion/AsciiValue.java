package Recurssion;

public class AsciiValue {
    public static void main(String[] args) {
        seq("","abc");
    }
    static void seq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        seq(p,up.substring(1));
        seq(p+ch,up.substring(1));
        seq(p+(ch+0),up.substring(1));
    }
}
