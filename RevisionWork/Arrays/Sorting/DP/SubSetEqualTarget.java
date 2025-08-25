package RevisionWork.Arrays.Sorting.DP;

public class SubSetEqualTarget {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int target=4;
        System.out.println(subset(arr.length-1,target,arr));

    }
    // using recursion
    static boolean subset(int index,int target,int[] arr){
        if(target==0) return true;
        if(index==0) return arr[0]==target;
        boolean nottake=subset(index-1,target,arr);
        boolean take=false;
        if(target>=arr[index]){
            take=subset(index-1,target-arr[index],arr);
        }
        return take||nottake;
    }
    // using memoization
    static boolean subsetusingmem(int index,int target,int[] arr,Boolean[][] dp){
        if(target==0) return true;
        if(index==0) return arr[0]==target;
        if(dp[index][target]!=null) return dp[index][target];
        boolean nottake=subsetusingmem(index-1,target,arr,dp);
        boolean take=false;
        if (target>=arr[index]){
            take=subsetusingmem(index-1,target-arr[index],arr,dp);
        }
        return dp[index][target]=take||nottake;
    }
}
