package RevisionWork.Arrays.Sorting.DP;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquepath(3,7));
        System.out.println(uniquePathByDP(3,7));

    }
    // Using recursion
    static int uniquepath(int m,int n){
        if(m==1 && n==1) return 1;
        if(m<=0 || n<=0) return 0;
        int up=uniquepath(m-1,n);
        int left=uniquepath(m,n-1);
        return left+up;
    }
    // using DP
    static int uniquePathByDP(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return countPaths(m - 1, n - 1, dp); // start from bottom-right
    }

    static int countPaths(int i, int j, int[][] dp) {
        // base case: reached starting cell
        if (i == 0 && j == 0) return 1;
        if (i < 0 || j < 0) return 0;
        // already computed
        if (dp[i][j] != -1) return dp[i][j];
        int up = countPaths(i - 1, j, dp);
        int left = countPaths(i, j - 1, dp);
        return dp[i][j] = up + left;
    }
    // uniquePath 2
    static int unique2(int m,int n,int[][] dp,int[][] grid){
        if(m<0 || n<0) return 0;
        if(grid[m][n]==1) return 0;
        if(m==0 && n==0) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        int up=unique2(m-1,n,dp,grid);
        int left=unique2(m,n-1,dp,grid);
        return dp[m][n]=left+up;
    }
}
