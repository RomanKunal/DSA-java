package Array;

public class Max_SubArray {
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(optimal(arr));
    }
//    static int brute(int[] arr,int maximum){
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i; j <arr.length ; j++) {
//                int sum=0;
//                for (int k = i; k <j ; k++) {
//                    sum+=arr[k];
//                    maximum=Math.max(sum,maximum);
//                }
//            }
//        }
//        return maximum;
//    }


    //BETTER CODE
//    static int better(int [] arr,int maximum){
//        for (int i = 0; i <arr.length ; i++) {
//            int sum=0;
//            for (int j = i; j <arr.length ; j++) {
//                sum+=arr[j];
//                maximum=Math.max(sum,maximum);
//            }
//        }
//        return maximum;
//    }




    //OPTIMAL CODE
    static long optimal(int[] nums){
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        return maxi;
    }
}
