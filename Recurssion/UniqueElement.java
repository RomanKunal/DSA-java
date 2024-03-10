package Recurssion;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,4,3,4,6};
        //System.out.println(check(arr));
        System.out.println(call(arr));
    }
    /*static int check(int[] arr){
        int uni=0;
        for (int i:arr) {
            uni^=i;
        }
        return uni;
    }*/

    //ANOTHER METHOD TO SOLVE THIS
    static int call(int[] arr){
        Arrays.sort(arr);
        Arrays.toString(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
