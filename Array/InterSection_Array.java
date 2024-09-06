package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class InterSection_Array {
    public static void main(String[] args) {
        int[] arr1={1,2,2,3,3,4,5,6};
        int[] arr2={2,3,3,5,6};
        ArrayList<Integer> res=call(arr1,arr2,arr1.length,arr2.length);
        System.out.println(res);

    }
    static ArrayList<Integer> call(int[] arr1,int[] arr2,int m,int n){
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                i++;
            } else if (arr1[i]>arr2[j]) {
                j++;
            }
            else{
                res.add(arr1[i]);
                i++;
                j++;
            }
        }
        return res;
    }
}
