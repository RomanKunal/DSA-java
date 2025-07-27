package RevisionWork.Arrays.Sorting;

import java.util.HashMap;

public class Ques27_7 {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Majority element is: " + majority(arr));
        System.out.println(maximumSubarray(arr));
    }

    // ✅ Find majority element using HashMap
    static int majority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > n / 2) {
                return i;
            }
        }

        // If no majority element found
        return -1;
    }
    // Maximum subarray sum
    static int maximumSubarray(int[] arr){
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j <arr.length ; j++) {
                sum+=arr[j];
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
    }
    // using kadane algo
    static long maxSubarraySum(int[] arr){
        long maxi=Long.MIN_VALUE;
        long sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
    //Stock buy and sell
    static int stockBuy(int[] arr){
        int maxprofit=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    maxprofit=Math.max(arr[j]-arr[i],maxprofit);
                }
            }
        }
        return maxprofit;
    }
}
