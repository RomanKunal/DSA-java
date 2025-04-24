package RevisionForPlacement.Arrays.BitManipulation;

public class CountSetBit {
    public static void main(String[] args) {
        int num=13;
        int count=0;
        while(num>0){
            int bit=num%2;
            if(bit==1){
                count+=1;
            }
            num=num/2;
        }
        System.out.println(count);
    }
}
