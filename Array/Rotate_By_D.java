package Array;

import java.util.Arrays;

public class Rotate_By_D {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int d=3;
        reverseArray(arr,0,0+d);
        reverseArray(arr,0+d,0+arr.length);
        reverseArray(arr,0,0+arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArray(int[] array,int left,int right) {
        right= array.length-1;

        // Swap elements from the start and end until the middle is reached
        while (left < right) {
            // Swap the elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers
            left++;
            right--;
        }
    }
}
