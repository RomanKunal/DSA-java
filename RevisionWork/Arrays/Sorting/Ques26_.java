package RevisionWork.Arrays.Sorting;

public class Ques26_ {
    public static void main(String[] args) {

    }
    //minimize window sum
    static int minwindow(int[] arr,int k){
        int sum=0;
        for (int i = 0; i <k ; i++) {
            sum+=arr[i];
        }
        int minsum=sum;
        for (int i = k; i <arr.length ; i++) {
            sum+=arr[i]-arr[i-k];
            minsum=Math.min(minsum,sum);
        }
        return minsum;
    }
}
