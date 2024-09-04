package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Left_Rotate_Array {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(call(arr)));
    }
    static int[] call(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
