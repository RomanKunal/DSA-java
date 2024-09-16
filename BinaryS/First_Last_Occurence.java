package BinaryS;

import java.util.ArrayList;

public class First_Last_Occurence {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int key = 8;
        ArrayList<Integer> res = new ArrayList<>();

        int first = first(arr, key);
        int last = last(arr, key);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }

    // Function to find the first occurrence of the key
    static int first(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                res = mid;
                high = mid - 1; // Keep looking in the left half
            } else if (arr[mid] > key) {
                high = mid - 1; // Search the left half
            } else {
                low = mid + 1;  // Search the right half
            }
        }
        return res;
    }

    // Function to find the last occurrence of the key
    static int last(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                res = mid;
                low = mid + 1; // Keep looking in the right half
            } else if (arr[mid] > key) {
                high = mid - 1; // Search the left half
            } else {
                low = mid + 1;  // Search the right half
            }
        }
        return res;
    }
}
