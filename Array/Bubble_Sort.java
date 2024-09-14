package Array;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr={2,3,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for (int i = arr.length-1; i >=0; i--) {
            for (int j = 0; j <=arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
