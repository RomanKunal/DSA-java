package RevisionForPlacement.Arrays;

public class SecondLargestinArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,7,5};
        System.out.println(second(arr));
    }
    static int second(int[] arr){
        int largest= Integer.MIN_VALUE;
        int secondlargest= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondlargest && arr[i]!=largest) {
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
}
