package RevisionForPlacement.Arrays;

public class MaximumPoints {
    public static void main(String[] args) {

    }
    public int maxScore(int[] arr, int k) {
        int maxsum=0;
        int lsum=0;
        int rsum=0;
        for(int i=0;i<k;i++){
            lsum+=arr[i];
            maxsum=lsum;
        }
        int right=arr.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-arr[i];
            rsum+=arr[right];
            right-=1;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}
