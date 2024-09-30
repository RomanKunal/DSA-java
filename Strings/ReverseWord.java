package Strings;

public class ReverseWord {
    public static void main(String[] args) {
        String str="hello world ";
        System.out.println(check(str));
    }
    static String check(String str){
        String[] word=str.split(" ");
        StringBuilder res=new StringBuilder();
        for (int i = word.length-1 ;i >=0 ; i--) {
            res.append(word[i]).append(" ");
        }
        return res.toString().trim();
    }
}
