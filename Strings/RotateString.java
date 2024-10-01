package Strings;

public class RotateString {
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        System.out.println(check(s,goal));
    }
    static boolean check(String str,String goal){
        String res=str.concat(str);
        if(str.length()!=goal.length()){
            return false;
        }
        return res.contains(goal);
    }
}
