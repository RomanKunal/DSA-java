package Recurssion;

public class Leet41 {
    public static void main(String[] args) {
        int [] arr={3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each positive integer i at index i-1 if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positive integers from 1 to n are present, return n + 1
        return n + 1;
    }
}
