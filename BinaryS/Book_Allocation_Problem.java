package BinaryS;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        int[] arr={25,46,28,49,24};
        int student=4;
        System.out.println(brute(arr,student));

    }
    static int student(int[] arr, int pages) {
        int stupages = 0;
        int stud = 1;
        for (int i = 0; i < arr.length; i++) {
            if ((stupages + arr[i]) <= pages) {
                stupages += arr[i];
            } else {
                // Assign the current book to a new student
                stupages = arr[i];
                stud++;
            }
        }
        return stud;
    }

    static int brute(int[] arr, int pages) {
        // Find the minimum (the largest book) and maximum (sum of all books) possible page counts
        int low = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            low = Math.max(arr[i], low);
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Perform a binary search between 'low' and 'sum'
        while (low <= sum) {
            int mid = low + (sum - low) / 2;
            int count = student(arr, mid);

            if (count > pages) {
                // Too many students needed, increase the allowed page count
                low = mid + 1;
            } else {
                // Check if we can minimize the page count further
                sum = mid - 1;
            }
        }

        // 'low' will be the answer after the loop ends
        return low;
    }
}
