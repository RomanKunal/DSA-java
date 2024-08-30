package Array;

import java.util.Arrays;

public class Second_Largest_Array {
    public static void main(String[] args) {
        int [] arr={-2,2,3,1,5,4};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);
    }
}
