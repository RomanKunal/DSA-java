package RevisionForPlacement.Arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        int m=arr1.length;
        int n=arr2.length;
        merge(arr1, m,arr2,n);
        System.out.println("arr1: " + Arrays.toString(arr1));
    }

    static void merge(int[] arr1, int m, int[] arr2, int n) {
        int left = m - 1;
        int right = 0;

        // Step 1: Swap the end of arr1 with start of arr2 if needed
        while (left >= 0 && right < n) {
            if (arr1[left] > arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        // Step 2: Sort both arrays
        Arrays.sort(arr1, 0, m);     // Only sort the filled part of arr1
        Arrays.sort(arr2);          // Sort all of arr2

        // Step 3: Copy arr2 into arr1

    }
}
