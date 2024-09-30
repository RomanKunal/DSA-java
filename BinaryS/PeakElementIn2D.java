package BinaryS;

import java.util.Arrays;

public class PeakElementIn2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,15},
                {21,30,14},
                {7,16,32}
        };
        int[] peak=findPeak(matrix);
        System.out.println(Arrays.toString(peak));
    }
    static boolean isPeak(int[][] arr, int i, int j, int row, int cols) {
        int current = arr[i][j];

        // Top case: if the element above is greater, return false
        if (i > 0 && arr[i - 1][j] > current) {
            return false;
        }

        // Bottom case: if the element below is greater, return false
        if (i < row - 1 && arr[i + 1][j] > current) {
            return false;
        }

        // Left case: if the element to the left is greater, return false
        if (j > 0 && arr[i][j - 1] > current) {
            return false;
        }

        // Right case: if the element to the right is greater, return false
        if (j < cols - 1 && arr[i][j + 1] > current) {
            return false;
        }

        // If none of the neighbors are greater, it is a peak
        return true;
    }

    // Function to find any peak element
    static int[] findPeak(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Traverse the entire matrix to find the peak element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isPeak(arr, i, j, rows, cols)) {
                    // Return the coordinates of the peak element
                    return new int[] {i, j};
                }
            }
        }

        // If no peak found (failsafe, there should always be a peak in valid inputs)
        return new int[] {-1, -1};
    }
}
