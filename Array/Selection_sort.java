package Array;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={2,4,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for (int i = 0; i <=arr.length-1 ; i++) {
            int mini=i;
            for (int j = i; j <arr.length ; j++) {
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }
}
