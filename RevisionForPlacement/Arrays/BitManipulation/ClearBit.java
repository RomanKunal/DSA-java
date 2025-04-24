package RevisionForPlacement.Arrays.BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        int num=13;
        int i=2;
        int shift=~(1<<i);
        int res=num&shift;
        System.out.println(res);
    }
}
