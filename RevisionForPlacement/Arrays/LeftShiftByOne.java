package RevisionForPlacement.Arrays;

import java.util.Arrays;

public class LeftShiftByOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(check(arr)));
    }
    static int[] check(int[] arr){
        int[] temp=new int[arr.length];
        for (int i = 1; i <arr.length ; i++) {
            temp[i-1]=arr[i];
        }
        temp[arr.length-1]=arr[0];
        return temp;
    }
}
