package RevisionForPlacement.Arrays.BitManipulation;

public class ToggleTheBit {
    public static void main(String[] args) {
        int num=13;
        int i=1;
        int shft=1<<i;
        int res=num^shft;
        System.out.println(res);
    }
}
