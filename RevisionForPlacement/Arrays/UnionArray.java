package RevisionForPlacement.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = check(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }
    static ArrayList<Integer> check(int[] arr1, int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> uni=new ArrayList<>();
        for (int i = 0; i <arr1.length ; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        for (int i:set) {
            uni.add(i);
        }
        return uni;
    }
}
