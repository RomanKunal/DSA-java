package RevisionWork.Arrays.Sorting;

public class InsertionSort {
    public static void main(String[] args) {

    }
    static void sort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
