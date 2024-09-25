package BinaryS;

public class PainterProblem {
    public static void main(String[] args) {
        int[] arr={5,5,5,5};
        int k=2;
        System.out.println(brute(arr,k));

    }
    static int countpainter(int[] arr, int time) {
        int painter = 1;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (total + arr[i] <= time) {
                total += arr[i];
            } else {
                painter++;
                total = arr[i]; // Reset total to the current element, not add it
            }
        }

        return painter;
    }

    static int brute(int[] arr, int k) {
        int low = Integer.MIN_VALUE;

        // Find the maximum element in the array (low should be the maximum job time)
        for (int i = 0; i < arr.length; i++) {
            low = Math.max(arr[i], low);
        }

        // Calculate the sum of all elements in the array (this is the upper bound)
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Try all possible times from 'low' to 'sum'
        for (int i = low; i <= sum; i++) {
            if (countpainter(arr, i) <= k) {
                return i;
            }
        }

        return low;
    }
}
