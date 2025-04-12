package RevisionForPlacement.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

public class UnionSet {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr1={2,3,4,4,5};

    }
    static ArrayList<Integer> call(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i <arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i <arr2.length ; i++) {
            set.add(arr2[i]);
        }
        for (int i:set) {
            arr.add(i);
        }
        return arr;
    }
}
