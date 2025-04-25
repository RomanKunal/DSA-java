package RevisionForPlacement.Arrays.BitManipulation;

public class MinimumBitFlip {
    public static void main(String[] args) {
        int start=10;
        int goal=7;
        int count=0;
        int ans=start^goal;
        for(int i=0;i<31;i++){
            int shft=1<<i;
            if((ans&shft)!=0){
                count+=1;
            }
        }
        System.out.println(count);
    }

}
