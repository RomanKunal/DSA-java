package RevisionWork.Arrays.Sorting.DP;

public class EqualPartitionOrNot {
    public static void main(String[] args) {
        int[] arr={1,5,11,5};
        System.out.println(canPartition(arr));
    }
    static boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;
        int target = sum / 2;
        Boolean[][] dp = new Boolean[n][target + 1];
        return solve(n - 1, target, nums, dp);
    }
    static boolean solve(int index,int target,int [] arr,Boolean[][] dp){
        if(target==0) return true;
        if(index==0) return arr[0]==target;
        if(dp[index][target]!=null) return dp[index][target];
        boolean nottake=solve(index-1,target,arr,dp);
        boolean take=false;
        if(target>=arr[index]){
            take=solve(index-1,target-arr[index],arr,dp);
        }
        return dp[index][index]=take||nottake;
    }
}
