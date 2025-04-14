package RevisionForPlacement.Arrays;

public class KadaneAlog {
    public static void main(String[] args) {

    }
//    static long check(int[] arr){
//        long maxi=Long.MIN_VALUE;
//        long sum=0;
//        for (int i = 0; i <arr.length ; i++) {
//            sum+=arr[i];
//            if(sum>maxi){
//                maxi=sum;
//            }
//            if(sum<0){
//                sum=0;
//            }
//        }
//        return maxi;
//    }
    //for contiguos sum
    static int maxSubarraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        int start = 0;       // start of current subarray
        int tempStart = 0;   // potential new start
        int end = 0;         // end of max subarray

        for (int i = 1; i < arr.length; i++) {
            if (currentSum < 0) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        return maxSum;
    }
}