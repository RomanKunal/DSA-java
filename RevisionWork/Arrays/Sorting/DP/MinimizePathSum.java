package RevisionWork.Arrays.Sorting.DP;

public class MinimizePathSum {
    public static void main(String[] args) {

    }
    static int minsum(int m,int n,int[][] grid,int[][] dp){
        if(m==0 && n==0) return grid[0][0];
        if(m<0 || n<0) return Integer.MAX_VALUE;
        if(dp[m][n]!=-1) return dp[m][n];
        int up=minsum(m-1,n,grid,dp);
        int left=minsum(m,n-1,grid,dp);
        return dp[m][n]=grid[m][n]+Math.min(left,up);
    }
}
