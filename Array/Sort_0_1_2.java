package Array;

import java.util.Arrays;

public class Sort_0_1_2 {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,1,2,1,2,0,0,0,1};
        swap(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
//    static void call(int[] arr){
//        int count_0=0;
//        int count_1=0;
//        int count_2=0;
//        for (int j : arr) {
//            if (arr[j] == 0) {
//                count_0++;
//            } else if (arr[j] == 1) {
//                count_1++;
//            } else {
//                count_2++;
//            }
//        }
//        for (int i = 0; i <count_0 ; i++) {
//            arr[i]=0;
//        }
//        for (int i = count_0; i < count_1+count_0; i++) {
//            arr[i]=1;
//        }
//        for (int i = count_0+count_1; i < arr.length ; i++) {
//            arr[i]=2;
//        }
//    }

    // OPTIMAL APPROACH       DUTCH NATIONAL FLAG AGLO HAVING THREE POINTERS
    static void swap(int[] arr,int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}
