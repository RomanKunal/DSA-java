package RevisionForPlacement.Arrays;

public class Q1 {
    public static void main(String[] args){
        int[] arr={2,5,1,3,0};
        System.out.println(largest(arr));
    }
    static int largest(int[] arr){
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
