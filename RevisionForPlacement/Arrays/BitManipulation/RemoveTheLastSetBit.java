package RevisionForPlacement.Arrays.BitManipulation;

public class RemoveTheLastSetBit {
    public static void main(String[] args) {
        int num=40;
        int res=num&(num-1);
        System.out.println(res);
    }
}
