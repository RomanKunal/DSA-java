package Array;

import java.util.ArrayList;
import java.util.*;
public class Find_Union {
    public static void main(String[] args) {
        int [] arr1={1,1,2,3,4,5};
        int[] arr2={5,9,10};
        ArrayList<Integer> res=FindUnion(arr1,arr2,arr1.length,arr2.length);
        System.out.println(res);

    }
    // BRUTE FORCE
//    static ArrayList<Integer> call(int[] arr1,int [] arr2,int m,int n){
//        HashSet<Integer> s=new HashSet<>();
//        ArrayList<Integer> union=new ArrayList<>();
//        for (int i=0;i<m;i++){
//            s.add(arr1[i]);
//        }
//        for(int j=0;j<n;j++){
//            s.add(arr2[j]);
//        }
//        for (int i:s) {
//            union.add(i);
//        }
//        return union;
//    }


    // OPTIMAL APPROACH
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}
