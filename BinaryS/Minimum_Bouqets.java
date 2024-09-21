package BinaryS;
import java.util.*;

public class Minimum_Bouqets {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = check(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);

    }
    static boolean possible(int[] arr, int days, int m, int k) {
        int count = 0;
        int bouq = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                count++;
                if (count == k) {
                    bouq++;
                    count = 0; // Reset count after making a bouquet
                }
            } else {
                count = 0; // Reset count if the flower is not ready
            }

            // If we've already made enough bouquets, return true
            if (bouq >= m) {
                return true;
            }
        }

        return bouq >= m;
    }

    static int check(int[] arr,int m,int k){
        long val=(long) m*k;
        if(val>arr.length)
            return -1;
        int mini=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int j : arr) {
            mini = Math.min(j, mini);
            max = Math.max(j, max);
        }
//        for (int i = mini; i <max ; i++) {
//            if(possible(arr,i,m,k)){
//                return i;
//            }
//        }
//        return -1;
        // Binary search for the minimum number of days
        int low = mini;
        int high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid; // Try for fewer days
            } else {
                low = mid + 1; // Increase days
            }
        }

        return low;
    }
}
