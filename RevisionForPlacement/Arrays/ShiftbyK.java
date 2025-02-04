package RevisionForPlacement.Arrays;

public class ShiftbyK {
    public static void main(String[] args) {

    }
    static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void shift(int[] arr,int n,int k){
        // reverse last k element
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
}
