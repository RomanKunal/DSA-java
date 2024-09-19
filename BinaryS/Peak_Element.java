package BinaryS;

public class Peak_Element {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        System.out.println(optimal(arr));
    }
//    static int brute(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            if ((i == 0 || arr[i] > arr[i - 1]) && (i == arr.length - 1 || arr[i] > arr[i + 1])) {
//                return arr[i];
//            }
//        }
//        return -1;
//
//    }
static int optimal(int[] arr) {
    int n = arr.length;
    if (n == 0) {
        return -1; // Return -1 if array is empty
    }
    if (n == 1) {
        return 0; // Only one element, it is the peak
    }

    int low = 0;
    int high = n - 1;

    // Check for peak at the first and last position
    if (arr[0] > arr[1]) {
        return 0;
    }
    if (arr[n - 1] > arr[n - 2]) {
        return n - 1;
    }

    // Binary search for peak
    while (low <= high) {
        int mid = low + (high - low) / 2;

        // Check if mid is a peak
        if (mid > 0 && mid < n - 1) {
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid; // Peak element found
            }
            // If the left neighbor is greater, the peak lies on the left side
            if (arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                // Otherwise, the peak lies on the right side
                low = mid + 1;
            }
        }
    }
    return -1; // Should never reach here if input is valid
}

}
