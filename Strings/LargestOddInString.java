package Strings;

public class LargestOddInString {
    public static void main(String[] args) {
        String str="78989";
        System.out.println(output(str));
    }
    static String output(String str){
        for (int i = str.length(); i >=0 ; i--) {
            if(i!=0 && str.charAt(i-1)%2!=0){
                return str.substring(0,i);
            }
            if(i==0){
                if(i%2!=0){
                    return str.substring(0,1);
                }
            }
        }
        return " ";
    }
}
