package RevisionForPlacement.Arrays;
import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={1,3,2};
        generatePermutations(arr);

    }
     static void generatePermutations(int[] arr) {
        // List to store the result
        List<List<Integer>> result = new ArrayList<>();
        // Call the helper function to generate permutations
        generate(arr, 0, result);

        // Print all the permutations
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void generate(int[] arr,int index,List<List<Integer>> result){
        if(index==arr.length){
            List<Integer> per=new ArrayList<>();
            for (int num:arr) {
                per.add(num);
            }
            result.add(per);
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr,i,index);
            generate(arr,index+1,result);
            swap(arr,i,index);
        }

    }
}
