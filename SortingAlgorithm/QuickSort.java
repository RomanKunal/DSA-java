package SortingAlgorithm;

public class QuickSort {
    public static void main(String[] args) {

    }
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);

        }
    }
    static void partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for (int j = low; j < high; j++) {
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
    }

}
