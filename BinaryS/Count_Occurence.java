package BinaryS;

public class Count_Occurence {
    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 8;
        int ans = count(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);
    }
    static int first(int[] arr,int n ,int key) {
        int low = 0;
        int high =n-1;
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
    static int last(int[] arr,int n, int key) {
        int low = 0;
        int high = n - 1;
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

    public static int[] firstAndLastPosition(int[] arr, int n, int k) {
        int first = first(arr, n, k);
        if (first == -1) return new int[] { -1, -1};
        int last = last(arr, n, k);
        return new int[] {first, last};
    }
    public static int count(int arr[], int n, int x) {
        int[] ans = firstAndLastPosition(arr, n, x);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

}
