package RevisionForPlacement.Arrays;

import java.util.HashSet;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3};
        System.out.println(check(arr));
    }
    static int check(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);
        }
        int k=set.size();
        int j=0;
        for (int num:set) {
            arr[j++]=num;
        }
        return k;
    }
}
