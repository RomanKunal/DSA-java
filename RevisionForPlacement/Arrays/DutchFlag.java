package RevisionForPlacement.Arrays;

public class DutchFlag {
    public static void main(String[] args) {

    }
    static void check(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
