package Array;

public class Largest_Element_of_Array {
    public static void main(String[] args) {
//        int[] arr={3,2,1,4,2,-1,10};
//        int len=arr.length;
//        int max=0;
//        for (int j : arr) {
//            if (j > max) {
//                max = j;
//            }
//        }
//        System.out.println("max value: " + max);



        //Solution 2
        int [] arr={3,2,1,5,2,-11,-9092029,9999};
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("MAX: "+max);
    }



}
