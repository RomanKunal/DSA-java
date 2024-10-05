package Strings;

public class ImplementOfAnoi {
    public static void main(String[] args) {

    }
    static int check(String str){
        int index=0;
        int sign=1;
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        int value=0;
        // ignoring whitespaces
        while(index<str.length() && str.charAt(index)==' '){
            index++;
        }

        // handle case
        if(index<str.length() && (str.charAt(index)=='-' || str.charAt(index)=='+')){
            sign=str.charAt(index)=='-'?-1:1;
            index++;
        }

        // conversion
        while(index<str.length() && str.charAt(index)>='0' && str.charAt(index)<='9'){
            value=value*10+(str.charAt(index)-'0');
            index++;

            if(value*sign>max){
                return max;
            }
            if(value*sign<min){
                return min;
            }
        }
        return (int) (value*sign);

    }
}
