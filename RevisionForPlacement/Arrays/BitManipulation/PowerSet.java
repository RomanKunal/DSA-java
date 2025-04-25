package RevisionForPlacement.Arrays.BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        int power = (int) Math.pow(2, n); // Total subsets = 2^n

        for (int i = 0; i < power; i++) { // Include i = power - 1 too
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) { // Check every bit of i
                if ((i & (1 << j)) != 0) { // Fix: shift j, not i
                    list.add(arr[j]);     // Fix: add arr[j], not arr[i]
                }
            }
            res.add(list);
        }

        // Print the power set
        for (List<Integer> subset : res) {
            System.out.println(subset);
        }
    }
}
