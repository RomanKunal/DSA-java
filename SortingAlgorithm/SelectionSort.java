package SortingAlgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            //assume first index as min
            int minindex=i;
            //find actual minimum
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[j+1]){
                    minindex=j;
                }
            }
            //swap
            if(minindex!=i){
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }
    }
}
