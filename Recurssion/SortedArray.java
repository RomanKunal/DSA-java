package Recurssion;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,6};
        System.out.println(check(arr,0));
    }
    static boolean check(int[] arr,int index) {
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && check(arr,index+1);
    }

}
