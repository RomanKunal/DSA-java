package Array;

import java.util.ArrayList;
import java.util.Arrays;


public class Median_oftwoarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2, 4};

        int[] mergedArray = mergeAndSort(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));

        int total = mergedArray.length;
        if (total % 2 == 1) {
            double res = mergedArray[total / 2];
            System.out.println("Median: " + res);
        } else {
            int middle1 = mergedArray[total / 2];
            int middle2 = mergedArray[total / 2 - 1];
            double res = (middle2 + middle1) / 2.0;
            System.out.println("Median: " + res);
        }
    }

    // Merge two arrays and sort them
    public static int[] mergeAndSort(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        merge(arr1, arr2, merged);
        return merged;
    }

    // Merge two sorted arrays into one sorted array
    static void merge(int[] arr1, int[] arr2, int[] merged) {
        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and merge them
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
    }
}
