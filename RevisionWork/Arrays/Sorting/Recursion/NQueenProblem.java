package RevisionWork.Arrays.Sorting.Recursion;
import java.util.*;
public class NQueenProblem {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        for (List<String> sol : solutions) {
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
    // N queen problem
    static void solve(int row, List<List<String>> ans, char[][] board,
          int[] leftrow, int[] upperDia, int[] lowerDia, int n)
    {
        if(row==n){
            List<String> temp=new ArrayList<>();
            for (char[] ch:board) {
                temp.add(new String(ch));
            }
            ans.add(temp);
            return;
        }
        for (int col = 0; col <n ; col++) {
            if(leftrow[col]==0 && lowerDia[row+col]==0 && upperDia[n-1+col-row]==0){
                board[row][col]='Q';
                leftrow[col]=1;
                lowerDia[row+col]=1;
                upperDia[n-1+col-row]=1;
                solve(row+1,ans,board,leftrow,upperDia,lowerDia,n);
                board[row][col]='.';
                leftrow[col]=0;
                lowerDia[row+col]=0;
                upperDia[n-1+col-row]=0;
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        int[] leftrow = new int[n];           // Track columns
        int[] lowerDia = new int[2 * n - 1];  // Track lower diagonals
        int[] upperDia = new int[2 * n - 1];  // Track upper diagonals
        solve(0, ans, board, leftrow, upperDia, lowerDia, n);
        return ans;
    }
}
