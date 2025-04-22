package RevisionForPlacement.Arrays.BitManipulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String str="1101";
        int ans=decimal(str);
        System.out.println(ans);

    }
    static int decimal(String str){
        int res=0;
        for (int i = str.length()-1; i >=0; i--) {
            if(str.charAt(i)=='1'){
                res+=(int)(Math.pow(2,str.length()-1-i));
            }
        }
        return res;
    }
}
