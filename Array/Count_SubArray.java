package Array;

public class Count_SubArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int k=3;
        System.out.println(brute(arr,k));
    }
    static int brute(int[] nums,int k){
        int n = nums.length; // size of the given array.
        int cnt = 0; // Number of subarrays:

        for (int i = 0 ; i < n; i++) { // starting index i
            int sum = 0;
            for (int j = i; j < n; j++) { // ending index j
                // calculate the sum of subarray [i...j]
                // sum of [i..j-1] + nums[j]
                sum += nums[j];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    }
}