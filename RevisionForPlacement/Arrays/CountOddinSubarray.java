package RevisionForPlacement.Arrays;

public class CountOddinSubarray {
    public static void main(String[] args) {

    }
    static int check(int[] arr,int k){
        int count=0;
        int l=0;
        int odd=0;
        for (int r = 0; r < arr.length; r++) {
            if(arr[r]%2==1){
                odd++;
            }
            while (odd>k){
                if(arr[l]%2==1){
                    odd--;
                }
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }
}
