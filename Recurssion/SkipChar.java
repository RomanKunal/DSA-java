package Recurssion;

public class SkipChar {
    public static void main(String[] args) {
        skip("","baccad");
    }
    static void skip(String pro,String unpro){
        if(unpro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch=unpro.charAt(0);
        if(ch=='a'){
            skip(pro,unpro.substring(1));
        }else{
            skip(pro + ch,unpro.substring(1));
        }
    }
}
