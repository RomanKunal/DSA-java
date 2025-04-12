package SortingAlgorithm;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : arr) {
            arrayList.add(num);
        }
        reverseArray1(arrayList, 3);
    }

    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);

        }
    }
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for (int j = low; j <high ; j++) {
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[j]=arr[i];
                arr[j]=high;
            }

        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void reverseArray1(ArrayList<Integer> arr, int m)
    {
        int n  = arr.size();
        int start = m;
        int end = n-1;
        while(start<end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;

        }
        System.out.print(arr.toString());
    }

}
