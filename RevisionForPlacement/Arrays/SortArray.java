package RevisionForPlacement.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={1,2,-4,-5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        for (int i = 0; i <arr.length/2 ; i++) {
            arr[2*i]=pos.get(i);
            arr[2*i+1]=neg.get(i);
        }
    }
}
