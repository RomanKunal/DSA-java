package RevisionForPlacement.Arrays.BitManipulation;

public class Checkithbit {
    public static void main(String[] args) {
        int num=13;
        int i=2;
        check(num,i);

    }
    static void check(int num,int i){
        int mask=num<<i;
        if((num&mask)!=0){
            System.out.println(" SET");
        }else{
            System.out.println("NOT SET");
        }

    }
    static String convert(int num){
        String res="";
        while (num>0){
            int bit=num%2;
            res=bit+res;
            num=num/2;
        }
        return res;
    }
}
