package RevisionForPlacement.Arrays.BitManipulation;

public class ConverttoBinary {
    public static void main(String[] args) {
        String res="";
        int n=13;
        while(n>0){
            int bit=n%2;
            res=bit+res;
            n=n/2;
        }
        System.out.println(res);

    }

}
